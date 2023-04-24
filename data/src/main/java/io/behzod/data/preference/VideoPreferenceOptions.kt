package io.behzod.data.preference

import io.behzod.data.preference.mmkv.MmkvStorage
import javax.inject.Inject

object VideoPreferenceOptions {
  @Inject
  lateinit var mmkvStorage: MmkvStorage

  fun getPlaylist(): Boolean {
    return mmkvStorage.getBoolean("")
  }
}
