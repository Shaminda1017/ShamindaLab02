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

public class AbeysekaraSemiDetActivity extends AppCompatActivity {

    ListView semiListView;

    int[] semiImages = {R.drawable.semi1,
            R.drawable.semi2,
            R.drawable.semi3,
            R.drawable.semi4
    };

    String[] semiDesc = {"$ 1500.00 \n14-300 Blackwater Road - York, ON",
            "$ 1700.00 \n18 Neilson Avenue - Toronto, ON",
            "$ 1800.00 \n1221 Shepard Avenue - East York, ON",
            "$ 1950.00 \n5 Victoria Park Avenue West - The Fleetwood - Toronto, ON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_list);

        semiListView = (ListView) findViewById(R.id.shamindaList);

        activity_abeysekara_semi_det abey_semi = new activity_abeysekara_semi_det();
        semiListView.setAdapter(abey_semi);

        openCheckOutActivity();
    }
    class activity_abeysekara_semi_det extends BaseAdapter {

        @Override
        public int getCount() {
            return semiImages.length;
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

            ImageView semiImageView = (ImageView) view.findViewById(R.id.shamindaImageView);
            TextView semiTextview = (TextView) view.findViewById(R.id.shamindaTextView);


            semiImageView.setImageResource(semiImages[position]);
            semiTextview.setText(semiDesc[position]);

            return view;
        }
    }

    private void openCheckOutActivity(){
        Button button1 = (Button) findViewById(R.id.checkOutButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbeysekaraSemiDetActivity.this, AbeysekaraCheckOutActivity.class));
            }
        });
    }
}