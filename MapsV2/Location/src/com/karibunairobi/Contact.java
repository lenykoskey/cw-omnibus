package com.karibunairobi;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.karibunairobi.R;

public class Contact extends DashBoardActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.description);

		Bundle bundle = getIntent().getExtras();
		final Integer pos = bundle.getInt("pos");
		final Integer position = bundle.getInt("position");
		final Integer bg = bundle.getInt("background");
		LinearLayout ln = (LinearLayout) this.findViewById(R.id.linlaydesc);
		
		if (pos == 2) {
			// HeaderText.setTextColor(232323);
			if (position < 5) {
				//ln.setBackgroundDrawable(getResources().getDrawable(
				//		R.drawable.uchumilargej));
				ln.setBackgroundColor(Color.parseColor("#ff0000"));

			}
			if ((position > 4) && (position < 10)) {
//				ln.setBackgroundDrawable(getResources().getDrawable(
//						R.drawable.nakumattbg));
				ln.setBackgroundColor(Color.parseColor("#183579"));
			}
			if ((position > 9) && (position < 15)) {
//				ln.setBackgroundDrawable(getResources().getDrawable(
//						R.drawable.tuskybg));
				ln.setBackgroundColor(Color.parseColor("#45734f"));
			}
		}
		if (pos != 2) {
			ln.setBackgroundDrawable(getResources().getDrawable(bg));
		}
		if ((pos == 3) || (pos == 4)) {
			TextView HeaderText = (TextView) findViewById(R.id.textView1);
			HeaderText.setTextColor(Color.parseColor("#561314"));
		}
		TextView headerTextVie = (TextView) findViewById(R.id.textView1);
		StringBuffer sb = new StringBuffer();
		int position2 = position + 1;
		sb.append("c").append(pos).append(position2);
		String result = sb.toString();
		int resID = getResources().getIdentifier(result, "string",
				getPackageName());
		String strTest = getResources().getString(resID);
		TextView HeaderText = (TextView) findViewById(R.id.textView1);
		HeaderText.setText(strTest);

	}

}
