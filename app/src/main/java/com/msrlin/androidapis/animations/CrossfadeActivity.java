package com.msrlin.androidapis.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.msrlin.androidapis.R;

public class CrossfadeActivity extends AppCompatActivity {

    private View mContentView;
    private View mLoadingView;
    private int mAnimationDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfade);

        mContentView = findViewById(R.id.content);
        mLoadingView = findViewById(R.id.loading_spinner);

        // Initially hide the content view.
        mContentView.setVisibility(View.GONE);

        // Retrieve and cache the system's default "short" animation time.
        mAnimationDuration = getResources().getInteger(
                android.R.integer.config_longAnimTime);
        Log.i("mShortAnimationDuration", Integer.toString(mAnimationDuration));
        crossfade();
    }


    private void crossfade() {

        mContentView.setAlpha(0f);
        mContentView.setVisibility(View.VISIBLE);
        mContentView.animate()
                .alpha(1f)
                .setDuration(2000)
                .setListener(null);


        mLoadingView.animate()
                .alpha(0f)
                .setDuration(2000)
                .setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mLoadingView.setVisibility(View.GONE);
            }
        });

    }
}
