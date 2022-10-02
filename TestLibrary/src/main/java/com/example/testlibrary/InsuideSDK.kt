package com.example.testlibrary

import android.content.Context
import android.content.Intent

class InsuideSDK {

         fun OpenSdkScreen(c: Context) {
             var intent: Intent? = null
             try {
                 intent = Intent(c, Class.forName("com.example.buglibrary.SDKActivity"))
                 c.startActivity(intent)
             } catch (e: ClassNotFoundException) {
                 e.printStackTrace()
             }
         }



}