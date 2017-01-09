package com.example.activity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	Button helBut;
	TextView textHel;
	EditText textInput2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		helBut = (Button) findViewById(R.id.b1);
		textInput2 = (EditText) findViewById(R.id.text_2);
		helBut.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String data1 = textInput2.getText().toString();
				Intent i = new Intent(MainActivity.this, ScndActivity.class);
				i.putExtra("username", data1);
				startActivity(i);

			}
		});
	}

}
