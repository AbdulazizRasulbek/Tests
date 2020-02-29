package uz.pdp.TestsMVPK.AppContract

import android.view.View
import uz.pdp.TestsMVPK.Enum.CategoryEnum
import uz.pdp.TestsMVPK.models.QuestionData
import java.util.*

interface AppContract {
    interface ModelInterface {
        fun getQuestionData(type: CategoryEnum): ArrayList<QuestionData>
    }

    interface ViewMenuActivity {
        fun menuActivityButtonClick(view: View)
    }

    interface ViewTest {
        fun setQuestionNumber(i: Int, size: Int)
        fun sendResultData(trueCount:Int,wrongCount:Int,count:Int)
        fun showToast(text:String)
        fun loadDataToView(data: QuestionData)
        fun getAnswerText(pos: Int):String
        fun setItemImage(pos: Int,check:Boolean)
    }

    interface Presenter {
        fun saveData()
        fun loadSavedData()
        fun loadList(type: CategoryEnum)
        fun loadQuestionData()
        fun finishClick()
        fun itemClick(pos:Int)
        fun nextClick()
    }
}