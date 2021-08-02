package org.jetbrains.compose.common.foundation

import org.jetbrains.compose.common.ui.unit.Dp
import org.jetbrains.compose.common.core.graphics.Color
import org.jetbrains.compose.common.internal.StyleModifier
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.common.internal.castOrCreate
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.RGB

actual fun Modifier.border(size: Dp, color: Color): Modifier = this then StyleModifier {
    border(size.value.px, LineStyle.Solid, rgb(color.red, color.green, color.blue))
    margin(-size.value.px) //In CSS, the border has size, but in other Jetpack Compose implementations, it does not, so ignore the added margin from the border
}
