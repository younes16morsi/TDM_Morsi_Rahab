package com.example.activitymain

abstract class  Product(val name : String ,val price : Long ,val qte : Int?) {


     abstract  fun getType() : String

}