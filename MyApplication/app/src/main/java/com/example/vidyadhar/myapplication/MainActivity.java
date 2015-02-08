package com.example.vidyadhar.myapplication;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpView();
        setUpFragment();
    }

    void setUpView() {
        setContentView(R.layout.activity_main);
    }

    void setUpFragment() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        SlidingFragment fragment = new SlidingFragment();
        transaction.replace(R.id.sample_content_fragment, fragment);
        transaction.commit();
    }
}