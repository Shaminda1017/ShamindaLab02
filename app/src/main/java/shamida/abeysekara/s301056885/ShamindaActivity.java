package shamida.abeysekara.s301056885;

//ShamindaAbeysekara_301056885_Sec002
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class ShamindaActivity<Intend> extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            openHomeTypeActivity();

    }
    private void openHomeTypeActivity(){
        Button button = (Button) findViewById(R.id.shamindaButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShamindaActivity.this, AbeysekaraHomeTypeActivity.class));
            }
        });
    }

}