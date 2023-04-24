package io.behzod.data.di

import com.tencent.mmkv.MMKV
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.behzod.data.preference.mmkv.MmkvProvider
import io.behzod.data.preference.mmkv.MmkvStorage
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

  @Provides
  @Singleton
  fun providesMmkv(): MMKV {
    return MMKV.defaultMMKV()
  }

  @Provides
  @Singleton
  fun providesMmkvStorage(mmkv: MMKV): MmkvProvider {
    return MmkvStorage(mmkv)
  }
}
