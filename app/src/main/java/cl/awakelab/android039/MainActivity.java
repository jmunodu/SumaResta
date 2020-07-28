package cl.awakelab.android039;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate [START]");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate [END]");
    }

    public void btnOperacion(View view) {

        Log.d(TAG, "btnOperacion eventClick [START]");

        Button btnOperation = findViewById(R.id.buttonOperation);
        TextView valueA = findViewById(R.id.txtNumberA);
        TextView valueB = findViewById(R.id.txtNumberB);
        TextView valueResult = findViewById(R.id.txtResult);

        RadioGroup rbOperation = findViewById(R.id.radioGroup);

        String message = "";
        Integer result = 0;

        if (rbOperation.getCheckedRadioButtonId() == R.id.rbSubtract) {

            Log.d(TAG, "Resta");

            message = "Resta : ";
            result = Integer.parseInt(valueA.getText().toString()) - Integer.parseInt(valueB.getText().toString());

        } else if (rbOperation.getCheckedRadioButtonId() == R.id.rbAdd) {

            Log.d(TAG, "Suma");

            message = "Suma : ";
            result = Integer.parseInt(valueA.getText().toString()) + Integer.parseInt(valueB.getText().toString());

        }

        valueResult.setText(result.toString());
        message += result;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.d(TAG, "btnOperacion eventClick [END]");
    }
}
