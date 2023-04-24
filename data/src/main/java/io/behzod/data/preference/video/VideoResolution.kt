package io.behzod.data.preference.video

enum class VideoResolution(val code: Int, val description: String) {
  ULTRA_HD(1, "2160p"),
  QUAD_HD(2, "1440p"),
  FULL_HD(3, "1080p"),
  HD(4, "720p"),
  FSD(5, "480p"),
  SD(6, "360p"),
  LOWEST(7, "LOWEST"),
  BEST(8, "BEST");

  companion object {
    fun fromCode(code: Int): VideoResolution {
      return values().find { it.code == code } ?: BEST
    }
  }
}
