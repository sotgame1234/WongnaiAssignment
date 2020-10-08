package com.example.wongnaiassignment

import android.content.Context
import android.util.Log
import com.example.wongnaiassignment.api.CoinsObject
import com.example.wongnaiassignment.api.CryptoAPI
import com.example.wongnaiassignment.api.CryptoObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(private val context: IMain.View) :IMain.Presenter{
    override fun loadData() {
        CryptoAPI().getData().enqueue(object : Callback<CryptoObject> {
            override fun onResponse(call: Call<CryptoObject>, response: Response<CryptoObject>) {
                val arr:ArrayList<CoinsObject> = response.body()!!.data.coins
                context.resultData(arr)
            }
            override fun onFailure(call: Call<CryptoObject>, t: Throwable) {
                Log.d("TAG",t.toString())
            }

        })
    }
}