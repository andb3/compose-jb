package org.jetbrains.compose.common.internal

import androidx.compose.runtime.Composable
import org.jetbrains.compose.common.internal.ActualModifier
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.common.ui.asAttributeBuilderApplier
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.Node

@Composable
fun ModifierWrapperLayout(modifier: Modifier, content: @Composable () -> Unit) {
    val wrappedContent = modifier.foldOut(content) { element, innerContent ->
        {
            Div( attrs = element.asAttributeBuilderApplier() ) {
                innerContent()
            }
        }
    }
    wrappedContent()
}