package com.example.sss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import com.jsibbold.zoomage.ZoomageView;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    ImageButton next,previous;

    ZoomageView image1,image2,image3,image4,image5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper=findViewById(R.id.viewFlipper);
        next=findViewById(R.id.next);

        previous=findViewById(R.id.previous);

        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        image5=findViewById(R.id.image5);






 //>>>>>>>>>>>>>>>>>> github  code libary https://github.com/jsibbold/zoomage?tab=readme-ov-file  >>>>>>>>>>>









        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewFlipper.showNext();

            }
        });



         previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewFlipper.showPrevious();




            }
        });







    }
}