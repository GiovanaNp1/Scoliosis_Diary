package com.example.giovana.teste;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AjudaActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdpter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);
        viewPager= (ViewPager)findViewById(R.id.viewpager);
        myadapter = new SlideAdpter(this);
        viewPager.setAdapter(myadapter);
    }
}