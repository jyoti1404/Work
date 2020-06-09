package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Dialog dialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Boolean isFirstRun2 = getSharedPreferences("PREFERENCE2", MODE_PRIVATE)
                .getBoolean("isFirstRun2", true);

        DisplayMetrics displayMetrics1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics1);

        float yInches= displayMetrics1.heightPixels/displayMetrics1.ydpi;
        float xInches= displayMetrics1.widthPixels/displayMetrics1.xdpi;

        double diagonalInches1 = Math.sqrt(xInches*xInches + yInches*yInches);

        Configuration config1 = getResources().getConfiguration();


        if (config1.smallestScreenWidthDp >= 600){
            if (isFirstRun2){
                dialog1 = new Dialog(Main2Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog1.setContentView(R.layout.overlay3_tab);

                ImageView arrow4 = dialog1.findViewById(R.id.arrow4);
                arrow4.setImageResource(R.drawable.arrow5_removebg);
                Animation animation4 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow4.startAnimation(animation4);

                TextView caseno = dialog1.findViewById(R.id.caseno);
                caseno.setText("Type the number \n of patient to be \n searched");

                ImageView arrow5 = dialog1.findViewById(R.id.arrow5);
                arrow5.setImageResource(R.drawable.arrow6_removebg);
                Animation animation5 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow5.startAnimation(animation5);

                TextView name = dialog1.findViewById(R.id.name);
                name.setText("Type the name \n of patient to be \n searched");

                ImageView arrow6 = dialog1.findViewById(R.id.arrow6);
                arrow6.setImageResource(R.drawable.arrow7_removebg);
                Animation animation6 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow6.startAnimation(animation6);

                TextView contact = dialog1.findViewById(R.id.contact);
                contact.setText("Type the contact \n no of patient \n (upto 15 digits)");

                ImageView arrow7 = dialog1.findViewById(R.id.arrow7);
                arrow7.setImageResource(R.drawable.arrow8_removebg);
                Animation animation7 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow7.startAnimation(animation7);

                TextView email = dialog1.findViewById(R.id.email);
                email.setText("Type the email \n of patient to be \n searched");

                ImageView arrow8 = dialog1.findViewById(R.id.arrow8);
                arrow8.setImageResource(R.drawable.arrow9_removebg);
                Animation animation8 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow8.startAnimation(animation8);

                TextView search = dialog1.findViewById(R.id.search);
                search.setText("Tap here to \n search the patient");

                dialog1.setCancelable(true);
                dialog1.show();

            }
            getSharedPreferences("PREFERENCE2", MODE_PRIVATE).edit().putBoolean("isFirstRun2", false).commit();

        }else {
            if (isFirstRun2){
                dialog1 = new Dialog(Main2Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog1.setContentView(R.layout.overlay3);

                ImageView arrow4 = dialog1.findViewById(R.id.arrow4);
                arrow4.setImageResource(R.drawable.arrow5_removebg);
                Animation animation4 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow4.startAnimation(animation4);

                TextView caseno = dialog1.findViewById(R.id.caseno);
                caseno.setText("Type the number \n of patient to be \n searched");

                ImageView arrow5 = dialog1.findViewById(R.id.arrow5);
                arrow5.setImageResource(R.drawable.arrow6_removebg);
                Animation animation5 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow5.startAnimation(animation5);

                TextView name = dialog1.findViewById(R.id.name);
                name.setText("Type the name \n of patient to be \n searched");

                ImageView arrow6 = dialog1.findViewById(R.id.arrow6);
                arrow6.setImageResource(R.drawable.arrow7_removebg);
                Animation animation6 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow6.startAnimation(animation6);

                TextView contact = dialog1.findViewById(R.id.contact);
                contact.setText("Type the contact \n no of patient \n (upto 15 digits)");

                ImageView arrow7 = dialog1.findViewById(R.id.arrow7);
                arrow7.setImageResource(R.drawable.arrow8_removebg);
                Animation animation7 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow7.startAnimation(animation7);

                TextView email = dialog1.findViewById(R.id.email);
                email.setText("Type the email \n of patient to be \n searched");

                ImageView arrow8 = dialog1.findViewById(R.id.arrow8);
                arrow8.setImageResource(R.drawable.arrow9_removebg);
                Animation animation8 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow8.startAnimation(animation8);

                TextView search = dialog1.findViewById(R.id.search);
                search.setText("Tap here to \n search the patient");

                dialog1.setCancelable(true);
                dialog1.show();

            }

            getSharedPreferences("PREFERENCE2", MODE_PRIVATE).edit().putBoolean("isFirstRun2", false).commit();
        }

    }
}
