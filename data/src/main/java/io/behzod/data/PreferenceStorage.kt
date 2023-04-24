package io.behzod.data

interface PreferenceStorage {
  operator fun invoke(code: Int)
}
