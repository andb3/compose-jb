package org.jetbrains.compose.common.foundation.layout

import org.jetbrains.compose.common.internal.castOrCreate
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.web.css.flexBasis
import org.jetbrains.compose.web.css.flexGrow

actual fun Modifier.weight(fraction: Float): Modifier = castOrCreate().apply {
    add {
        flexGrow(fraction)
    }
}