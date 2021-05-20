package gujarprawjal12gmail.com.example.simplebmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private TextView Result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
       Result = (TextView) findViewById(R.id.result);

    }

    public void CalculateBMI( View view){
        String heightstr = height.getText().toString();
        String weightstr = weight.getText().toString();


        if(heightstr !=null && !"".equals(heightstr) &&
                weightstr !=null && !"".equals(weightstr));


        float heightValue = Float.parseFloat(heightstr)/100;
        float weightValue = Float.parseFloat(weightstr);

        float bmi = weightValue / heightValue*heightValue;


        displayBMI(bmi);

    }



    private void displayBMI(float bmi) {

        String bmilable = "";

        if (Float.compare(bmi, 15f) <= 0) {
            bmilable = getString(R.string.very_Severly_underweigh);
        } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0) {
            bmilable = getString(R.string.severly_underweight);
        } else if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0) {
            bmilable = getString(R.string.underweight);
        } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0) {
            bmilable = getString(R.string.normal);
        } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0) {
            bmilable = getString(R.string.overweight);
        } else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0) {
            bmilable = getString(R.string.obese_class_I);
        } else if (Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0) {
            bmilable = getString(R.string.obese_class_II);
        } else {
            bmilable = getString(R.string.obese_class_III);
        }

        bmilable = bmi + "\n\n" + bmilable;

        Result.setText(bmilable);


    }
}


