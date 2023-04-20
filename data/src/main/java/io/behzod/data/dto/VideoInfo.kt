package io.behzod.data.dto

import kotlinx.serialization.SerialName

data class VideoInfo(
  val id: String = "",
  val title: String = "",
  val videoFormats: List<VideoFormat>? = emptyList(),
  val thumbnail: String? = null,
  val description: String? = null,
  val uploader: String? = null,
  val duration: Double? = null,
  @SerialName(VIEW_COUNT) val viewCount: Long? = null,
  @SerialName(WEBPAGE_URL) val webpageUrl: String? = null,
  val tags: List<String>? = emptyList(),
  @SerialName(LIVE_STATUS) val liveStatus: String? = null,
  @SerialName(COMMENT_COUNT) val commentCount: Int? = null,
  val chapters: List<String> = emptyList(),
  @SerialName(LIKE_COUNT) val likeCount: Int? = null,
  val uploadDate: String? = null,
  val availability: String? = null,
  @SerialName("original_url") val originalUrl: String? = null,
  @SerialName("webpage_url_basename") val webpageUrlBasename: String? = null,
  @SerialName("webpage_url_domain") val webpageUrlDomain: String? = null,
  val extractor: String? = null,
  @SerialName("extractor_key") val extractorKey: String = "",
  val playlist: String? = null,
  @SerialName("playlist_index") val playlistIndex: Int? = null,
  @SerialName("display_id") val displayId: String? = null,
  val fullTitle: String? = null,
  @SerialName("duration_string") val durationString: String? = null,
  @SerialName("release_date") val releaseDate: String? = null,
  val format: String? = null,
  @SerialName("format_id") val formatId: String? = null,
  val ext: String = "",
  val protocol: String? = null,
  @SerialName("format_note") val formatNote: String? = null,
  @SerialName("filesize_approx") val fileSizeApprox: Double? = null,
  @SerialName("filesize") val fileSize: Double? = null,
  val tbr: Double? = null,
  val width: Int? = null,
  val height: Int? = null,
  val resolution: String? = null,
  val fps: Double? = null,
  @SerialName("dynamic_range") val dynamicRange: String? = null,
  @SerialName(V_CODEC) val vCodec: String? = null,
  val vbr: Double? = null,
  @SerialName(A_CODEC) val aCodec: String? = null,
  val abr: Double? = null,
  val asr: Int? = null,
  val epoch: Int? = null,
  @SerialName(TYPE) val type: String? = null,
) : DownloadDetails {
  companion object {
    private const val VIEW_COUNT = "view_count"
    private const val WEBPAGE_URL = "webpage_url"
    private const val LIVE_STATUS = "live_status"
    private const val COMMENT_COUNT = "comment_count"
    private const val LIKE_COUNT = "like_count"
    private const val TYPE = "_type"
    private const val A_CODEC = "acodec"
    private const val V_CODEC = "vcodec"
  }
}
