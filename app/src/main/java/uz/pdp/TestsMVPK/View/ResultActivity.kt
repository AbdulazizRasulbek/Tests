package uz.pdp.TestsMVPK.View

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*
import uz.pdp.TestsMVPK.R

class ResultActivity : AppCompatActivity() {
   private var correct = 0
   private var wrong = 0
   private var all = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        title = "Test Results"
        intentData

        setInfo(correct, wrong, all)
        buttonRestart.setOnClickListener { finish() }
        buttonToMain.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }

    private fun setInfo(correct: Int, wrong: Int, all: Int) {
        trueCount.text = correct.toString()
        wrongCount.text = wrong.toString()
        allQuestionsCount.text = all.toString()
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MenuActivity::class.java))
        finish()

    }

    private val intentData: Unit
         get() {
            val intent = intent
            correct = intent.getIntExtra("correct", 0)
            wrong = intent.getIntExtra("wrong", 0)
            all = intent.getIntExtra("all", 0)
        }
}