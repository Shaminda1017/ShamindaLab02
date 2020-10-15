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

public class AbeysekaraDetHomeActivity extends AppCompatActivity {

    ListView detListView;

    int[] detImages = {R.drawable.det1,
            R.drawable.det2,
            R.drawable.det3,
            R.drawable.det4
    };

    String[] detDesc = {"$ 2500.00 \n57 Tichester Road - York, ON",
            "$ 2700.00 \n66 Erskine Avenue - Toronto, ON",
            "$ 2400.00 \n90 Bayview Avenue - East York, ON",
            "$ 3450.00 \n76 St Clair Avenue West - The Fleetwood - Toronto, ON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_list);

        detListView = (ListView) findViewById(R.id.shamindaList);

        activity_abeysekara_det abey_det = new  activity_abeysekara_det();
        detListView.setAdapter(abey_det);

        openCheckOutActivity();
    }
    class activity_abeysekara_det extends BaseAdapter {

        @Override
        public int getCount() {
            return detImages.length;
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

            ImageView detImageView = (ImageView) view.findViewById(R.id.shamindaImageView);
            TextView detTextview = (TextView) view.findViewById(R.id.shamindaTextView);


            detImageView.setImageResource(detImages[position]);
            detTextview.setText(detDesc[position]);

            return view;
        }
    }

    private void openCheckOutActivity(){
        Button button1 = (Button) findViewById(R.id.checkOutButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbeysekaraDetHomeActivity.this, AbeysekaraCheckOutActivity.class));
            }
        });
    }
}