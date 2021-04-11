package com.e.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.e.lesson1.utils.toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if (TextUtils.isEmpty(edit_text.text.toString())) {
                toast("Поле пустое! Введите текст")
                }
            else {
                val i = Intent(this, MainActivity2::class.java).apply {
                    putExtra("Data",edit_text.text.toString())
                }
                startActivity(i)
            }
        }
}
}
