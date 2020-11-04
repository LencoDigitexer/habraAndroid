package org.lencodigitexer.habra

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mWebView = findViewById<WebView>(R.id.webview)
        mWebView.settings.javaScriptEnabled = true
        //webView.settings.javaScriptCanOpenWindowsAutomatically = true
        mWebView.setWebViewClient(WebViewClient())
        mWebView.settings.domStorageEnabled = true
        mWebView.settings.allowFileAccessFromFileURLs = true

        mWebView.loadUrl("https://habra.js.org/")
    }
    override fun onBackPressed() {
        val mWebView = findViewById<WebView>(R.id.webview)
        if (mWebView.canGoBack()) {
            mWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}