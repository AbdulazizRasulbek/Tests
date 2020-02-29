package uz.pdp.TestsMVPK.View

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*
import uz.pdp.TestsMVPK.AppContract.AppContract
import uz.pdp.TestsMVPK.AppContract.AppContract.ViewTest
import uz.pdp.TestsMVPK.Enum.CategoryEnum
import uz.pdp.TestsMVPK.Presenter.PresenterImpl
import uz.pdp.TestsMVPK.R
import uz.pdp.TestsMVPK.models.ModelImpl
import uz.pdp.TestsMVPK.models.QuestionData
import java.util.*

class TestActivity : AppCompatActivity(), ViewTest {
    private var presenter: AppContract.Presenter = PresenterImpl(ModelImpl(), this)

    private lateinit var typeIntent: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }
        typeIntent = intent.getStringExtra(CategoryEnum.CATEGORY.toString())!!
        loadViews()
        mTitle.text=typeIntent
        if (intent.getIntExtra("resume",0)==1){
            presenter.loadSavedData()
            presenter.loadQuestionData()
        }

    }

    override fun onResume() {
        super.onResume()
//        presenter.loadSavedData()
//        presenter.loadQuestionData()
    }

    override fun onStop() {
        super.onStop()
        presenter.saveData()
    }

    private val groups = ArrayList<ViewGroup>()
    private fun loadViews() {
        groups.add(findViewById(R.id.item1))
        groups.add(findViewById(R.id.item2))
        groups.add(findViewById(R.id.item3))
        groups.add(findViewById(R.id.item4))
        for (i in groups.indices) {
            val group = groups[i]
            group.tag = i
            group.setOnClickListener {
                presenter.itemClick(i)
            }
        }
        presenter.loadList(CategoryEnum.valueOf(typeIntent))
        title = typeIntent
        presenter.loadQuestionData()

        buttonNext.setOnClickListener { presenter.nextClick() }
        buttonFinish.setOnClickListener { presenter.finishClick() }

    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    override fun sendResultData(trueCount: Int, wrongCount: Int, count: Int) {
        val intent=Intent(this,ResultActivity::class.java)
        intent.putExtra("correct", trueCount)
        intent.putExtra("wrong", wrongCount)
        intent.putExtra("all", count)
        startActivity(intent)
    }

    override fun loadDataToView(data: QuestionData) {
        val variantNumbers = ArrayList(listOf(0, 1, 2, 3))
        variantNumbers.shuffle()
        val que = textQuestion
        que.text = data.question
        setItemText(variantNumbers[0], data.variant1)
        setItemText(variantNumbers[1], data.variant2)
        setItemText(variantNumbers[2], data.variant3)
        setItemText(variantNumbers[3], data.variant4)
    }

    private fun setItemText(position: Int, text: String) {
        val group = groups[position]
        val textView = group.getChildAt(2) as TextView
        textView.text = text
    }

    override fun getAnswerText(pos: Int):String {
        val viewGroup = groups[pos]
        val textView = viewGroup.getChildAt(2) as TextView
        return textView.text.toString()

    }

    override fun setItemImage(pos: Int, check: Boolean) {
        val viewGroup = groups[pos]
        val imageView = viewGroup.getChildAt(0) as ImageView
        if (check) {
            imageView.setImageResource(R.drawable.ic_check_circle)
        } else imageView.setImageResource(R.drawable.ic_radio_button_unchecked)
    }


    /*override fun onBackPressed() {
        if (currentIndex != 0) {
            loadDataToView(data[--currentIndex])
            setQuestionNumber(currentIndex + 1, data.size)
            if (answers[currentIndex]) {
                answerCount--
            } else {
                wrongCount--
            }
        } else {
            answers = BooleanArray(10)
            super.onBackPressed()
        }
    }*/

    override fun setQuestionNumber(i: Int, size: Int) {
        numberQuestion.text = "$i / $size"
    }





    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        /*if (currentIndex != 0) {
        loadDataToView(data[--currentIndex])
        setQuestionNumber(currentIndex + 1, data.size)
        if (answers[currentIndex]) {
            answerCount--
        } else {
            wrongCount--
        }
    } else {
        answers = BooleanArray(10)
        super.onBackPressed()
    }*/
        return super.onOptionsItemSelected(item)
    }
}