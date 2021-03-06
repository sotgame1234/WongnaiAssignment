package com.example.wongnaiassignment.api

import com.example.wongnaiassignment.recyclerCrypto.CoinsObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Object coins in data object
 */
class DataObject(
    @SerializedName("coins")
    @Expose
    val coins:ArrayList<CoinsObject>
)
