package io.behzod.data.preference.audio

import io.behzod.data.preference.mmkv.MmkvStorage
import javax.inject.Inject

class AudioPreferenceStorage @Inject constructor(
  private val mmkvStorage: MmkvStorage
) {

  fun getAudioConvert(audioFormatCode: Int = mmkvStorage.getInt("audio_convert_format")): String {
    val format = AudioConvert.fromCode(audioFormatCode).description
    return "Convert to $format"
  }

  fun getAudioQuality(audioQuality: Int = mmkvStorage.getInt("audio_quality")): String {
    return AudioQuality.fromCode(audioQuality).description
  }

  fun getAudioFormat(audioFormatCode: Int = mmkvStorage.getInt("audio_format_preferred")): String {
    return AudioFormat.fromCode(audioFormatCode).description
  }
}



