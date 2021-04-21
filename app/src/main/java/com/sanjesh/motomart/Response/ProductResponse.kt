package com.sanjesh.motomart.Response

import com.sanjesh.motomart.Entity.Product

data class ProductResponse(
    val success:Boolean?=null,

    val data:MutableList<Product>?=null
)