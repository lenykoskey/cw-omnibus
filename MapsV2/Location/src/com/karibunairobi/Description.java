package com.karibunairobi;

import android.R.integer;
import android.content.Context;
import android.content.Intent;
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
				ln.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.uchumilarge));

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
