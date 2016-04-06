package com.msrlin.androidapis.scene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.TextView;

import com.msrlin.androidapis.R;

public class Main7Activity extends AppCompatActivity {

    private TextView mLabelText;
    private Fade mFade;
    private ViewGroup mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        // Create a new TextView and set some View properties
        mLabelText = new TextView(this);
        mLabelText.setText("Label");

// Get the root view and create a transition
        mRootView = (ViewGroup) findViewById(R.id.mainLayout);
        mFade = new Fade(Fade.IN);

// Start recording changes to the view hierarchy
        TransitionManager.beginDelayedTransition(mRootView, mFade);

// Add the new TextView to the view hierarchy
        mRootView.addView(mLabelText);

    }
}
