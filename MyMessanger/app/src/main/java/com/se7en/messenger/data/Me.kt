package com.se7en.messenger.data

import com.se7en.messenger.data.models.Name
import com.se7en.messenger.data.models.Picture
import com.se7en.messenger.data.models.User

val me = User(
    id = "000-000-0000",
    name = Name(first = "John", last = "Doe"),
    picture = Picture(
        thumbnail = "https://picsum.photos/id/1005/45/45",
        medium = "https://picsum.photos/id/1005/72/72",
        large = "https://picsum.photos/id/1005/128/128"
    )
)
