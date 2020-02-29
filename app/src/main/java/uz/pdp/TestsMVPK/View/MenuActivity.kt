package uz.pdp.TestsMVPK.View

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*
import uz.pdp.TestsMVPK.AppContract.AppContract.ViewMenuActivity
import uz.pdp.TestsMVPK.Enum.CategoryEnum
import uz.pdp.TestsMVPK.Presenter.PresenterImpl
import uz.pdp.TestsMVPK.R
import uz.pdp.TestsMVPK.models.LocalStorage

class MenuActivity : AppCompatActivity(), ViewMenuActivity {
    val localStorage = LocalStorage.instance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        loadViews()
    }

    override fun onResume() {
        super.onResume()
        if (localStorage.indexQuestion != 0) {
            buttonResume.visibility = View.VISIBLE
        } else buttonResume.visibility = View.INVISIBLE
    }

    private fun loadViews() {
        buttonSettings.setOnClickListener(this::menuActivityButtonClick)
        buttonResume.setOnClickListener(this::menuActivityButtonClick)
        buttonStart.setOnClickListener(this::menuActivityButtonClick)
        buttonAbout.setOnClickListener(this::menuActivityButtonClick)
        buttonExit.setOnClickListener(this::menuActivityButtonClick)
    }

    override fun menuActivityButtonClick(view: View) {
        val intent: Intent
        when (view.id) {
            R.id.buttonStart -> {
                intent = Intent(this, CategoryActivity::class.java)
            }
            R.id.buttonAbout -> {
                intent = Intent(this, AboutActivity::class.java)
            }
            R.id.buttonSettings -> {
                intent = Intent(this, SettingsActivity::class.java)
            }
            R.id.buttonResume -> {
                intent = Intent(this, TestActivity::class.java)
                intent.putExtra(CategoryEnum.CATEGORY.name, localStorage.category)
                intent.putExtra("resume", 1)
            }
            else -> {
                intent = Intent(Intent.ACTION_MAIN)
                intent.addCategory(Intent.CATEGORY_HOME)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
        }
        startActivity(intent)
    }

    var pressBack = false
    override fun onBackPressed() {
        if (pressBack) {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
        pressBack = true
        Toast.makeText(this, "Chiqish uchun yana bir marta bosing", Toast.LENGTH_SHORT).show()
        object : CountDownTimer(2000, 200) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                pressBack = false
            }
        }.start()
    }
}