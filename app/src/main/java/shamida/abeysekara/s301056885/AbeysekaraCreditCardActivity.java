package shamida.abeysekara.s301056885;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AbeysekaraCreditCardActivity extends AppCompatActivity {

    EditText nameEditText, cardNumber, cvcNumber,  favoriteCountry  ;

    Button RegistrationButton;

    Button btnFinalPayment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeysekara_credit_card);
        RegistrationButton =(Button)findViewById(R.id.shamindaCreditCardPayment);

        nameEditText = (EditText)findViewById(R.id.shamindaCardHolderName);
        cardNumber = (EditText)findViewById(R.id.shamindaCardHolderNumber);
        cvcNumber = (EditText)findViewById(R.id.shamindaCardHolderCvc);
        favoriteCountry = (EditText)findViewById(R.id.shamindaFavoriteCountry);

        RegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String Name = nameEditText.getText().toString();
                final String CardNumber = cardNumber.getText().toString();
                final String CvcNumber = cvcNumber.getText().toString();
                final String FavoriteCountry = favoriteCountry.getText().toString();

                if (Name.length() == 0) {
                    nameEditText.requestFocus();
                    nameEditText.setError("Enter Card Holder's Name");
                } else if (!Name.matches("[a-zA-Z]+")) {
                    nameEditText.requestFocus();
                    nameEditText.setError("Enter Only Alphabetical Charactor");
                } else if (CardNumber.length() == 12) {
                    cardNumber.requestFocus();
                    cardNumber.setError("Enter Card Number");
                } else if (!CardNumber.matches("[0-9]+")) {
                    cardNumber.requestFocus();
                    cardNumber.setError("Enter Only Numbers");
                }else if (CvcNumber.length() == 3) {
                    cvcNumber.requestFocus();
                    cvcNumber.setError("Enter Card Number");
                }else if (!CvcNumber.matches("[0-9]+")) {
                    cvcNumber.requestFocus();
                    cvcNumber.setError("Enter Only Numbers");
                }if (FavoriteCountry.length() == 0) {
                    favoriteCountry.requestFocus();
                    favoriteCountry.setError("Enter Name of Your Favorite Country");
                } else if (!FavoriteCountry.matches("[a-zA-Z]+")) {
                    favoriteCountry.requestFocus();
                    favoriteCountry.setError("Enter Only Alphabetical Charactor");
                }
            }
        });
    }
}