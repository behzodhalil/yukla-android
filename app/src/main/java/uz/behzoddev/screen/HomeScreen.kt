package uz.behzoddev.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.behzoddev.yukla.R
import uz.behzoddev.yukla.ui.poppins

@Composable
fun HomeScreen() {
  Column(
    modifier = Modifier.fillMaxSize()
  ) {
    TopHome()
    TitleHome()
  }
}

@Composable
private fun TopHome() {
  Row(
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically
  ) {
    Card(
      modifier = Modifier
        .padding(start = 16.dp, top = 16.dp)
        .size(size = 48.dp),
      shape = RoundedCornerShape(16),
      elevation = 2.dp,
    ) {
      Image(
        painter = painterResource(id = R.drawable.ic_settings),
        contentDescription = "The icon of settings",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize(),
        colorFilter = ColorFilter.tint(color = Color.DarkGray)
      )
    }

    Spacer(modifier = Modifier.weight(1F))

    Card(
      modifier = Modifier
        .padding(start = 24.dp, top = 24.dp)
        .size(size = 48.dp),
      shape = RoundedCornerShape(16),
      elevation = 2.dp,
    ) {
      Image(
        painter = painterResource(id = R.drawable.ic_menu),
        contentDescription = "The icon of settings",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize(),
        colorFilter = ColorFilter.tint(color = Color.DarkGray)
      )
    }

  }
}

@Composable
private fun TitleHome(modifier: Modifier = Modifier) {
  Column(modifier = modifier.padding(start = 24.dp, top = 16.dp)) {
    Text(
      text = "Yukla", color = Color.White, fontSize = 24.sp,
      fontFamily = poppins,
      fontWeight = FontWeight.Normal,
    )

    Text(
      text = "a downloader app for images and videos", color = Color.White, fontSize = 16.sp,
      fontFamily = poppins,
      fontWeight = FontWeight.Normal,
    )

  }

}

@Composable
private fun LinkUi() {

}

@Preview
@Composable
fun HomePreview() {
  HomeScreen()
}
