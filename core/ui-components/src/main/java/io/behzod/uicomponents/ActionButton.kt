package io.behzod.uicomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionButton(
  text: String,
  color: Color,
  isTransparency: Boolean,
  textColor: Color,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  textStyle: TextStyle = MaterialTheme.typography.button
) {
  Box(
    contentAlignment = Alignment.Center,
    modifier =
    modifier
        .clip(RoundedCornerShape(20.dp))
        .border(
            width = 2.dp,
            color = color,
            shape = RoundedCornerShape(20.dp)
        )
        .background(
            color = if (isTransparency) Color.Transparent else color,
            shape = RoundedCornerShape(20.dp)
        )
        .clickable {
            onClick()
        }
  ) {
    Text(
      text = text,
      modifier = modifier.padding(12.dp),
      fontSize = 16.sp,
      color = textColor,
    )
  }
}

@Preview
@Composable
fun ActionButtonPreview() {
  ActionButton(
    text = stringResource(id = R.string.downloads),
    color = Color.DarkGray,
    isTransparency = false,
    textColor = Color.White,
    onClick = { }
  )
}

@Preview
@Composable
fun TextButtonPreview() {

  Surface() {
    TextButton(
      modifier = Modifier.padding(8.dp),
      shape = RoundedCornerShape(12.dp),
      colors = ButtonDefaults.buttonColors(
        backgroundColor = Color.DarkGray,
        contentColor = Color.White
      ),
      onClick = { /*TODO*/ }) {
      Text(text = stringResource(id = R.string.download))

    }
  }

}
