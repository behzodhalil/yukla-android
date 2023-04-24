package io.behzod.data.preference.mmkv

import com.tencent.mmkv.MMKV
import io.behzod.data.BooleanPreferenceDefaults
import io.behzod.data.IntPreferenceDefaults
import io.behzod.data.StringPreferenceDefaults
import javax.inject.Inject

class MmkvStorage @Inject constructor(
  private val mmkv: MMKV
): MmkvProvider {

  override fun getInt(key: String): Int = mmkv.decodeInt(key, IntPreferenceDefaults.get(key))
  override fun setInt(key: String, value: Int) = mmkv.encode(key, value)

  override fun getString(key: String): String? = mmkv.decodeString(key, StringPreferenceDefaults.get(key))
  override fun setString(key: String, value: String) = mmkv.encode(key, value)

  override fun getBoolean(key: String): Boolean = mmkv.decodeBool(key, BooleanPreferenceDefaults.get(key))
  override fun setBoolean(key: String, value: Boolean) = mmkv.encode(key, value)

  override fun containsKey(key: String) = mmkv.containsKey(key)

}
