package com.example.ukrainetouristic.placeInfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.ukrainetouristic.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Place_info_activity extends AppCompatActivity {

    private ViewPager mMyViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMyViewPager = findViewById(R.id.view_pager);
        mTabLayout = findViewById(R.id.tab_layout);
        init();
    }

    private void init() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        Hat[] hats = Hats.getHats();
        for (Hat hat : hats) {
            ViewPagerItemFragment fragment = ViewPagerItemFragment.getInstance(hat);
            fragments.add(fragment);
        }
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);
        mMyViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mMyViewPager, true);
    }
}
