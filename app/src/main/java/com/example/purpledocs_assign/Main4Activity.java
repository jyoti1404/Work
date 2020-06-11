package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Boolean isFirstRun4 = getSharedPreferences("PREFERENCE4", MODE_PRIVATE)
                .getBoolean("isFirstRun4", true);

        Configuration config = getResources().getConfiguration();

        if (config.smallestScreenWidthDp >= 600){
            if (isFirstRun4){
                dialog = new Dialog(Main4Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog.setContentView(R.layout.overlay5_tab);

                ImageView arrow15 = dialog.findViewById(R.id.arrow15);
                arrow15.setImageResource(R.drawable.arrow10_removebg);
//                float arrow1size = getResources().getDimension(R.dimen.tab_arrow1_margin_start);
//                appointment.setPadding((int) arrow1size, 0, 0, 0);

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow15.startAnimation(animation1);

                TextView info = dialog.findViewById(R.id.info);
                info.setText("Tap here to see \npatient's information");
                info.setTextSize(20);

                ImageView arrow16 = dialog.findViewById(R.id.arrow16);
                arrow16.setImageResource(R.drawable.arrow11_removebg);
                Animation animation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow16.startAnimation(animation2);

                TextView search = dialog.findViewById(R.id.search);
                search.setText("Tap here to \nsearch patient");
                search.setTextSize(20);
//            AnimationDrawable frameAnimation = (AnimationDrawable) arrow1.getBackground();
//            // Start the animation (looped playback by default).
//            frameAnimation.start();
//
                ImageView arrow17 = dialog.findViewById(R.id.arrow17);
                arrow17.setImageResource(R.drawable.arrow14_removebg);

                Animation animation3 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow17.startAnimation(animation3);

                TextView search_add = dialog.findViewById(R.id.search_add);
                search_add.setText("Tap here to \nadd patient");
                search_add.setTextSize(20);

                dialog.setCancelable(true);
                dialog.show();
            }
        }
        else {
            if (isFirstRun4){
                dialog = new Dialog(Main4Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog.setContentView(R.layout.overlay5);

                ImageView arrow15 = dialog.findViewById(R.id.arrow15);
                arrow15.setImageResource(R.drawable.arrow10_removebg);
//                float arrow1size = getResources().getDimension(R.dimen.tab_arrow1_margin_start);
//                appointment.setPadding((int) arrow1size, 0, 0, 0);

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow15.startAnimation(animation1);

                TextView info = dialog.findViewById(R.id.info);
                info.setText("Tap here to see \npatient's information");

                ImageView arrow16 = dialog.findViewById(R.id.arrow16);
                arrow16.setImageResource(R.drawable.arrow11_removebg);
                Animation animation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow16.startAnimation(animation2);

                TextView search = dialog.findViewById(R.id.search);
                search.setText("Tap here to \nsearch patient");

//            AnimationDrawable frameAnimation = (AnimationDrawable) arrow1.getBackground();
//            // Start the animation (looped playback by default).
//            frameAnimation.start();
//
                ImageView arrow17 = dialog.findViewById(R.id.arrow17);
                arrow17.setImageResource(R.drawable.arrow14_removebg);

                Animation animation3 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow17.startAnimation(animation3);

                TextView search_add = dialog.findViewById(R.id.search_add);
                search_add.setText("Tap here to \nadd patient");

                dialog.setCancelable(true);
                dialog.show();


            }
            getSharedPreferences("PREFERENCE4", MODE_PRIVATE).edit().putBoolean("isFirstRun4", false).commit();
        }
    }
}
