package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.graphics.drawable.*;
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
   // TextView[] dots;
    private final static int NUM_PAGES = 6;
    private List<ImageView> dots;
    Button next, previous;
    int a;
    TextView main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_intro);

        Boolean isFirstRun = getSharedPreferences("PREFERENCE1", MODE_PRIVATE)
                .getBoolean("isFirstRun1", true);

        viewPager = findViewById(R.id.view_pager);
        layout = findViewById(R.id.layout);
        sliderAdapter = new SliderAdapter(this);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        main = findViewById(R.id.main);

        if (isFirstRun) {

            viewPager.setAdapter(sliderAdapter);
            addDots(0);
            // viewPager.addOnPageChangeListener(viewListener);

            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int current = viewPager.getCurrentItem() + 1;
                    if (current < dots.size()) {
                        viewPager.setCurrentItem(current);
                    } else {
                        loadHome();
                    }
                }
            });
            previous.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    viewPager.setCurrentItem(a - 1);
                }
            });
        }
        getSharedPreferences("PREFERENCE1", MODE_PRIVATE).edit().putBoolean("isFirstRun1", false).commit();
    }

    public void addDots(int position) {

        if (layout != null){
            layout.removeAllViews();
        }

        dots = new ArrayList<>();

        for (int i = 0; i < NUM_PAGES; i++) {
            ImageView dot = new ImageView(this);
            if (i == position){
                dot.setImageDrawable(getResources().getDrawable(R.drawable.default_dots));

            }
            else {
                dot.setImageDrawable(getResources().getDrawable(R.drawable.active_dots));

            }
            //dot.setImageDrawable(getResources().getDrawable(R.drawable.default_dots));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(4,0,4,0);
            layout.addView(dot, params);

            dots.add(dot);

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

//        dots = new TextView[6];
//        for (int i =0; i < dots.length; i++){
//            dots[i] = new TextView(this);
////            dots[i].setText(Html.fromHtml("&#B226;"));
//            dots[i].setTextSize(35);
//            dots[i].setTextColor(Color.WHITE);
//            layout.addView(dots[i]);
//        }
//
//        if (dots.length > 0){
//            dots[position].setTextColor(Color.WHITE);
//        }
        }
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                selectDot(position);
                a = position;

            if (position == 0){
                next.setEnabled(true);
                previous.setEnabled(false);
                previous.setVisibility(View.INVISIBLE);

                next.setText("NEXT");
                previous.setText("");
            }
            else if(position == dots.size() - 1){
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
        });
    }

    public void selectDot(int idx) {
        Resources res = getResources();
        for (int i = 0; i < NUM_PAGES; i++) {
            int drawableId = (i == idx) ? (R.drawable.active_dots) : (R.drawable.default_dots);
            Drawable drawable = res.getDrawable(drawableId);
            dots.get(i).setImageDrawable(drawable);
        }
    }

    public void loadHome(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
