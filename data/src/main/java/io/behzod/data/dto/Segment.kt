package io.behzod.data.dto

import kotlinx.serialization.SerialName

/**
 * The [Segment] class used to store the information of a single video segment that is downloaded using YoutubeDL.
 */
@kotlinx.serialization.Serializable
data class Segment(
  val title: String? = null,
  @SerialName(START_TIME) val startTime: Double? = null,
  @SerialName(END_TIME) val endTime: Double? = null
) {
  companion object {
    /**
     * The key used to serialize/deserialize the 'start_time'.
     */
    private const val START_TIME = "start_time"
    /**
     * The key used to serialize/deserialize the 'end_time'.
     */
    private const val END_TIME = "end_time"
  }
}
