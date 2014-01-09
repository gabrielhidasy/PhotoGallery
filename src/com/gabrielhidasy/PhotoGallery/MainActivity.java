package com.gabrielhidasy.PhotoGallery;

import android.app.Activity;    
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener {

    /** Called when the activity is first created. */

    int image_index = 0;
    private static final int MAX_IMAGE_COUNT = 5;
    private Integer[] mImageIds = {
		R.raw.red,
		R.raw.blue,
		R.raw.green,
		R.raw.black,
		R.raw.white
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		View v = (View) findViewById(R.id.myimage);
		v.setOnClickListener(this);
        showImage();        
    }

    private void showImage() {             
		ImageView imgView = (ImageView) findViewById(R.id.myimage);
        imgView.setImageResource(mImageIds[image_index%5]);       

    }
    public void onClick(View v) {
        image_index++;
        if (image_index == MAX_IMAGE_COUNT) {               
			image_index = 0;                
			}
            showImage();      
        }
	}

