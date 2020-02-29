package uz.pdp.TestsMVPK.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import uz.pdp.TestsMVPK.R
import uz.pdp.TestsMVPK.models.LocalStorage

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    fun onClick(v: View) {
        LocalStorage.instance.clearData()
        Toast.makeText(this, "Succesfully cleared", Toast.LENGTH_SHORT).show()
        finish()
    }

}
