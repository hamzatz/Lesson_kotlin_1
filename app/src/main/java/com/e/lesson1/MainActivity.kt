package com.e.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.lesson1.extensions.toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentValue = intent.getStringExtra(DATA_TEXT)
        edit_text.setText(intentValue)

        button.setOnClickListener {
            val ed:String= edit_text.text.toString()
            if (ed.trim().isEmpty()) {
                    toast("Поле пустое! Введите текст")
                }
                    else {
                    val i = Intent(this, MainActivity2::class.java).apply {
                        putExtra(DATA_TEXT,edit_text.text.toString())
                    }
                    startActivity(i)
                }
        }
}
    companion object {
        const val DATA_TEXT = "Data"
    }
}
