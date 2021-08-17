package org.jetbrains.compose.common.foundation.layout

import org.jetbrains.compose.common.ui.Modifier


expect interface RowScope {
    fun Modifier.weight(fraction: Float, fill: Boolean = true): Modifier
}