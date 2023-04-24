package io.behzod.data.preference.audio

enum class AudioConvert(val code: Int, val description: String) {
  MP3(0, "mp3"),
  MP4(1, "m4a"),
  NOT_SPECIFIED(2, "NOT SPECIFIED"),
  ;

  companion object {
    fun fromCode(code: Int): AudioConvert {
      return values().find { it.code == code } ?: NOT_SPECIFIED
    }
  }
}
