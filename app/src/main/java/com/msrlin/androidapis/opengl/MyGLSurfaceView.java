package com.msrlin.androidapis.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;


/**
 * Created by msrlin on 2016/1/22.
 */
public class MyGLSurfaceView  extends GLSurfaceView{
    private final MyGLRenderer myGLRenderer;

    public MyGLSurfaceView(Context context){
                super(context);
            setEGLContextClientVersion(2);  // Create an OpenGL ES 2.0 context
        myGLRenderer= new MyGLRenderer();
        setRenderer(myGLRenderer);
        }
    }



