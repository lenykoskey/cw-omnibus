package com.karibunairobi;

import com.karibunairobi.R;

import android.R.integer;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Preview extends DashBoardActivity {

	@SuppressWarnings("deprecation")
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preview);
		Bundle bundle3 = getIntent().getExtras();

		final Integer bg = bundle3.getInt("background");
		final Integer position = bundle3.getInt("position");
		final Integer pos = bundle3.getInt("pos");
		// setContentView(R.layout.my_layout); // add this code
		LinearLayout ln = (LinearLayout) this.findViewById(R.id.linlay);
		if (pos == 2) {
			if (position < 5) {
				ln.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.uchumibg));
			}
			if ((position > 4) && (position < 10)) {
				ln.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.nakumattbg));
			}
			if ((position > 9) && (position < 15)) {
				ln.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.tuskybg));
			}
		}
		if (pos != 2) {
			ln.setBackgroundDrawable(getResources().getDrawable(bg));
		}

		// linearlayout.setBackgroundResource(R.drawable.FILENAME);

		Button btDescription = (Button) findViewById(R.id.btncall);
		Button btnmap = (Button) findViewById(R.id.btnmap);
		Button btnContact = (Button) findViewById(R.id.btnwebsite);

		// decode mode

		btDescription.setText("View Description");
		btnmap.setText("Check out map");
		btnContact.setText("View Contacts");
	}

	public void clickdescription(View v) {
		Intent viewdescription = new Intent(Preview.this, Description.class);
		Bundle bundle3 = getIntent().getExtras();

		final Integer bg = bundle3.getInt("background");
		final Integer position = bundle3.getInt("position");
		final Integer pos = bundle3.getInt("pos");

		Bundle bundle = getIntent().getExtras();
		
		Bundle bundle2 = new Bundle();
		bundle2.putInt("pos", pos);
		bundle2.putInt("position", position);
		bundle2.putInt("background", bg);

		viewdescription.putExtras(bundle2);

		startActivity(viewdescription);
	}

	public void viewmap(View v) {
		Intent viewmap = new Intent(Preview.this, MainActivity.class);
		
		Bundle bundle = getIntent().getExtras();
		viewmap.putExtras(bundle);
		startActivity(viewmap);

	}

	public void clickwebsite(View v) {
		Intent gowebsite = new Intent(Preview.this, Contact.class);
		// startActivity(viewdescription);
		Bundle bundle = getIntent().getExtras();
		gowebsite.putExtras(bundle);
		//
		// final String uri = bundle.getString("uri");
		// Intent gowebsite = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
		startActivity(gowebsite);
	}

}