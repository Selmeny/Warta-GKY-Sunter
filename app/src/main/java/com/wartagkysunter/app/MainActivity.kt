package com.wartagkysunter.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview: WebView = findViewById(R.id.myWebview)
        webview.webViewClient = WebViewClient()
        webview.settings.builtInZoomControls = true
        webview.settings.displayZoomControls = false
        webview.loadUrl("https://gkysunter.org/warta")
    }
}
