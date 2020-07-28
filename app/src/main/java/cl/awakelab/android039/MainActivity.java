package cl.awakelab.android039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MainActivityCircle.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);
    }

    public void btnOperacion(View view) {

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
            valueResult.setText(result.toString());
        } else if (rbOperation.getCheckedRadioButtonId() == R.id.rbAdd) {

            Log.d(TAG, "Suma");

            message = "Suma : ";
            result = Integer.parseInt(valueA.getText().toString()) + Integer.parseInt(valueB.getText().toString());
            valueResult.setText(result.toString());
        }

        message += result;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
