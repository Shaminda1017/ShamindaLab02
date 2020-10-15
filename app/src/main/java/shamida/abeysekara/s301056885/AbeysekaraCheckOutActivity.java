package shamida.abeysekara.s301056885;
//ShamindaAbeysekara_301056885_Sec002
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbeysekaraCheckOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_check_out);

        openCreditCardPaymenttActivity();
    }

    private void openCreditCardPaymenttActivity(){
        Button button2 = (Button) findViewById(R.id.shamindaPaymentBtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbeysekaraCheckOutActivity.this, AbeysekaraCreditCardActivity.class));
            }
        });
    }
}