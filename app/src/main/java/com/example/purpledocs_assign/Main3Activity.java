package com.example.purpledocs_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Dialog dialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Boolean isFirstRun3 = getSharedPreferences("PREFERENCE3", MODE_PRIVATE)
                .getBoolean("isFirstRun3", true);

        Configuration config2 = getResources().getConfiguration();

        if (config2.smallestScreenWidthDp >= 600){
            if (isFirstRun3){
                dialog2 = new Dialog(Main3Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog2.setContentView(R.layout.overlay4_tablet);

                ImageView arrow9 = dialog2.findViewById(R.id.arrow9);
                arrow9.setImageResource(R.drawable.arrow10_removebg);
                Animation animation8 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow9.startAnimation(animation8);

                TextView consultation = dialog2.findViewById(R.id.consultation);
                consultation.setText("Tap to select \n consultation type");

                ImageView arrow10 = dialog2.findViewById(R.id.arrow10);
                arrow10.setImageResource(R.drawable.arrow11_removebg);
                Animation animation9 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow10.startAnimation(animation9);

                TextView caseno2 = dialog2.findViewById(R.id.caseno2);
                caseno2.setText("Tap to write \n case no. of patient");


                TextView symptoms = dialog2.findViewById(R.id.symptons);
                symptoms.setText("Tap to enter \nsymptoms of patient");

                TextView diagnosis = dialog2.findViewById(R.id.diagnosis);
                diagnosis.setText("Tap to enter \ndiagnosis of patient");

                TextView doctor = dialog2.findViewById(R.id.doctor);
                doctor.setText("Tap to select \n the doctor");

                ImageView arrow11 = dialog2.findViewById(R.id.arrow11);
                arrow11.setImageResource(R.drawable.arrow10_removebg);
                Animation animation10 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow11.startAnimation(animation10);

                TextView visitors_type = dialog2.findViewById(R.id.visitor_type);
                visitors_type.setText("Tap to select \n visitor's type");

                ImageView arrow12 = dialog2.findViewById(R.id.arrow12);
                arrow12.setImageResource(R.drawable.arrow10_removebg);
                Animation animation11 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow12.startAnimation(animation11);

                TextView patient_type = dialog2.findViewById(R.id.patient_type);
                patient_type.setText("Tap to select \n patient's type");

                ImageView arrow13 = dialog2.findViewById(R.id.arrow13);
                arrow13.setImageResource(R.drawable.arrow12_removebg);
                Animation animation12 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow13.startAnimation(animation12);

                TextView date = dialog2.findViewById(R.id.date);
                date.setText("Tap to select \nappointment date");

                ImageView arrow14 = dialog2.findViewById(R.id.arrow14);
                arrow14.setImageResource(R.drawable.arrow13_removebg);
                Animation animation13 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow14.startAnimation(animation13);

                TextView time = dialog2.findViewById(R.id.time);
                time.setText("Tap to \nselect \nappointment \ntime");

                dialog2.setCancelable(true);
                dialog2.show();

            }
            getSharedPreferences("PREFERENCE3", MODE_PRIVATE).edit().putBoolean("isFirstRun3", false).commit();
        }else {
            if (isFirstRun3){
                dialog2 = new Dialog(Main3Activity.this, R.style.Theme_AppCompat_Translucent);
                dialog2.setContentView(R.layout.overlay4);

                ImageView arrow9 = dialog2.findViewById(R.id.arrow9);
                arrow9.setImageResource(R.drawable.arrow10_removebg);
                Animation animation8 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow9.startAnimation(animation8);

                TextView consultation = dialog2.findViewById(R.id.consultation);
                consultation.setText("Tap to select \n consultation type");

                ImageView arrow10 = dialog2.findViewById(R.id.arrow10);
                arrow10.setImageResource(R.drawable.arrow11_removebg);
                Animation animation9 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow10.startAnimation(animation9);

                TextView caseno2 = dialog2.findViewById(R.id.caseno2);
                caseno2.setText("Tap to write \n case no. of patient");

                TextView symptoms = dialog2.findViewById(R.id.symptons);
                symptoms.setText("Tap to enter \nsymptoms of patient");

                TextView diagnosis = dialog2.findViewById(R.id.diagnosis);
                diagnosis.setText("Tap to enter \ndiagnosis of patient");

                TextView doctor = dialog2.findViewById(R.id.doctor);
                doctor.setText("Tap to select \n the doctor");

                ImageView arrow11 = dialog2.findViewById(R.id.arrow11);
                arrow11.setImageResource(R.drawable.arrow10_removebg);
                Animation animation10 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow11.startAnimation(animation10);

                TextView visitors_type = dialog2.findViewById(R.id.visitor_type);
                visitors_type.setText("Tap to select \n visitor's type");

                ImageView arrow12 = dialog2.findViewById(R.id.arrow12);
                arrow12.setImageResource(R.drawable.arrow10_removebg);
                Animation animation11 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow12.startAnimation(animation11);

                TextView patient_type = dialog2.findViewById(R.id.patient_type);
                patient_type.setText("Tap to select \n patient's type");

                ImageView arrow13 = dialog2.findViewById(R.id.arrow13);
                arrow13.setImageResource(R.drawable.arrow12_removebg);
                Animation animation12 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow13.startAnimation(animation12);

                TextView date = dialog2.findViewById(R.id.date);
                date.setText("Tap to select \nappointment date");

                ImageView arrow14 = dialog2.findViewById(R.id.arrow14);
                arrow14.setImageResource(R.drawable.arrow13_removebg);
                Animation animation13 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink);
                arrow14.startAnimation(animation13);

                TextView time = dialog2.findViewById(R.id.time);
                time.setText("Tap to \nselect \nappointment \ntime");

                dialog2.setCancelable(true);
                dialog2.show();

            }

            getSharedPreferences("PREFERENCE3", MODE_PRIVATE).edit().putBoolean("isFirstRun3" ,false).commit();
        }
    }
}
