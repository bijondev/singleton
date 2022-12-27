package com.bkb.singleton

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bkb.singleton.singleTonExample


class MainActivity : AppCompatActivity() {
    var editText: EditText? = null
    var save: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        save = findViewById(R.id.save)

        save!!.setOnClickListener {
            if (editText!!.getText().toString().isEmpty()) {
                editText!!.setError("Enter text")
            } else {
                val editValue = editText!!.getText().toString()
                val singletonexample: singleTonExample? =singleTonExample.getInstance()

                singletonexample!!.setText(editValue)
                Toast.makeText(this, singletonexample.getText(), Toast.LENGTH_LONG)
                    .show()
            }
        }


    }
}