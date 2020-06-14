package com.example.purpledocs_assign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public  int[] slide_images = {
            R.drawable.back,
            R.drawable.image7,
            R.drawable.image2,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image8
    };

    public String[] slide_headings = {
            "PATIENT QUEUE",
            "MENU",
            "SEARCH PATIENT",
            "SEARCH LIST",
            "EDIT APPOINTMENT",
            "REGISTER PATIENT"
    };

    public String[] slide_description = {
        "Depicts list of appointment. Click menu on right hand side to see further options.",
        "Different items are displayed. Click on any one.",
        "By clicking Search Record in the menu, search patient is shown. Any one field is mandatory to search a patient",
        "If the patient is registered, search list of related patients occurs. Click on required.",
        "Edit the appointment of patient selected",
        "If the patient is not registered, register patient appears."
    };

    public int[] slide_background = {
        R.drawable.background1,
        R.drawable.background2,
        R.drawable.background3,
        R.drawable.background4,
        R.drawable.background5,
        R.drawable.background6
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        TextView slideHeading = view.findViewById(R.id.heading);
        TextView slideDescription = view.findViewById(R.id.description);
        ImageView imageView = view.findViewById(R.id.image);
        RelativeLayout relativeLayout = view.findViewById(R.id.relativeLayout);

        imageView.setImageResource(slide_images[position]);
        relativeLayout.setBackgroundResource(slide_background[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
