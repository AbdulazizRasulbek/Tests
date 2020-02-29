package uz.pdp.TestsMVPK.App

import android.app.Application
import uz.pdp.TestsMVPK.models.LocalStorage

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        LocalStorage.init(this)
    }
}