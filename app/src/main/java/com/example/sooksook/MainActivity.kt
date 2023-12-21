package com.example.sooksook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sooksook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.clkBtn.setOnClickListener {

            //주석 ctrl + /
//            {}안의 코드만 눌렀을 때 실행
            Log.d("메인화면로그", "클릭용버튼으로 눌림")
        }
        binding.smallBtn
    }
}