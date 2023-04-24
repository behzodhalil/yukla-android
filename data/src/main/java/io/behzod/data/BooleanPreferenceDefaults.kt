package io.behzod.data

object BooleanPreferenceDefaults: PreferenceDefaults<Boolean> {

  override fun get(key: String): Boolean {
    return when(key) {
      "format_selection" -> true
      "configure" -> true
      "cellular_download" -> true
      "yt-dlp_auto_update" -> true
      "temp_dir" -> true
      else -> false
    }
  }
}
