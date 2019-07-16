package com.apriltech.apps.olugbadeshinaalc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myprofile);
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_profile, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
        TextView name, email, phone_number, slack;

        name = findViewById(R.id.tvw_profile_name);
        email =  findViewById(R.id.tvw3);
        phone_number = findViewById(R.id.tvw4);
        slack = findViewById(R.id.tvw5);

        String output = "Name: "+name.getText().toString()+"\nEmail: "+email.getText().toString()+"\nPhone number: "+
                phone_number.getText().toString()+"\nSlack: "+slack.getText().toString();

		int itemId = item.getItemId();

		if (itemId == R.id.menu_share) {
		    Intent intent = new Intent(Intent.ACTION_SEND);
		    intent.putExtra(Intent.EXTRA_TEXT, output);
		    intent.setType("text/plain");
		    startActivity(intent);
		}

		return super.onOptionsItemSelected(item);
	}
 
}
