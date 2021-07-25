package org.jetbrains.compose.common.ui

import org.jetbrains.compose.common.foundation.layout.Arrangement
import org.jetbrains.compose.common.foundation.layout.SpacedArrangement
import org.jetbrains.compose.common.ui.Alignment
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.StyleBuilder
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.px

fun StyleBuilder.horizontalArrangement(horizontalArrangement: Arrangement.Horizontal) {
    when(horizontalArrangement) {
        Arrangement.Start -> justifyContent(JustifyContent.FlexStart)
        Arrangement.Center -> justifyContent(JustifyContent.Center)
        Arrangement.End -> justifyContent(JustifyContent.FlexEnd)
        Arrangement.SpaceAround -> justifyContent(JustifyContent.SpaceAround)
        Arrangement.SpaceBetween -> justifyContent(JustifyContent.SpaceBetween)
        Arrangement.SpaceEvenly -> justifyContent(JustifyContent.SpaceEvenly)
        is SpacedArrangement.Horizontal -> {
            val direction = when(horizontalArrangement.alignment) {
                Alignment.Start -> JustifyContent.FlexStart
                Alignment.CenterHorizontally -> JustifyContent.Center
                else -> JustifyContent.FlexEnd
            }
            justifyContent(direction)
            property("gap", horizontalArrangement.space.value.px)
        }
    }
}