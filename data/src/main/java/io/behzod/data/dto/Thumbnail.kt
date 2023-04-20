package io.behzod.data.dto

import kotlinx.serialization.Serializable


@Serializable
data class Thumbnail(
  val url: String,
  val height: Int = 0,
  val width: Int = 0
)
