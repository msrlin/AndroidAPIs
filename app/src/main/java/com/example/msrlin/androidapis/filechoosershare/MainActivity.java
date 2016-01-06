package com.example.msrlin.androidapis.filechoosershare;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.msrlin.androidapis.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Uri> imageUris=(ArrayList<Uri>) addData();

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "send to"));


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND_MULTIPLE);
                shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, imageUris);
                shareIntent.setType("image/*");
                startActivity(Intent.createChooser(shareIntent, "Share images to.."));
            }
        });
    }



    private List<Uri> addData(){
        ArrayList<Uri> imageUris = new ArrayList<Uri>();
       String path= Environment.getExternalStorageDirectory()+File.separator+
               "Pictures"+File.separator+"Screenshots";
        Uri imageUri1=Uri.fromFile(new File(path+File.separator+"IMG_20151001_004514.jpg"));
        Uri imageUri2=Uri.fromFile(new File(path+File.separator+"Screenshot_2015-09-27-20-49-28.jpeg"));
        Log.i("imageUri1-imageUri1",imageUri1.compareTo(imageUri1)+"");
        Log.i("imageUri1-imageUri2",imageUri1.compareTo(imageUri2)+"");
        imageUris.add(imageUri1); // Add your image URIs here
        imageUris.add(imageUri2);
        return imageUris;
    }


}
