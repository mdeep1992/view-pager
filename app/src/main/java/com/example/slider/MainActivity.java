package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  public static   ViewPager viewPager;
    Slideviewadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        viewPager=findViewById(R.id.view_pager);
        adapter=new Slideviewadapter(this);
        viewPager.setAdapter(adapter);
    }
}
