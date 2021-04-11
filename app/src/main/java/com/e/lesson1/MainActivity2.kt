package com.e.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.lesson1.extensions.toast
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intentValue = intent.getStringExtra(DATA_TEXT)
        edit_text_2.setText(intentValue)
        button_2.setOnClickListener {
            val ed2:String= edit_text_2.text.toString()
            if(ed2.trim().isEmpty()) {
                toast("Поле пустое! Введите текст")
            }else
                intentValue = edit_text_2.text.toString()
            intent.putExtra(Intent.EXTRA_TEXT,intentValue)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
    companion object {
        const val DATA_TEXT = "Data"
    }
}



