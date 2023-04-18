package io.behzod.uicomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopButton(
  modifier: Modifier = Modifier,
  imageVector: ImageVector,
  contentColor: Color = Color.White
) {
  val mediumDp = 16.dp
  val smallWidth = 2.dp
  val roundedCornerShape = RoundedCornerShape(mediumDp)

  Box(
    contentAlignment = Alignment.Center,
    modifier = modifier
      .padding(12.dp)
      .size(65.dp)
      .background(color = Color(0xff564d79), shape = roundedCornerShape)
      .border(width = smallWidth, shape = roundedCornerShape, color = Color.White.copy(alpha = 0.5f))
  )
  {
    Icon(imageVector = imageVector, tint = contentColor, contentDescription = "")
  }
}

@Preview
@Composable
fun ConfigureButtonPreview() {
  Surface {
    TopButton(imageVector = Icons.Default.Cloud)
  }
}

