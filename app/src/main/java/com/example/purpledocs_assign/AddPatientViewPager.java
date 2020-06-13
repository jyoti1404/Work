package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class AddPatientViewPager extends AppCompatActivity {

//    ViewPager viewPager;
    ViewFlipper viewFlipper;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient_view_pager);

//        viewPager = findViewById(R.id.viewPager);
//        viewPager.setAdapter(new CustomPageAdapter(this));

        viewFlipper = findViewById(R.id.viewFlipper);
        textView = findViewById(R.id.main_textView);
        Boolean isFirstRun = getSharedPreferences("PREFERENCE1", MODE_PRIVATE)
                .getBoolean("isFirstRun1", true);

        int image[]={R.drawable.view1,R.drawable.view2,R.drawable.view3,R.drawable.view4, R.drawable.view5, R.drawable.view6};

        if (isFirstRun) {
            for (int slide : image) {
                flipperImages(slide);
            }
            textView.setText("");
        }
        getSharedPreferences("PREFERENCE1", MODE_PRIVATE).edit().putBoolean("isFirstRun1", false).commit();
    }
    public void flipperImages(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(6000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this,android.R.anim.fade_in);
        viewFlipper.setOutAnimation(this,android.R.anim.fade_out);
//        viewFlipper.startFlipping();
//        viewFlipper.setFlipInterval(4000);
//        viewFlipper.setAutoStart(tr);
//        viewFlipper.startFlipping();
    }
}
