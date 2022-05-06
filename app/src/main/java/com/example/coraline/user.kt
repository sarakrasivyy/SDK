package com.example.coraline

data class user (val id:Long, var name:String, var lastname:String, var url:String){

    fun getfullName(): String="$name  $lastname"
}