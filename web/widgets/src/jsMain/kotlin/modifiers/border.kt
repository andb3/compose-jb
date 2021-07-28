package org.jetbrains.compose.common.foundation

import org.jetbrains.compose.common.ui.unit.Dp
import org.jetbrains.compose.common.core.graphics.Color
import org.jetbrains.compose.common.internal.StyleModifier
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.common.internal.castOrCreate
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.Color.RGB

actual fun Modifier.border(size: Dp, color: Color): Modifier = this then StyleModifier {
    border(size.value.px, LineStyle.Solid, RGB(color.red, color.green, color.blue))
}
