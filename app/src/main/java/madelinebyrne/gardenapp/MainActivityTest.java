package madelinebyrne.gardenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);
    }

    public void inputEnter(View view)
    {
        EditText editTextInput = (EditText) findViewById(R.id.editText);
        String test = editTextInput.getText().toString();
        Log.d("test input = ", test);
    }
}
