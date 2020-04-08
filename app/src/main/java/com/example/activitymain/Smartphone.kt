package com.example.activitymain

class Smartphone(name : String , price : Long , qte : Int,val brand :String,val model:String ,val color:String ,val qtPhone : Int)
:Product(name  , price , qte){


    override fun getType () : String {
        return  "Smartphone"
    }
}


