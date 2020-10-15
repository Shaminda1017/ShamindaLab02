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

public class AbeysekaraCondoActivity extends AppCompatActivity {

    ListView condoListView;

    int[] condoImages = {R.drawable.condo1,
            R.drawable.condo2,
            R.drawable.condo3,
            R.drawable.condo4
    };

    String[] condoDesc = {"$ 1900.00 \n25 Tichester Road - York, ON",
            "$ 1400.00 \n100 Erskine Avenue - Toronto, ON",
            "$ 2500.00 \n109 Bayview Avenue - East York, ON",
            "$ 1750.00 \n20 St Clair Avenue West - The Fleetwood - Toronto, ON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_list);

        condoListView = (ListView) findViewById(R.id.shamindaList);

        activity_abeysekara_condo abey_condo = new activity_abeysekara_condo();
        condoListView.setAdapter(abey_condo);

        openCheckOutActivity();
    }
    class activity_abeysekara_condo extends BaseAdapter {

        @Override
        public int getCount() {
            return condoImages.length;
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

            ImageView condoImageView = (ImageView) view.findViewById(R.id.shamindaImageView);
            TextView condoTextview = (TextView) view.findViewById(R.id.shamindaTextView);


            condoImageView.setImageResource(condoImages[position]);
            condoTextview.setText(condoDesc[position]);

            return view;
        }
    }

    private void openCheckOutActivity(){
        Button button1 = (Button) findViewById(R.id.checkOutButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbeysekaraCondoActivity.this, AbeysekaraCheckOutActivity.class));
            }
        });
    }
}