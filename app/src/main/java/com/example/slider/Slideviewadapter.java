package com.example.slider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Slideviewadapter extends PagerAdapter {

    Context context;

    public Slideviewadapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slidescreen,container,false);
        ImageView logo=view.findViewById(R.id.logo);
        ImageView dot1=view.findViewById(R.id.dot1);
        ImageView dot2=view.findViewById(R.id.dot2);
        ImageView dot3=view.findViewById(R.id.dot3);
        TextView Title=view.findViewById(R.id.title);
        Button back=view.findViewById(R.id.back);
        Button next=view.findViewById(R.id.next);

        switch (position){
            case 0:
                logo.setImageResource(R.drawable.img1);
            dot1.setImageResource(R.drawable.selected);
                dot2.setImageResource(R.drawable.unselected);
                dot3.setImageResource(R.drawable.unselected);
                Title.setText("Interview process");
                back.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);

                break;
            case 1:
                logo.setImageResource(R.drawable.office);
                dot1.setImageResource(R.drawable.unselected);
                dot2.setImageResource(R.drawable.selected);
                dot3.setImageResource(R.drawable.unselected);
                Title.setText("training process");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                break;
            case 2:
                logo.setImageResource(R.drawable.meet);
                dot1.setImageResource(R.drawable.unselected);
                dot2.setImageResource(R.drawable.unselected);
                dot3.setImageResource(R.drawable.selected);
                Title.setText("working process");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
        }

container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);
    }
}
