package com.karibunairobi;

import android.R.integer;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.karibunairobi.R;

public class Description extends DashBoardActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.description);

		Bundle bundle = getIntent().getExtras();
		final Integer pos = bundle.getInt("pos");
		final Integer position = bundle.getInt("position");
		final Integer bg = bundle.getInt("background");
		TextView HeaderText = (TextView) findViewById(R.id.textView1);
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
		if (pos == 3) {
			HeaderText.setTextColor(Color.parseColor("#561314"));
		}
		if (pos == 4) {
			HeaderText.setTextColor(Color.parseColor("#ffffff"));
		}
		int position2 = position + 1;
		// char[] ls = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		//
		// String r = "";
		// String p = "";
		// String a = pos + r;
		// String b = position + r;
		// r = ls[pos % 26] + r;
		// p= ls[position % 26] + p;

		StringBuffer sb = new StringBuffer();
		sb.append("d").append(pos).append(position2);
		String result = sb.toString();
		int resID = getResources().getIdentifier(result, "string",
				getPackageName());
		String strTest = getResources().getString(resID);

		HeaderText.setText(strTest);
		// String a = pos + r;

	}

}
