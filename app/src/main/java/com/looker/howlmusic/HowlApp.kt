package com.looker.howlmusic

import android.app.Application
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ProvideWindowInsets
import com.looker.howlmusic.ui.theme.HowlMusicTheme

class HowlApp : Application()

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    HowlMusicTheme {
        ProvideWindowInsets { Surface(modifier = Modifier.fillMaxSize(), content = content) }
    }
}