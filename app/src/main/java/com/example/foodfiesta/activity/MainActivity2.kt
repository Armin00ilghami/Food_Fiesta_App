package com.example.foodfiesta.activity

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.foodfiesta.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding :ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {

            val dialog = AlertDialog.Builder(this).create()
            dialog.setTitle("Error")
//            dialog.setIcon(R.drawable.ic_cancel)
            dialog.setMessage("your app have an error !")
//            dialog.setCancelable(true)
            dialog.setButton( 0 , "cancel" , object :DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {

                    Toast.makeText(this@MainActivity2, "hey all", Toast.LENGTH_SHORT).show()

                }


            })

            dialog.show()


        }



    }
}