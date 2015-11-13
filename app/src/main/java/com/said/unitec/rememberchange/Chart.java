package com.said.unitec.rememberchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

public class Chart extends AppCompatActivity implements GestureDetector.OnDoubleTapListener{
	private boolean zoomed = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chart);


	}

	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) {
		return false;
	}

	@Override
	public boolean onDoubleTap(MotionEvent e) {
		ImageView charImg = (ImageView) findViewById(R.id.charImg);

		Log.d("ee", "zoom?");

		if(!zoomed) {
			charImg.setScaleX(2);
			charImg.setScaleY(2);
		}else{
			charImg.setScaleX(1);
			charImg.setScaleY(1);
		}

		zoomed = !zoomed;

		return false;
	}

	@Override
	public boolean onDoubleTapEvent(MotionEvent e) {
		return false;
	}
}
