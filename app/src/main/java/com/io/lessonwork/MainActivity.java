package com.io.lessonwork;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.io.lessonwork.first.FirstFragment;
import com.io.lessonwork.second.SecondFragment;
import com.io.lessonwork.third.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Date");
        adapter.addFragment(new SecondFragment(), "List");
        adapter.addFragment(new ThirdFragment(), "Images");
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);


    }
}