package com.hooper.pushshot2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

	Button playbtn;
	Button scoresbtn;
	Button helpbtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);

		playbtn = (Button) findViewById(R.id.playbtn);
		scoresbtn = (Button) findViewById(R.id.scoresbtn);
		helpbtn = (Button) findViewById(R.id.helpbtn);

		// Tell the Button Clicks

		playbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent openPlayAct = new Intent(
						"com.hooper.pushshot2.GameActivity");
				startActivity(openPlayAct);

			}
		});

		scoresbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openPlayAct = new Intent(
						"com.hooper.pushshot2.ScoresActivity");
				startActivity(openPlayAct);
			}
		});

		helpbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openPlayAct = new Intent(
						"com.hooper.pushshot2.HelpActivity");
				startActivity(openPlayAct);

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
