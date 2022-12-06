package com.se7en.messenger.data.models

enum class StoryStatus {
    AVAILABLE_SEEN, AVAILABLE_NOT_SEEN, UNAVAILABLE
}

data class Story(
    val user: User,
    val imageUrl: String,
    val thumbnailUrl: String,
    var status: StoryStatus,
    var time: String,
)