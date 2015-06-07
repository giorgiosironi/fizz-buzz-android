package com.onebip.fizzbuzz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

// TODO: rename to NumberInputActivity
public class Examples extends Activity {

    public static final String EXTRA_MESSAGE = "com.onebip.fizzbuzz.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples);
    }

    public void calculateFizzBuzz(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText number = (EditText) findViewById(R.id.number);
        String message = number.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
