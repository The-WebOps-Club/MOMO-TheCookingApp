package com.example.momo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);
        
        Button b = (Button)findViewById(R.id.fp_about);
        //b.setText("hi");
        
        b.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Button b2 = (Button)findViewById(R.id.fp_about);
		        b2.setText("hi");
				
				Intent i=new Intent(MainActivity.this,AboutActivity.class);
				startActivity(i);
			}
			
			
		});
        
    }


}
