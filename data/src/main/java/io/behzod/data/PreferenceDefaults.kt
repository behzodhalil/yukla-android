package io.behzod.data

interface PreferenceDefaults<T> {
  fun get(key: String): T
}
