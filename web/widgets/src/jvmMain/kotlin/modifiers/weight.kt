package org.jetbrains.compose.common.foundation.layout

import androidx.compose.foundation.layout.RowScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.Measured
import org.jetbrains.compose.common.internal.castOrCreate
import org.jetbrains.compose.common.ui.Modifier

actual fun Modifier.weight(fraction: Float): Modifier = castOrCreate().apply {
    modifier = modifier.weight(fraction)
}