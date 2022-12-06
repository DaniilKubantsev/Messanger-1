package com.se7en.messenger.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.se7en.messenger.ui.theme.typography

@Preview
@Composable
fun SearchButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier.fillMaxWidth(),
    backgroundColor: Color = MaterialTheme.colors.surface,
    contentColor: Color = contentColorFor(backgroundColor),
    elevation: Dp = 0.dp
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        elevation = ButtonDefaults.elevation(elevation)
    ) {
        Icon(imageVector = Icons.Filled.Search, "icon")
        Text(text = "Search", style = typography.body1)
    }
}
