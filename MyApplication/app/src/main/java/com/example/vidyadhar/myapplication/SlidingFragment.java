package com.example.vidyadhar.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SlidingFragment extends Fragment {

    private SlidingTabLayout mSlidingTabLayout;

    private ViewPager mViewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        setUpPager(view);
        //setUpTabColor();
    }

    void setUpPager(View view) {
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);

        mViewPager.setAdapter(new TabsPagerAdapter(getActivity()));
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
/*
    void setUpTabColor() {
        mSlidingTabLayout.setCustomTabColorizer(new TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {

                return SlidingFragment.this.getResources().getColor(R.color.red);
            }

            @Override
            public int getDividerColor(int position) {
                return SlidingFragment.this.getResources().getColor(R.attr.color.red);
            }
        });
    }

*/

}
