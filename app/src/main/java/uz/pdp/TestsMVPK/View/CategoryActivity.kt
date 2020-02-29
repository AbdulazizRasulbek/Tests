package uz.pdp.TestsMVPK.View

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_category.*
import uz.pdp.TestsMVPK.Enum.CategoryEnum
import uz.pdp.TestsMVPK.R

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        title = "Category"
        loadUi()
        loadImages()
    }

    private fun loadImages() {
        Glide.with(this).load(R.drawable.math).into(image_matem)
        Glide.with(this).load(R.drawable.physics).into(image_fizika)
        Glide.with(this).load(R.drawable.onatili).into(image_onatili)
        Glide.with(this).load(R.drawable.informatics).into(image_informatika)
        Glide.with(this).load(R.drawable.geografiya).into(image_geografiya)
        Glide.with(this).load(R.drawable.biology).into(image_biolog)
        Glide.with(this).load(R.drawable.android).into(image_android)
        Glide.with(this).load(R.drawable.chemistry).into(image_kimyo)
        Glide.with(this).load(R.drawable.english).into(image_english)
        Glide.with(this).load(R.drawable.history).into(image_tarix)
    }

    private fun loadUi() {
        category_matem.setOnClickListener(this::onClick)
        category_android.setOnClickListener(this::onClick)
        category_fizika.setOnClickListener(this::onClick)
        category_onatili.setOnClickListener(this::onClick)
        category_tarix.setOnClickListener(this::onClick)
        category_kimyo.setOnClickListener(this::onClick)
        category_english.setOnClickListener(this::onClick)
        category_geografiya.setOnClickListener(this::onClick)
        category_informatika.setOnClickListener(this::onClick)
        category_biologiya.setOnClickListener(this::onClick)
    }

    private fun onClick(view: View) {
        val intent = Intent(this, TestActivity::class.java)
        when (view.id) {
            R.id.category_matem -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.MATEMATIKA.toString())
            R.id.category_fizika -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.FIZIKA.toString())
            R.id.category_onatili -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.ONATILI.toString())
            R.id.category_tarix -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.TARIX.toString())
            R.id.category_english -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.ENGLISH.toString())
            R.id.category_geografiya -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.GEOGRAFIYA.toString())
            R.id.category_informatika -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.INFORMATIKA.toString())
            R.id.category_biologiya -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.BIOLOGIYA.toString())
            R.id.category_kimyo -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.KIMYO.toString())
            R.id.category_android -> intent.putExtra(CategoryEnum.CATEGORY.toString(), CategoryEnum.ANDROID.toString())
        }
        startActivity(intent)
    }
}