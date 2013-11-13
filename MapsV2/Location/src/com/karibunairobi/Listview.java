package com.karibunairobi;

import com.karibunairobi.R;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Listview extends Activity {
	private List<ListItems> myItems = new ArrayList<ListItems>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitymain);

		populateCarList();
		populateListView();
		registerClickCallback();
	}

	private void populateCarList() {
		Bundle bundle = getIntent().getExtras();
		final Integer poss = bundle.getInt("pos");
		// Integer poss = Integer.parseInt(pos);

		switch (poss) {

		case 1:
			myItems.add(new ListItems("Hilton", R.drawable.hilton,
					"Needing work"));
			myItems.add(new ListItems("Nairobi Serena", R.drawable.serena,
					"Lovable"));
			myItems.add(new ListItems("Nairobi Safari Club",
					R.drawable.safariclub, "Wet"));
			myItems.add(new ListItems("Laico Regency", R.drawable.laicoregency,
					"Fast!"));
			myItems.add(new ListItems("Fairmont The Norfolk",
					R.drawable.fairmont, "Awesome"));
			myItems.add(new ListItems("Panari", R.drawable.panari,
					"Not *very* good"));
			myItems.add(new ListItems("Ole Sereni", R.drawable.olesereni,
					"Out of this world"));
			myItems.add(new ListItems("The Giraffe Manor",
					R.drawable.giraffemanor, "Out of this world"));
			myItems.add(new ListItems("Mokoyeti Resort",
					R.drawable.mokoyetiresort, "Out of this world"));
			myItems.add(new ListItems("Java House", R.drawable.javahouse,
					"Out of this world"));
			myItems.add(new ListItems("The Thorn Tree Cafe",
					R.drawable.thorntree, "Out of this world"));
			myItems.add(new ListItems("Cafe Maghreb", R.drawable.maghreb,
					"Out of this world"));
			myItems.add(new ListItems("Debonairs", R.drawable.debonairs,
					"Out of this world"));
			myItems.add(new ListItems("Steers", R.drawable.streers,
					"Out of this world"));
			myItems.add(new ListItems("Cafe Deli", R.drawable.cafedeli,
					"Out of this world"));
			break;

		case 2:
			myItems.add(new ListItems("Uchumi Westlands",
					R.drawable.uchumilarge, "Out of this world"));
			myItems.add(new ListItems("Uchumi Langata Hyper",
					R.drawable.uchumilarge, "Lovable"));
			myItems.add(new ListItems("Uchumi Capital Centre",
					R.drawable.uchumilarge, "Wet"));
			myItems.add(new ListItems("Uchumi Ngong Hyper",
					R.drawable.uchumilarge, "Fast!"));
			myItems.add(new ListItems("Uchumi Sarit", R.drawable.uchumilarge,
					"Awesome"));

			myItems.add(new ListItems("Nakumatt Mega", R.drawable.nakumatt,
					"Out of this world"));
			myItems.add(new ListItems("Nakumatt Ukay", R.drawable.nakumatt,
					"Out of this world"));
			myItems.add(new ListItems("Nakumatt Lifestyle",
					R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Embakasi", R.drawable.nakumatt,
					"Out of this world"));
			myItems.add(new ListItems("Nakumatt Juction", R.drawable.nakumatt,
					"Out of this world"));

			myItems.add(new ListItems("Tuskys T-Mall", R.drawable.tuskys,
					"Needing work"));
			myItems.add(new ListItems("Tuskys Imara", R.drawable.tuskys,
					"Lovable"));
			myItems.add(new ListItems("Tuskys Greenspan", R.drawable.tuskys,
					"Wet"));
			myItems.add(new ListItems("Tuskys Express", R.drawable.tuskys,
					"Fast!"));
			myItems.add(new ListItems("Tuskys Embakasi", R.drawable.tuskys,
					"Awesome"));

			break;

		case 3:
			myItems.add(new ListItems("Focus Cabs", R.drawable.focuscabs,
					"Needing work"));
			myItems.add(new ListItems("Jatco Cabs", R.drawable.jatco, "Lovable"));
			myItems.add(new ListItems("JimCab Kenya", R.drawable.jimcab, "Wet"));
			myItems.add(new ListItems("Universal Cabs", R.drawable.yellowcab,
					"Fast!"));
			myItems.add(new ListItems("Summit Safaris Cabs", R.drawable.summit,
					"Awesome"));

			break;

		case 4:
			myItems.add(new ListItems("Nairobi National Park",
					R.drawable.kwslogo, "Needing work"));
			myItems.add(new ListItems("Karen Blixen Museum",
					R.drawable.karenblix, "Lovable"));
			myItems.add(new ListItems("Nairobi Gallery", R.drawable.nmknewlogo,
					"Awesome"));
			myItems.add(new ListItems("Nairobi National Museum",
					R.drawable.nmknewlogo, "Not *very* good"));
			myItems.add(new ListItems("Nairobi Snake Park",
					R.drawable.nmknewlogo, "Fast!"));
			myItems.add(new ListItems("Mamba Village", R.drawable.mambalogo,
					"Not *very* good"));
			myItems.add(new ListItems("Uhuru Park", R.drawable.uhurupark, "Wet"));

			break;

		case 5:
			myItems.add(new ListItems("The Carnivore Nightclub",
					R.drawable.carnivorelogo, "Needing work"));
			myItems.add(new ListItems("Klub House(K1)", R.drawable.k1logo,
					"Lovable"));
			myItems.add(new ListItems("Rafikiz Bar & Lounge",
					R.drawable.rafikiz, "Wet"));
			myItems.add(new ListItems("Casablanca", R.drawable.casablanca,
					"Fast!"));
			myItems.add(new ListItems("Taboo", R.drawable.yellowcab, "Awesome"));

			break;
		case 6:

			myItems.add(new ListItems("Embakasi", R.drawable.bus_,
					"Needing work"));
			myItems.add(new ListItems("Parklands", R.drawable.bus_, "Lovable"));
			myItems.add(new ListItems("Westlands", R.drawable.bus_, "Wet"));
			myItems.add(new ListItems("Langata", R.drawable.bus_, "Fast!"));
			myItems.add(new ListItems("Karen", R.drawable.bus_, "Awesome"));
			myItems.add(new ListItems("Upperhill", R.drawable.bus_,
					"Not *very* good"));

			break;
		}

	}

	private void populateListView() {
		Bundle bundle = getIntent().getExtras();
		final String Header = bundle.getString("Header");
		TextView HeaderText = (TextView) findViewById(R.id.txtMade);
		HeaderText.setText(Header);

		ArrayAdapter<ListItems> adapter = new MyListAdapter();

		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}

	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {

				ListItems clickedCar = myItems.get(position);
				
				String title = clickedCar.getMake();

				Intent intent;
				Bundle bundle = getIntent().getExtras();
				final Integer pos = bundle.getInt("pos");
				// Integer pos2 = Integer.parseInt(pos);
				final Integer bg = bundle.getInt("background");
				intent = new Intent(Listview.this, Preview.class);
				Bundle bundle2 = new Bundle();
				bundle2.putInt("pos", pos);
			
				bundle2.putInt("position", position);
				bundle2.putInt("background", bg);
				bundle2.putString("title",title);
				intent.putExtras(bundle2);
				startActivity(intent);

			}
		});
	}

	private class MyListAdapter extends ArrayAdapter<ListItems> {
		public MyListAdapter() {
			super(Listview.this, R.layout.item_view, myItems);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view,
						parent, false);
			}

			// Find the car to work with.
			ListItems currentCar = myItems.get(position);

			// Fill the view
			ImageView imageView = (ImageView) itemView
					.findViewById(R.id.item_icon);
			imageView.setImageResource(currentCar.getIconID());

			// Fill the background
			// ImageView imageView = (ImageView)itemView.findViewById(R.id.);
			// imageView.setImageResource(currentCar.getIconID());

			// Make:
			TextView makeText = (TextView) itemView
					.findViewById(R.id.item_txtMake);
			makeText.setText(currentCar.getMake());

			// Year:
			// TextView yearText = (TextView)
			// itemView.findViewById(R.id.item_txtYear);
			// yearText.setText("" + currentCar.getYear());

			// Condition:
			// TextView condionText = (TextView)
			// itemView.findViewById(R.id.item_txtCondition);
			// condionText.setText(currentCar.getCondition());

			return itemView;
		}
	}
}