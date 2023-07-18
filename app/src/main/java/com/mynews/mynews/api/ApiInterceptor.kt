package com.mynews.mynews.api

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

//codersee.com implementation

object ApiInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()//Cryptocurrencies adds .newBuilder()
        //Cryptocurrencies adds
        //.addHeader(name:"...", value:"API_KEY")
        //.build()

        Log.d("Intercepter Run","Outgoing request to ${request.url()}")
        println("Outgoing request to ${request.url()}")
        return chain.proceed(request)
    }
}