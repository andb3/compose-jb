package org.jetbrains.compose.common.ui.draw

import jetbrains.compose.common.shapes.*
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.common.internal.castOrCreate
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

actual fun Modifier.clip(shape: Shape): Modifier = castOrCreate().apply {
    add {
        when (shape) {
            is RoundedCornerShape -> when(shape.topStart) {
                //TODO: add rtl support
                is PercentCornerSize -> borderRadius(
                    topLeft = (shape.topStart as PercentCornerSize).percent.percent,
                    topRight = (shape.topEnd as PercentCornerSize).percent.percent,
                    bottomLeft = (shape.bottomStart as PercentCornerSize).percent.percent,
                    bottomRight = (shape.bottomEnd as PercentCornerSize).percent.percent,
                )
                is DpCornerSize -> borderRadius(
                    topLeft = (shape.topStart as DpCornerSize).size.value.px,
                    topRight = (shape.topEnd as DpCornerSize).size.value.px,
                    bottomLeft = (shape.bottomStart as DpCornerSize).size.value.px,
                    bottomRight = (shape.bottomEnd as DpCornerSize).size.value.px,
                )
            }
        }
    }

}
