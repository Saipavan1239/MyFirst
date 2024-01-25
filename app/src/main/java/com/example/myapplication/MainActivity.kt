package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnexit.setOnClickListener {
            val builder1= AlertDialog.Builder(this)
            builder1.setTitle("Do you want to exit?")
            builder1.setMessage("Are you sure you want to exit?")
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task to do when the user presses yes
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press no
            })
            builder1.show()
        }

        binding.btn1.setOnClickListener {
            val builder1 =AlertDialog.Builder(this)
            builder1.setTitle("Question 1: What is the sum of 999+18? \n Choose the correct option:")
            val options= arrayOf("A.1001","B.1011","C.991","D.1017")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                //task when u click on option
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press yes
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press no
            })
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val builder1 =AlertDialog.Builder(this)
            builder1.setTitle("Question 2: What is the answer of 99-107? \n Choose the correct option:")
            val options= arrayOf("A.101","B.11","C.-8","D.-17")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                //task when u click on option
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press yes
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press no
            })
            builder1.show()
        }

        binding.btn3.setOnClickListener {
            val options= arrayOf("A.80","B.70+10","C.40","D.20")
            val builder3= AlertDialog.Builder(this)
            builder3.setTitle("Question 3: What is the answer of 10*8? \n Choose the correct options:")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this,"You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press yes
            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //Task when we press no
            })
            builder3.show()
        }
    }
}