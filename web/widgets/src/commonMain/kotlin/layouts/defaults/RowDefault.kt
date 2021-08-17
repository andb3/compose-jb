package org.jetbrains.compose.common.foundation.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.common.ui.Alignment
import org.jetbrains.compose.common.ui.Modifier

@Composable
fun Row(
    modifier: Modifier = Modifier.Companion,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    content: @Composable RowScope.() -> Unit
) { RowActual(modifier, horizontalArrangement, verticalAlignment, content) }
