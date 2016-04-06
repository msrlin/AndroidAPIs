package com.msrlin.androidapis.animations;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.msrlin.androidapis.R;

import java.util.Random;

/**
 * Created by Administrator on 2016/4/5.
 */
public class ScreenSlidePageFragment extends Fragment {
    Random random = new Random();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
        View view = rootView.findViewById(R.id.content);
        view.setBackgroundColor(Color.BLUE);
        return rootView;
    }

}