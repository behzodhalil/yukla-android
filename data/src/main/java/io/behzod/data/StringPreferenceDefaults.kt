package io.behzod.data

import io.behzod.data.preference.defaults.StringDefaults

object StringPreferenceDefaults : PreferenceDefaults<String> {

  override fun get(key: String): String {
    return StringDefaults.fromLabel(key).value
  }

}
