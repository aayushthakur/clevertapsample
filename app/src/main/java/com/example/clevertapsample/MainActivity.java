package com.example.clevertapsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());

        findViewById(R.id.sendButton).setOnClickListener(v -> {
            //do
            //something
            if (clevertapDefaultInstance!=null) {
                // event with properties
                HashMap<String, Object> prodViewedAction = new HashMap<String, Object>();
                prodViewedAction.put("Product Name", "CleverTap");
                prodViewedAction.put("Product Image", "https://d35fo82fjcw0y8.cloudfront.net/2018/07/26020307/customer-success-clevertap.jpg");
                prodViewedAction.put("Product ID", 1);
                prodViewedAction.put("Email", "aayush.thakur14@gmail.com");
                clevertapDefaultInstance.pushEvent("Product viewed", prodViewedAction);
            }
        });
    }
}