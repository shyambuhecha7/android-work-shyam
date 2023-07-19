package com.example.androidwebservices.utils.okhttp

import okhttp3.Interceptor
import okhttp3.Response

class CustomInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        //MARK: MODIFY REQUEST.
        val request = chain.request()

        val modifiedRequest = request.newBuilder()
            .addHeader("Content-Type", "application/json")
            .addHeader("Accept", "application/json")
            .build()
        print("Modified Request: $modifiedRequest")

        val response = chain.proceed(modifiedRequest)

        val code = response.code
        print("response code: $code")

        return response
    }
}
