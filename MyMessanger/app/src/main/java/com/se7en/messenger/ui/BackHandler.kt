package com.se7en.messenger.ui

import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcherOwner
import androidx.compose.runtime.*


@Composable
fun backPressHandler(onBackPressed: () -> Unit, enabled: Boolean = true) {
    val dispatcher = AmbientBackPressedDispatcher.current.onBackPressedDispatcher

    val backCallback = remember(onBackPressed) {
        object : OnBackPressedCallback(enabled) {
            override fun handleOnBackPressed() {
                onBackPressed()
            }
        }
    }

    onCommit(enabled) {
        backCallback.isEnabled = enabled
    }

    onCommit(dispatcher, onBackPressed) {
        // Whenever there's a new dispatcher set up the callback
        dispatcher.addCallback(backCallback)
        onDispose {
            backCallback.remove()
        }
    }
}

/**
 * This [Ambient] is used to provide an [OnBackPressedDispatcherOwner]:
 *
 * ```
 * Providers(BackPressedDispatcherAmbient provides requireActivity()) { }
 * ```
 *
 * and setting up the callbacks with [backPressHandler].
 */
val AmbientBackPressedDispatcher =
    staticAmbientOf<OnBackPressedDispatcherOwner> { error("Ambient used without Provider") }