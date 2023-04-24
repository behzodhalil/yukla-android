package io.behzod.data

import io.behzod.data.preference.defaults.IntDefaults

object IntPreferenceDefaults : PreferenceDefaults<Int> {

  override fun get(key: String): Int {
    return IntDefaults.fromLabel(key).value
  }
}
