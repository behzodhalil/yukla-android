package io.behzod.uicomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CategoryButton(
  onClick: () -> Unit,
  backgroundColor: Color,
  imageVector: ImageVector,
) {
  Box(
    contentAlignment = Alignment.Center,
    modifier =
    Modifier
        .size(height = 100.dp, width = 85.dp)
        .clip(
            RoundedCornerShape(20.dp)
        )
        .background(
            color = backgroundColor.copy(alpha = 0.8f),
            shape = RoundedCornerShape(20.dp)
        )
        .clickable { onClick() }
  ) {
    Icon(
      modifier = Modifier.size(45.dp),
      tint = Color(0xff72688b).copy(alpha = 0.6f),
      imageVector = imageVector, contentDescription = "Category Butotn"
    )
  }
}

