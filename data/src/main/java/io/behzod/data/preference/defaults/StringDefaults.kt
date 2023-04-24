package io.behzod.data.preference.defaults

enum class StringDefaults(val label: String, val value: String) {
  SPONSOR_BLOCK(label = "sponsorblock_categories", value = "default"),
  MAX_RATE(label = "max_rate", value = "1000"),
  PATH(label = "path_template", value = "%(uploader)s/%(playlist_title)s/"),
  SUB_LANG(label = "sub_lang", value = "en.*,.*-orig"),
  NOT_SPECIFIED(label = "not_specified", "");

  companion object {
    fun fromLabel(label: String): StringDefaults {
      return values().find { it.label == label } ?: NOT_SPECIFIED
    }
  }
}
