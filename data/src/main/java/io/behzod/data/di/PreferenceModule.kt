package io.behzod.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.behzod.data.preference.mmkv.MmkvStorage
import io.behzod.data.preference.audio.AudioPreferenceStorage
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PreferenceModule {

  @Provides
  @Singleton
  fun provideAudioPreference(mmkvStorage: MmkvStorage): AudioPreferenceStorage {
    return AudioPreferenceStorage(mmkvStorage)
  }
}
