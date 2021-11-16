// Generated by Dagger (https://google.github.io/dagger).
package com.quran.labs.androidquran.ui.helpers;

import com.quran.labs.androidquran.data.QuranInfo;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class QuranRowFactory_Factory implements Factory<QuranRowFactory> {
  private final Provider<QuranInfo> quranInfoProvider;

  public QuranRowFactory_Factory(Provider<QuranInfo> quranInfoProvider) {
    this.quranInfoProvider = quranInfoProvider;
  }

  @Override
  public QuranRowFactory get() {
    return new QuranRowFactory(quranInfoProvider.get());
  }

  public static QuranRowFactory_Factory create(Provider<QuranInfo> quranInfoProvider) {
    return new QuranRowFactory_Factory(quranInfoProvider);
  }
}