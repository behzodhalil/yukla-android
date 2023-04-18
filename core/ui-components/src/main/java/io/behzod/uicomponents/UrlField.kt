package io.behzod.uicomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun UrlField(
  modifier: Modifier = Modifier,
  url: String,
  onDone: () -> Unit,
  onValueChanged: (String) -> Unit
) {
  val focusRequester = remember { FocusRequester() }
  val focusManager = LocalFocusManager.current
  val keyboardController = LocalSoftwareKeyboardController.current

  TextField(
    value = url,
    modifier = modifier
      .fillMaxWidth()
      .background(shape = RoundedCornerShape(10.dp), color = Color(0xff4e3d71))
      .border(width = 0.dp, color = Color(0xff4e3d71), shape = RoundedCornerShape(10.dp))
      .focusRequester(focusRequester),
    onValueChange = onValueChanged,
    maxLines = 3,
    placeholder = {
      Text(text = "Paste post link here", color = Color.White.copy(alpha = 0.5f))
    },
    leadingIcon = {
      Icon(imageVector = Icons.Outlined.Bolt, contentDescription = "")
    },
    keyboardActions = KeyboardActions(onDone = {
      keyboardController?.hide()
      focusManager.moveFocus(FocusDirection.Down)
      onDone()
    })
  )
}

@Preview
@Composable
fun UrlFieldPreview() {
  Surface {
    UrlField(url = "", onValueChanged = {}, onDone = {})
  }
}
