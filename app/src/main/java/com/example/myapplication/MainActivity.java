package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //hello hello

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private  void TestVoid(){
        System.out.println("ABC");
    }
    private  void TestVoid1(){
        System.out.println("ABC");
    }
    private void Something(){
        System.out.println("something change");
    }
}
