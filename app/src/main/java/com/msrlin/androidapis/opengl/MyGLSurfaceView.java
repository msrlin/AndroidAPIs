package com.msrlin.androidapis.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by msrlin on 2016/1/22.
 */
public class MyGLSurfaceView  extends GLSurfaceView{
    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context){
                super(context);
            setEGLContextClientVersion(2);  // Create an OpenGL ES 2.0 context

        }
    }



}
