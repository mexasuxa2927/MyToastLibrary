package com.example.mytoastlibrary

import android.content.Context
import android.widget.Toast

class MyToastLibrary {


    companion object {
        fun toasty(context: Context,str:String){
            Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
        }
    }
}