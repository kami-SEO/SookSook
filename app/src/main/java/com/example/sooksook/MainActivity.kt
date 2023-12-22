package com.example.sooksook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.sooksook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myName = "코딩왕" //변수 생성 대입 바로 값 대입 자료형이 자동으로 결정
        Log.d("변수값",myName)

        //문법 변수
//        val myname : String //value 상수 변동불가 Variable 변수 변동가능
//        var myAge : Int
//         double boolean

        //문법 조건문
        val userAge = 18
        if (userAge>=20){
            Log.d("성인판별", "성인입니다")
        }
        else if(userAge>=17){
            Log.d("성인판별","고등학생이다.")
        }
        else if(userAge>=14){
            Log.d("성인판별","중학생이다.")
        else{
            Log.d("성인판별", "성인이 아닙니다.")
        }


        binding.clkBtn.setOnClickListener {

            //주석 ctrl + /
//            {}안의 코드만 눌렀을 때 실행
            Log.d("메인화면로그", "클릭용버튼으로 눌림")
            Log.e("메인화면로그","에러관련")
        }
        binding.smallBtn.setOnClickListener {
            Toast.makeText(this, "작은버튼눌림", Toast.LENGTH_SHORT).show()



        }
        binding.smallBtn
    }
}