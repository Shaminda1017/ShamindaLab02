package shamida.abeysekara.s301056885;

//ShamindaAbeysekara_301056885_Sec002
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AbeysekaraHomeTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_home_type);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_type_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.shamindaItem1:
                //Toast.makeText(this, "Hi how", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AbeysekaraHomeTypeActivity.this, AbeysekaraAptActivity.class);
                startActivity(intent);
                return true;

            case R.id.shamindaItem2:
                Intent intent1 = new Intent(AbeysekaraHomeTypeActivity.this, AbeysekaraDetHomeActivity.class);
                startActivity(intent1);
                return true;

            case R.id.shamindaItem3:
                Intent intent2 = new Intent(AbeysekaraHomeTypeActivity.this, AbeysekaraSemiDetActivity.class);
                startActivity(intent2);
                return true;

            case R.id.shamindaItem4:
                Intent intent3 = new Intent(AbeysekaraHomeTypeActivity.this, AbeysekaraCondoActivity.class);
                startActivity(intent3);
                return true;

            case R.id.shamindaItem5:
                Intent intent4 = new Intent(AbeysekaraHomeTypeActivity.this, AbeysekaraTownActivity.class);
                startActivity(intent4);
                return true;



            default:return super.onOptionsItemSelected(item);
        }
    }
}