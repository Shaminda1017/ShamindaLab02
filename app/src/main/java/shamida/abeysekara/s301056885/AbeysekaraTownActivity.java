package shamida.abeysekara.s301056885;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AbeysekaraTownActivity extends AppCompatActivity {

    ListView townListView;

    int[] townImages = {R.drawable.town1,
            R.drawable.town2,
            R.drawable.town3,
            R.drawable.town4
    };

    String[] townDesc = {"$ 1400.00 \n80 O'Corner Road - York, ON",
            "$ 1350.00 \n20 Markham Road - Toronto, ON",
            "$ 1700.00 \n34 Fairglen Avenue - East York, ON",
            "$ 1750.00 \n14 Finch Avenue West- Toronto, ON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_list);

        townListView = (ListView) findViewById(R.id.shamindaList);

        activity_abeysekara_town abey_town = new activity_abeysekara_town();
        townListView.setAdapter(abey_town);

        openCheckOutActivity();
    }

    class activity_abeysekara_town extends BaseAdapter {

        @Override
        public int getCount() {
            return townImages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.abeysekara_custom_layout, null);

            ImageView townImageView = (ImageView) view.findViewById(R.id.shamindaImageView);
            TextView townTextview = (TextView) view.findViewById(R.id.shamindaTextView);


            townImageView.setImageResource(townImages[position]);
            townTextview.setText(townDesc[position]);

            return view;
        }
    }

    private void openCheckOutActivity(){
        Button button1 = (Button) findViewById(R.id.checkOutButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbeysekaraTownActivity.this, AbeysekaraCheckOutActivity.class));
            }
        });
    }
}