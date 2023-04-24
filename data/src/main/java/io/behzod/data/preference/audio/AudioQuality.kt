package io.behzod.data.preference.audio

enum class AudioQuality(val code: Int, val description: String) {
  NOT_SPECIFIED(0, "Unlimited"),
  HIGH(1, "192 Kbps"),
  MEDIUM(2, "128 Kbps"),
  LOW(3, "64 Kbps"),
  ULTRA_LOW(4, "32 Kbps");

  companion object {
    fun fromCode(code: Int): AudioQuality {
      return values().find { it.code == code } ?: NOT_SPECIFIED
    }
  }
}
