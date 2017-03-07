package commmadondo.github.flooring_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mmadondo on 3/3/2017.
 */

public class SecondActivity extends AppCompatActivity {
 //declare variables
    TextView tvResult;
    Double Length, Width, Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tvResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        Length = extras.getDouble("rmLength"); //set the length to user input value
        Width = extras.getDouble("rmWidth");   //set the width to user input value

        Area = Length*Width; //calculate flooring area

        //display final result
        tvResult.setText("Flooring Area:\nWidth is " + Width + " and Length is " + Length + " and flooring needed is " + Area + " square units.");
    }

    }

