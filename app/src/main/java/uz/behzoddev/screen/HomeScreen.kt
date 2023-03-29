package uz.behzoddev.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    LinkField()
  }
}

@Composable
private fun TopHome(
  modifier: Modifier = Modifier
) {
  Row(
    modifier = modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceAround
  ) {
    Box(modifier = modifier.weight(1F), contentAlignment = Alignment.TopStart) {
      Card(
        modifier = modifier
          .padding(16.dp)
          .size(size = 48.dp),
        shape = RoundedCornerShape(16),
        elevation = 2.dp
      ) {
        Image(
          painter = painterResource(id = R.drawable.ic_settings),
          contentDescription = "The icon of settings",
          contentScale = ContentScale.Crop,
          modifier = modifier.fillMaxSize(),
          colorFilter = ColorFilter.tint(color = Color.DarkGray)
        )
      }
    }


    Box(modifier = modifier.weight(1F), contentAlignment = Alignment.Center) {
      Text(
        text = "Yukla",
        color = Color.White,
        fontSize = 24.sp,
        fontFamily = poppins
      )
    }

    Box(modifier = modifier.weight(1F), contentAlignment = Alignment.TopEnd) {
      Card(
        modifier = modifier
          .padding(16.dp)
          .size(size = 48.dp),
        shape = RoundedCornerShape(16),
        elevation = 2.dp
      ) {
        Image(
          painter = painterResource(id = R.drawable.ic_settings),
          contentDescription = "The icon of settings",
          contentScale = ContentScale.Crop,
          modifier = modifier.fillMaxSize(),
          colorFilter = ColorFilter.tint(color = Color.DarkGray)
        )
      }
    }

  }
}


@Composable
private fun LinkField() {
  val text = remember {
    mutableStateOf("")
  }
  Row(
    modifier = Modifier
      .padding(top = 16.dp)
      .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
  ) {
    TextField(
      value = text.value,
      onValueChange = { newText ->
        text.value = newText
      },
      modifier = Modifier
        .padding(start = 24.dp, end = 24.dp)
        .padding(vertical = 4.dp),
      shape = RoundedCornerShape(48),
      leadingIcon = {
        Icon(imageVector = Icons.Default.Place, contentDescription = "Place Icon")
      },
      label = { Text(text = "Paste the link here...") },
      colors = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.White,
        focusedIndicatorColor = Color.Transparent
      )
    )

    DownloadButton()
  }


}

@Composable
fun DownloadButton(onDownload: () -> Unit = {}) {
  FloatingActionButton(onClick = { onDownload() }) {
    Icon(imageVector = Icons.Default.Done, contentDescription = "")
  }
}

@Preview
@Composable
fun HomePreview() {
  HomeScreen()
}
