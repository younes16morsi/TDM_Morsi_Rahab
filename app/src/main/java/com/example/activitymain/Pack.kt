package com.example.activitymain

 class Pack(name : String , price : Long , qte : Int?,val giftname :String,val giftQT:Int )
    :Product(name  , price , qte){

  override fun getType () : String {
        return  "Pack"
    }
     var smartphoneList:MutableMap<Smartphone,Int> = mutableMapOf()

     fun addSmartphone(s:Smartphone,qtePhone:Int) = smartphoneList.put(s,qtePhone)


}