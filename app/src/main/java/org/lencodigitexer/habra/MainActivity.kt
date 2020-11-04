package org.lencodigitexer.habra

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webview)
        webView.settings.javaScriptEnabled = true
        //webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.setWebViewClient(WebViewClient())
        webView.settings.domStorageEnabled = true

        
        webView.loadUrl("https://habra.js.org/")
    }
}