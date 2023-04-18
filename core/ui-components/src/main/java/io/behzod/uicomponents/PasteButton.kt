package io.behzod.uicomponents

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PasteButton(
  onClick: () -> Unit
) {
  FloatingActionButton(
    onClick = { onClick() }
  ) {
    Icon(
      imageVector = Icons.Outlined.ContentPaste,
      contentDescription = stringResource(id = R.string.paste)
    )
  }
}

@Preview
@Composable
fun PasteButtonPreview() {
  MaterialTheme() {
    PasteButton {}
  }
}
