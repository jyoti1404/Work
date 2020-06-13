package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.*;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.appintro.AppIntroFragment;

import java.util.ArrayList;
import java.util.List;

public class AppIntro extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout layout;
    SliderAdapter sliderAdapter;
    TextView[] dots;
    ImageView[] mdots;
    Button next, previous;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_intro);

        viewPager = findViewById(R.id.view_pager);
        layout = findViewById(R.id.layout);
        sliderAdapter = new SliderAdapter(this);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        viewPager.setAdapter(sliderAdapter);
        addDots(0);
        viewPager.addOnPageChangeListener(viewListener);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(a + 1);
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(a - 1);
            }
        });

//        addSlide(AppIntroFragment.newInstance("Patient Queue", "Click on menu at the top right corner.", R.drawable.back, Color.RED));
//        addSlide(AppIntroFragment.newInstance("Patient Queue", "Click on menu at the top right corner.", R.drawable.back, Color.RED));
//        addSlide(AppIntroFragment.newInstance("Patient Queue", "Click on menu at the top right corner.", R.drawable.back, Color.RED));
//        addSlide(AppIntroFragment.newInstance("Patient Queue", "Click on menu at the top right corner.", R.drawable.back, Color.RED));
    }

    public void addDots(int position){
//
//        if (layout != null){
//            layout.removeAllViews();
//        }
//        mdots = new ImageView[6];
//
//        for (int i =0; i < mdots.length; i++){
//            mdots[i] = new ImageView(this);
//            if (i == position){
//                mdots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.default_dots));
//            }
//            else {
//                mdots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dots));
//            }
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                    ViewGroup.LayoutParams.WRAP_CONTENT);
//            params.setMargins(4,0,4,0);
//
//            layout.addView(mdots[i], params);
//        }

        dots = new TextView[6];
        for (int i =0; i < dots.length; i++){
            dots[i] = new TextView(this);
//            dots[i].setText(Html.fromHtml("&#B226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(Color.WHITE);
            layout.addView(dots[i]);
        }

        if (dots.length > 0){
            dots[position].setTextColor(Color.WHITE);
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            a = position;

            if (position == 0){
                next.setEnabled(true);
                previous.setEnabled(false);
                previous.setVisibility(View.INVISIBLE);

                next.setText("NEXT");
                previous.setText("");
            }
            else if(position == dots.length - 1){
                next.setEnabled(true);
                previous.setEnabled(true);
                previous.setVisibility(View.VISIBLE);

                next.setText("FINISH");
                previous.setText("BACK");
            }
            else {
                next.setEnabled(true);
                previous.setEnabled(true);
                previous.setVisibility(View.VISIBLE);

                next.setText("NEXT");
                previous.setText("BACK");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
