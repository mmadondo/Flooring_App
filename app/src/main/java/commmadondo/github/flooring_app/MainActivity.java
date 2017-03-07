package commmadondo.github.flooring_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declare variables
    private EditText etLength, etWidth;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize widgets
        etLength = (EditText) findViewById(R.id.editTextLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
        btnCalculate = (Button) findViewById(R.id.btnResults);
    }

    public void onClickResult(View view){
        Intent calcIntent = new Intent(MainActivity.this, SecondActivity.class);    //Call the second activity
        calcIntent.putExtra("rmLength", Double.parseDouble(etLength.getText().toString())); //get room length as string and convert it to double before sending it to second activity
        calcIntent.putExtra("rmWidth", Double.parseDouble(etWidth.getText().toString())); //get room width as string and convert it to double before sending it to second activity
        startActivity(calcIntent); //initiate second activity
    }

}
