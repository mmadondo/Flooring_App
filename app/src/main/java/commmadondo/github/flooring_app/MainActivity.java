package commmadondo.github.flooring_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etLength, etWidth;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLength = (EditText) findViewById(R.id.editTextLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
        btnCalculate = (Button) findViewById(R.id.btnResults);
    }

    public void onClickResult(View view){
        Intent calcIntent = new Intent(MainActivity.this, SecondActivity.class);
        calcIntent.putExtra("rmLength", Double.parseDouble(etLength.getText().toString()));
        calcIntent.putExtra("rmWidth", Double.parseDouble(etWidth.getText().toString()));
        startActivity(calcIntent);
    }

}
