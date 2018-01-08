package com.example.animationview;

import android.app.ActionBar;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void onAnimation (View view)
     {
         Animation an= AnimationUtils.loadAnimation(
                 this,
                 R.anim.mixed
         );

         findViewById(R.id.imageView).startAnimation(an);

     }
}
