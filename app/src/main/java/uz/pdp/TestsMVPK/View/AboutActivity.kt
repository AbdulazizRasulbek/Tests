package uz.pdp.TestsMVPK.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.pdp.TestsMVPK.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        title = "About"
    }
}