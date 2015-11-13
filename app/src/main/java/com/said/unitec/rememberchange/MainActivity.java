package com.said.unitec.rememberchange;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private static int NOTIFICATION_ID = 3224441;

	private int INTERVAL_ALARM = 1000*60;
	private TTSManager ttsManager = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*Intent notificationIntent = new Intent(getBaseContext(), ShowNotification.class);
		PendingIntent contentIntent = PendingIntent.getService(getBaseContext(), 0, notificationIntent,
				PendingIntent.FLAG_CANCEL_CURRENT);

		AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
		alarmManager.cancel(contentIntent);
		alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,
				System.currentTimeMillis(), INTERVAL_ALARM, contentIntent);*/

		ttsManager = new TTSManager();
		ttsManager.init(this);

	}

	public void onAboutBtn(View v){
		ttsManager.initQueue("Does the flap of a butterfly’s wings in Brazil set off a tornado in Texas?");
		Intent myIntent = new Intent(this, AboutActivity.class);
		startActivity(myIntent);
	}

	public void atHomeBtn(View v){
		ttsManager.initQueue("You can help to Fight against climate change!");
		Intent myIntent = new Intent(this, AtHomeActivity.class);
		startActivity(myIntent);
	}

	public void onHarmBtn(View v){
		ttsManager.initQueue("Do you know about harm chain?");
		Intent myIntent = new Intent(this, HarmActivity.class);
		startActivity(myIntent);
	}

	public void onChartBtn(View v){
		ttsManager.initQueue("Learn some tips that could help you");
		Intent myIntent = new Intent(this, Chart.class);
		startActivity(myIntent);
	}

	public void onVideoBtn(View v){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hlvUKI_QBFc")));
	}
}