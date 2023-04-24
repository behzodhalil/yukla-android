package io.behzod.data.preference.video

import io.behzod.data.preference.mmkv.MmkvStorage
import javax.inject.Inject

class VideoPreferenceStorage @Inject constructor(
  private val mmkvStorage: MmkvStorage
) {

  fun getVideoFormat(videoCode: Int = mmkvStorage.getInt("quality")): String {
    return VideoFormat.fromCode(videoCode).description
  }

  fun getVideoQuality(videoQualityCode: Int = mmkvStorage.getInt("quality")): String {
    return VideoResolution.fromCode(videoQualityCode).description
  }

}
