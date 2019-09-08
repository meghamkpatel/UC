package com.example.uc;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int posf = 0;
    public int post = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.small, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.large, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        Spinner toSpinner = (Spinner) findViewById(R.id.spinner_to);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter2);
        Button buttonConvert = (Button)findViewById(R.id.button_convert);


        fromSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(
                    AdapterView<?> parent, View view, int position, long id) {
                    posf = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        toSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(
                    AdapterView<?> parent, View view, int position, long id) {
                    post = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }
    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        final TextView textView=(TextView)findViewById(R.id.textView1);

        fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        toSpinner = (Spinner) findViewById(R.id.spinner_to);


        // Get the string from the Spinners and number from the EditText
        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();

        // Convert the strings to something in our Unit enu,
        Converter.Unit fromUnit = Converter.Unit.fromString(fromString);
        Converter.Unit toUnit = Converter.Unit.fromString(toString);

        // Create a converter object and convert!
        Converter converter = new Converter(fromUnit, toUnit);
        double result = converter.convert();
        textView.setText(String.valueOf(result));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
