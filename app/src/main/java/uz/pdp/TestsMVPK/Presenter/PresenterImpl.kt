package uz.pdp.TestsMVPK.Presenter

import android.util.Log
import uz.pdp.TestsMVPK.AppContract.AppContract.Presenter
import uz.pdp.TestsMVPK.AppContract.AppContract.ViewTest
import uz.pdp.TestsMVPK.Enum.CategoryEnum
import uz.pdp.TestsMVPK.models.LocalStorage
import uz.pdp.TestsMVPK.models.ModelImpl
import uz.pdp.TestsMVPK.models.QuestionData

class PresenterImpl(private val model: ModelImpl, private val viewTest: ViewTest) : Presenter {

    var currentIndex = 0
    var answerCount = 0
    private var wrongCount = 0
    private var lastSelected = -1
    private lateinit var data: ArrayList<QuestionData>
    private val localStorage = LocalStorage.instance
    lateinit var category: String

    override fun saveData() {
        localStorage.answersCount = answerCount
        localStorage.category = category
        localStorage.indexQuestion = currentIndex

    }

    override fun loadSavedData() {
        currentIndex=localStorage.indexQuestion
        answerCount = localStorage.answersCount
        wrongCount=currentIndex-answerCount
        loadList(CategoryEnum.valueOf(localStorage.category))

    }


    override fun loadList(type: CategoryEnum) {
        data = model.getQuestionData(type)
        category = type.name
    }

    override fun loadQuestionData() {
        viewTest.loadDataToView(getCurrentQuestion())
        viewTest.setQuestionNumber(currentIndex + 1, data.size)
    }

    override fun finishClick() {
        viewTest.sendResultData(answerCount, wrongCount, data.size)
        resetResults()
    }

    override fun itemClick(pos: Int) {
        if (lastSelected == pos) return
        if (lastSelected != -1) {
            clearCheck()
        }
        viewTest.setItemImage(pos, true)
        lastSelected = pos
    }

    private fun clearCheck() {
        if (lastSelected != -1) {
            viewTest.setItemImage(lastSelected, false)
            lastSelected = -1
        }
    }

    override fun nextClick() {
        if (lastSelected != -1) {
            checkResult(lastSelected)
            ++currentIndex
            if (currentIndex <= data.size - 1) {
                loadQuestionData()
                clearCheck()
            } else {
                viewTest.sendResultData(answerCount, wrongCount, data.size)
                resetResults()
            }
        } else {
            viewTest.showToast("Variant belgilang")
        }
    }

    private fun resetResults() {
        clearCheck()
        currentIndex = 0
        answerCount = 0
        wrongCount = 0
        viewTest.setQuestionNumber(currentIndex + 1, data.size)
    }

    private fun checkResult(lastSelected: Int) {
        val answerText = viewTest.getAnswerText(lastSelected)
        if (getCurrentQuestion().answer == answerText) {
            answerCount++
        } else wrongCount++
    }

    private fun getCurrentQuestion(): QuestionData {
        return data[currentIndex]
    }

}