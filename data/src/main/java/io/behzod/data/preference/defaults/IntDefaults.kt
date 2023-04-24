package io.behzod.data.preference.defaults

enum class IntDefaults(val label: String, val value: Int) {
  AUDIO_CONVERT("audio_convert_format", 0),
  AUDIO_QUALITY("audio_quality", 0),
  QUALITY("quality", 0),
  NOT_SPECIFIED("not_specified", 0);

  companion object {
    fun fromLabel(label: String): IntDefaults {
      return values().find { it.label == label } ?: NOT_SPECIFIED
    }
  }
}
