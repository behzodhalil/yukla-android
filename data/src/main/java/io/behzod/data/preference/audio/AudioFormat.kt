package io.behzod.data.preference.audio

enum class AudioFormat(val code: Int, val description: String) {
  NOT_SPECIFIED(0, "NOT SPECIFIED"),
  OPUS(1, "OPUS"),
  M4A(2, "MP4");

  companion object {
    fun fromCode(code: Int): AudioFormat {
      return values().find { it.code == code } ?: NOT_SPECIFIED
    }
  }
}
