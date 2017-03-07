package commmadondo.github.flooring_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mmadondo on 3/3/2017.
 */

public class SecondActivity extends AppCompatActivity {

    static TextView tvResult;
    Double Length, Width, Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tvResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        Length = extras.getDouble("rmLength");
        Width = extras.getDouble("rmWidth");

        Area = Length*Width;
        tvResult.setText("Width is " + Width + " and Length is " + Length + " and flooring needed is " + Area);
    }

    }

