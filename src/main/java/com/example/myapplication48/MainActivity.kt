package com.example.myapplication48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    var a = 0 //เก็บค่าของ show อันแรก
    var cl = ""
    var num = 0
    var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        one.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("1")
                a = 0
            } else {
                var strOne = show.text.toString().plus(1)
                show.setText(strOne)
            }
        }
        two.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("2")
                a = 0
            } else {
                var strTwo = show.text.toString().plus(2)
                show.setText(strTwo)
            }
        }
        three.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("3")
                a = 0
            } else {
                var strThree = show.text.toString().plus(3)
                show.setText(strThree)
            }
        }
        four.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("4")
                a = 0
            } else {
                var strFour = show.text.toString().plus(4)
                show.setText(strFour)
            }
        }
        five.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("5")
                a = 0
            } else {
                var strFive = show.text.toString().plus(5)
                show.setText(strFive)
            }
        }
        six.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("6")
                a = 0
            } else {
                var strSix = show.text.toString().plus(6)
                show.setText(strSix)
            }
        }
        seven.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("7")
                a = 0
            } else {
                var strSeven = show.text.toString().plus(7)
                show.setText(strSeven)
            }
        }
        eight.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("8")
                a = 0
            } else {
                var strEight = show.text.toString().plus(8)
                show.setText(strEight)
            }
        }
        nine.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("9")
                a = 0
            } else {
                var strNine = show.text.toString().plus(9)
                show.setText(strNine)
            }
        }
        zero.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("0")
                a = 0
            } else {
                var strZero = show.text.toString().plus(0)
                show.setText(strZero)
            }
        }


        clear.setOnClickListener() {
            show.setText("0")
        }

        delete.setOnClickListener {
            if (show.text.toString().length <= 1) {
                show.setText("0")
            } else {
                show.text = show.text.dropLast(1)
            }
        }

        multiply.setOnClickListener {  //คูณ *
            a = 1
            num = show.text.toString().toInt()
            cl = "mul"
        }
        divide.setOnClickListener {  //หาร /
            a = 1
            num = show.text.toString().toInt()
            cl = "div"
        }
        minus.setOnClickListener {  //ลบ -
            a = 1
            num = show.text.toString().toInt()
            cl = "min"
        }
        plus.setOnClickListener {  //บวก +
            a = 1
            num = show.text.toString().toInt()
            cl = "plus"
        }

        equal.setOnClickListener {
                if (cl == "mul") {
                    sum = num * show.text.toString().toInt()
                    show.text = sum.toString()
                } else if (cl == "div") {
                    sum = num / show.text.toString().toInt()
                    show.text = sum.toString()
                } else if (cl == "min") {
                    sum = num - show.text.toString().toInt()
                    show.text = sum.toString()
                } else if (cl == "plus") {
                    sum = num + show.text.toString().toInt()
                    show.text = sum.toString()
                }
        }
    }
}