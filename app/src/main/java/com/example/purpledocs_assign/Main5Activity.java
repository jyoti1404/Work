package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Boolean isFirstRun5 = getSharedPreferences("PREFERENCE5", MODE_PRIVATE)
                .getBoolean("isFirstRun5", true);


        Configuration config = getResources().getConfiguration();

        if (config.smallestScreenWidthDp >= 600){
            if (isFirstRun5){
                dialog = new Dialog(Main5Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog.setContentView(R.layout.overlay6_tab);

                ImageView arrow18 = dialog.findViewById(R.id.arrow18);
                arrow18.setImageResource(R.drawable.arrow10_removebg);
//                float arrow1size = getResources().getDimension(R.dimen.tab_arrow1_margin_start);
//                appointment.setPadding((int) arrow1size, 0, 0, 0);

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow18.startAnimation(animation1);

                TextView consultation_type = dialog.findViewById(R.id.consultation_type);
                consultation_type.setText("Tap to select \n consultation type");

                ImageView arrow19 = dialog.findViewById(R.id.arrow19);
                arrow19.setImageResource(R.drawable.arrow11_removebg);
                Animation animation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow19.startAnimation(animation2);

                TextView regCase = dialog.findViewById(R.id.reg_case);
                regCase.setText("Tap to enter \ncase no");
//            AnimationDrawable frameAnimation = (AnimationDrawable) arrow1.getBackground();
//            // Start the animation (looped playback by default).
//            frameAnimation.start();
//
                ImageView arrow20 = dialog.findViewById(R.id.arrow20);
                arrow20.setImageResource(R.drawable.arrow11_removebg);

                Animation animation3 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow20.startAnimation(animation3);

                TextView name = dialog.findViewById(R.id.reg_name);
                name.setText("Tap to enter \n name of patient");

                ImageView arrow21 = dialog.findViewById(R.id.arrow21);
                arrow21.setImageResource(R.drawable.arrow14_removebg);

                Animation animation4 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow21.startAnimation(animation4);

                TextView register = dialog.findViewById(R.id.register);
                register.setText("All the fields are \nmandatory to be \nfilled. \n Tap here to \n register patient");

                dialog.setCancelable(true);
                dialog.show();

            }
            getSharedPreferences("PREFERENCE5", MODE_PRIVATE).edit().putBoolean("isFirstRun5", false).commit();

        }else {
            if (isFirstRun5){

                dialog = new Dialog(Main5Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog.setContentView(R.layout.overlay6);

                ImageView arrow18 = dialog.findViewById(R.id.arrow18);
                arrow18.setImageResource(R.drawable.arrow10_removebg);
//                float arrow1size = getResources().getDimension(R.dimen.tab_arrow1_margin_start);
//                appointment.setPadding((int) arrow1size, 0, 0, 0);

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow18.startAnimation(animation1);

                TextView consultation_type = dialog.findViewById(R.id.consultation_type);
                consultation_type.setText("Tap to select \n consultation type");

                ImageView arrow19 = dialog.findViewById(R.id.arrow19);
                arrow19.setImageResource(R.drawable.arrow11_removebg);
                Animation animation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow19.startAnimation(animation2);

                TextView regCase = dialog.findViewById(R.id.reg_case);
                regCase.setText("Tap to enter \ncase no");
//            AnimationDrawable frameAnimation = (AnimationDrawable) arrow1.getBackground();
//            // Start the animation (looped playback by default).
//            frameAnimation.start();
//
                ImageView arrow20 = dialog.findViewById(R.id.arrow20);
                arrow20.setImageResource(R.drawable.arrow11_removebg);

                Animation animation3 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow20.startAnimation(animation3);

                TextView name = dialog.findViewById(R.id.reg_name);
                name.setText("Tap to enter \n name of patient");

                ImageView arrow21 = dialog.findViewById(R.id.arrow21);
                arrow21.setImageResource(R.drawable.arrow14_removebg);

                Animation animation4 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow21.startAnimation(animation4);

                TextView register = dialog.findViewById(R.id.register);
                register.setText("All the fields are \nmandatory to be \nfilled. \n Tap here to \n register patient");

                dialog.setCancelable(true);
                dialog.show();

            }
            getSharedPreferences("PREFERENCE5", MODE_PRIVATE).edit().putBoolean("isFirstRun5", false).commit();

        }
    }
}
