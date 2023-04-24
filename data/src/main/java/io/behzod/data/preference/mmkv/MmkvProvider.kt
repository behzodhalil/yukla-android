package io.behzod.data.preference.mmkv


interface MmkvProvider {
  fun getInt(key: String): Int
  fun setInt(key: String, value: Int): Boolean
  fun getString(key: String): String?
  fun setString(key: String, value: String): Boolean
  fun getBoolean(key: String): Boolean
  fun setBoolean(key: String, value: Boolean): Boolean

  fun containsKey(key: String): Boolean
}
