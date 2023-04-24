package io.behzod.data.preference.video

enum class VideoFormat(val code: Int, val description: String) {
  NOT_SPECIFIED(0, "NOT SPECIFIED"),
  MP4(1, "MP4"),
  VP9(2, "VP9"),
  AV1(3, "AV1");

  companion object {
    fun fromCode(code: Int) = values().find {
      it.code == code
    } ?: NOT_SPECIFIED
  }
}



