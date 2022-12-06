package com.se7en.messenger.ui.screens.conversation.info

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.se7en.messenger.ui.screens.Routing

@Composable
fun Routing.Conversation.Info.TopBar(
    onBackPress: () -> Unit,
    onMoreClick: () -> Unit,
    backgroundColor: Color = MaterialTheme.colors.surface,
    contentColor: Color = contentColorFor(backgroundColor),
) {
    TopAppBar(
        title = {},
        navigationIcon = {
            IconButton(onClick = onBackPress) {
                Icon(Icons.Rounded.ArrowBack, "icon")
            }
        },
        actions = {
            IconButton(onClick = onMoreClick) {
                Icon(Icons.Rounded.MoreVert, "icon")
            }
        },
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        elevation = 0.dp
    )
}