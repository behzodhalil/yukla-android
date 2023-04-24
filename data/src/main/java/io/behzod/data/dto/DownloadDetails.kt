package io.behzod.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

sealed interface DownloadDetails

@Serializable
data class PlaylistResult(
  val uploader: String? = null,
  val availability: String? = null,
  val channel: String? = null,
  val title: String? = null,
  val description: String? = null,
  @SerialName("_type") val type: String? = null,
  val entries: List<Entries>? = emptyList(),
  @SerialName("webpage_url") val webpageUrl: String? = null,
  @SerialName("extractor_key") val extractorKey: String? = null,
) : DownloadDetails

@Serializable
data class Entries(
  @SerialName("_type") val type: String? = null,
  val ieKey: String? = null,
  val id: String? = null,
  val url: String? = null,
  val title: String? = null,
  val duration: Double? = .0,
  val uploader: String? = null,
  val channel: String? = null,
  val thumbnails: List<Thumbnail>? = emptyList(),
)
