package com.example.mylibrary;

import android.util.Log;

/**
 * Copyright (c) 2021 Pegadroid IQ Solutions Pvt. Ltd.
 **/

public class SampleSDK {

    private static final String TAG = "sample_sdk";

    public SampleSDK() {}

    public static void print(String message){
        Log.d(TAG, "Message: "+message);
    }

}
