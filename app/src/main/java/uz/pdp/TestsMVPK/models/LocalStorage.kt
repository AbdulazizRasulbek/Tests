package uz.pdp.TestsMVPK.models

import android.content.Context
import android.content.SharedPreferences

class LocalStorage private constructor(context: Context){
    companion object {
        lateinit var instance:LocalStorage
        fun init(context: Context){
            instance=LocalStorage(context)
        }
    }
    private var prefs=context.getSharedPreferences("data",Context.MODE_PRIVATE)

        var category:String
            get() = prefs.getString("CATEGORY","")!!
            set(value) = prefs.edit().putString("CATEGORY",value).apply()

        var indexQuestion:Int
            get() = prefs.getInt("INDEX",0)
            set(value) = prefs.edit().putInt("INDEX",value).apply()

        var answersCount:Int
            get() = prefs.getInt("ANSWERS",0)
            set(value) = prefs.edit().putInt("ANSWERS",value).apply()

    fun clearData(){
        prefs.edit().clear().apply()
    }


}