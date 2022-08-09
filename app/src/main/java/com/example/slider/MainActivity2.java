package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ViewPager viewPager;
    ImageView dot1, dot2, dot3;
    Button back, next;
    private int[] layouts;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        viewPager = findViewById(R.id.view_pager2);
        dot1 = findViewById(R.id.dot1);
        dot2 = findViewById(R.id.dot2);
        dot3 = findViewById(R.id.dot3);
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);

         viewPager.setAdapter(new viewpageadapter2(getSupportFragmentManager()));
         layouts=new int[]{
                 R.layout.fragment_1,
                 R.layout.fragment_2,
                 R.layout.fragment_3

         };

viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {









        switch (position){
            case 0:

                dot1.setImageResource(R.drawable.selected);
                dot2.setImageResource(R.drawable.unselected);
                dot3.setImageResource(R.drawable.unselected);
                back.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);

                break;
            case 1:

                dot1.setImageResource(R.drawable.unselected);
                dot2.setImageResource(R.drawable.selected);
                dot3.setImageResource(R.drawable.unselected);
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                break;
            case 2:

                dot1.setImageResource(R.drawable.unselected);
                dot2.setImageResource(R.drawable.unselected);
                dot3.setImageResource(R.drawable.selected);

                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
});

    }

}