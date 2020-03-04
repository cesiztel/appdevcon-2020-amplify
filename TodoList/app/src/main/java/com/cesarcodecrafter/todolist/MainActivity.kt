package com.cesarcodecrafter.todolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.amazonaws.mobile.config.AWSConfiguration
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient

class MainActivity : AppCompatActivity() {

    private var apiClient: AWSAppSyncClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiClient = AWSAppSyncClient.builder()
            .context(applicationContext)
            .awsConfiguration(AWSConfiguration(applicationContext))
            .build()
    }
}
