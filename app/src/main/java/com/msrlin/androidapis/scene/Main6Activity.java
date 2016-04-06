package com.msrlin.androidapis.scene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.ViewGroup;

import com.msrlin.androidapis.R;

public class Main6Activity extends AppCompatActivity {

    ViewGroup mSceneRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Scene mAScene;
        Scene mAnotherScene;

        // Create the scene root for the scenes in this app
        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);

        // Create the scenes
        mAScene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, this);
        mAnotherScene =
                Scene.getSceneForLayout(mSceneRoot, R.layout.another_scene, this);

        Transition mFadeTransition =
                TransitionInflater.from(this).
                        inflateTransition(R.transition.fade_transition);
      //  Transition mFadeTransition = new Fade();

        TransitionManager.go(mAScene, mFadeTransition);

    }
}
