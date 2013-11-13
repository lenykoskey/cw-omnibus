package com.karibunairobi;

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

		TextView HeaderText = (TextView) findViewById(R.id.textView1);
		StringBuffer sb = new StringBuffer();
		int position2 = position + 1;
		sb.append("c").append(pos).append(position2);
		String result = sb.toString();
		int resID = getResources().getIdentifier(result, "string",
				getPackageName());
		String strTest = getResources().getString(resID);

		HeaderText.setText(strTest);

	}

}
