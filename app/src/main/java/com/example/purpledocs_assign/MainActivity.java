package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boolean isFirstRun = getSharedPreferences("PREFERENCE1", MODE_PRIVATE)
                .getBoolean("isFirstRun1", true);
//
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//
//        float yInches= metrics.heightPixels/metrics.ydpi;
//        float xInches= metrics.widthPixels/metrics.xdpi;
//
//        double diagonalInches = Math.sqrt(xInches*xInches + yInches*yInches);

        Configuration config = getResources().getConfiguration();

        if (config.smallestScreenWidthDp >= 600){

            if (isFirstRun) {

                // 6.5inch device or bigger
                dialog = new Dialog(MainActivity.this, R.style.Theme_AppCompat_Translucent);
                dialog.setContentView(R.layout.activity_overlay2_tab);

                TextView appointment = dialog.findViewById(R.id.appointment);
                appointment.setText("Tap to Book \n your Appointment");
                appointment.setTextSize(22);
                Animation textanimation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                appointment.startAnimation(textanimation1);

//                float text1size = getResources().getDimension(R.dimen.tab_text1_margin_start);
//                appointment.setPadding((int) text1size, 0, 0, 0);

                TextView notification = dialog.findViewById(R.id.notification);
                notification.setText("Tap to see \n new notifications");
                notification.setTextSize(22);

                ImageView arrow1 = dialog.findViewById(R.id.arrow1);
                arrow1.setImageResource(R.drawable.arrow1_removebg);
//                float arrow1size = getResources().getDimension(R.dimen.tab_arrow1_margin_start);
//                appointment.setPadding((int) arrow1size, 0, 0, 0);

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow1.startAnimation(animation1);

//            AnimationDrawable frameAnimation = (AnimationDrawable) arrow1.getBackground();
//            // Start the animation (looped playback by default).
//            frameAnimation.start();
//
                TextView add = dialog.findViewById(R.id.search_add);
                add.setText("Tap to add \n a patient");
                add.setTextSize(22);
                Animation textanimation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                add.startAnimation(textanimation2);

                TextView queue = dialog.findViewById(R.id.queue);
                queue.setText("Patient Queue \n 1. Click on menu button. \n 2. Click on add patient.");
                queue.setTextSize(40);

                ImageView arrow2 = dialog.findViewById(R.id.arrow2);
                arrow2.setImageResource(R.drawable.arrow2_removebg);
//                float arrow2size = getResources().getDimension(R.dimen.tab_arrow2_margin_start);
//                arrow2.setPadding((int) arrow2size, 0, 0, 0);

                ImageView arrow3 = dialog.findViewById(R.id.arrow3);
                arrow3.setImageResource(R.drawable.arrow3_removebg);
//                float arrow3size = getResources().getDimension(R.dimen.tab_arrow1_margin_start);
//                appointment.setPadding((int) arrow3size, 0, 0, 0);

                Animation animation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow3.startAnimation(animation2);

                dialog.setCancelable(true);
                dialog.show();


            }
            getSharedPreferences("PREFERENCE1", MODE_PRIVATE).edit().putBoolean("isFirstRun1", false).commit();

        }
        else{
            // smaller device
            if (isFirstRun) {
                //show start activity
                //startActivity(new Intent(MainActivity.this, Overlay.class));
                dialog = new Dialog(MainActivity.this, R.style.Theme_AppCompat_Translucent);
                dialog.setContentView(R.layout.activity_overlay2);

                TextView appointment = dialog.findViewById(R.id.appointment);
                appointment.setText("Tap to Book \n your Appointment");
                Animation textanimation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                appointment.startAnimation(textanimation1);

                TextView notification = dialog.findViewById(R.id.notification);
                notification.setText("Tap to see \n new notifications");

                ImageView arrow1 = dialog.findViewById(R.id.arrow1);
                arrow1.setImageResource(R.drawable.arrow1_removebg);
                float sizeInPixels = getResources().getDimension(R.dimen.arrow1_margin_end);
                arrow1.setPadding(0, 0, (int) sizeInPixels, 0);

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow1.startAnimation(animation1);

//            AnimationDrawable frameAnimation = (AnimationDrawable) arrow1.getBackground();
//            // Start the animation (looped playback by default).
//            frameAnimation.start();
//
                TextView add = dialog.findViewById(R.id.search_add);
                add.setText("Tap to add \n a patient");
                Animation textanimation4 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                add.startAnimation(textanimation4);

                TextView queue = dialog.findViewById(R.id.queue);
                queue.setText("Patient Queue \n 1. Click on menu button. \n 2. Click on add patient.");
                Animation animationQueue =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.fade);
                queue.startAnimation(animationQueue);

                ImageView arrow2 = dialog.findViewById(R.id.arrow2);
                arrow2.setImageResource(R.drawable.arrow2_removebg);
                float sizeInPixels2 = getResources().getDimension(R.dimen.arrow2_margin_end);
                arrow2.setPadding(0, 0, (int) sizeInPixels2, 0);

                Animation animation3 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow2.startAnimation(animation3);

                ImageView arrow3 = dialog.findViewById(R.id.arrow3);
                arrow3.setImageResource(R.drawable.arrow3_removebg);
                float sizeInPixels1 = getResources().getDimension(R.dimen.arrow3_margin_end);
                arrow3.setPadding(0, 0, (int) sizeInPixels1, 0);

                Animation animation2 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow3.startAnimation(animation2);

                dialog.setCancelable(true);
                dialog.show();

            }
            getSharedPreferences("PREFERENCE1", MODE_PRIVATE).edit().putBoolean("isFirstRun1", false).commit();

        }

    }
}
