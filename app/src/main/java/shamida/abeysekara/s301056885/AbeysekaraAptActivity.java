package shamida.abeysekara.s301056885;

//ShamindaAbeysekara_301056885_Sec002
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

public class AbeysekaraAptActivity extends AppCompatActivity {
    private Button checkOutButton;
    ListView aptListView;

    int[] aptImages = {R.drawable.apt1,
            R.drawable.apt2,
            R.drawable.apt3,
            R.drawable.apt4
    };

    String[] aptDesc = {"$ 1700.00 \n14-300 Tichester Road - York, ON",
            "$ 1500.00 \n18 Erskine Avenue - Toronto, ON",
            "$ 2000.00 \n1299 Bayview Avenue - East York, ON",
            "$ 1450.00 \n64 St Clair Avenue West - The Fleetwood - Toronto, ON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_list);

        aptListView = (ListView) findViewById(R.id.shamindaList);

        abeysekara_apt_custom_layout abey_apt_custom_layout = new abeysekara_apt_custom_layout();
        aptListView.setAdapter(abey_apt_custom_layout);

        openCheckOutActivity();
    }
    class abeysekara_apt_custom_layout extends BaseAdapter {

        @Override
        public int getCount() {
            return aptImages.length;
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

            ImageView aptImageView = (ImageView) view.findViewById(R.id.shamindaImageView);
            TextView aptTextview = (TextView) view.findViewById(R.id.shamindaTextView);


            aptImageView.setImageResource(aptImages[position]);
            aptTextview.setText(aptDesc[position]);

            return view;
        }
    }
    private void openCheckOutActivity(){
        Button button1 = (Button) findViewById(R.id.checkOutButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbeysekaraAptActivity.this, AbeysekaraCheckOutActivity.class));
            }
        });
    }
}