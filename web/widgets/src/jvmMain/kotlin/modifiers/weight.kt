package org.jetbrains.compose.common.foundation.layout

import org.jetbrains.compose.common.internal.castOrCreate
import org.jetbrains.compose.common.ui.Modifier

actual interface RowScope {
    actual fun Modifier.weight(fraction: Float, fill: Boolean): Modifier
}

fun androidx.compose.foundation.layout.RowScope.toMultiplatformRowScope(): RowScope = object : RowScope {
    override fun Modifier.weight(fraction: Float, fill: Boolean): Modifier = castOrCreate().apply {
        modifier = modifier.weight(fraction, fill)
    }
}