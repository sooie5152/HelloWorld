package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        // Create listener for click event
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("You have clicked the button");
            }
        };

        // Assign click listener to our button
        button.setOnClickListener(ocl);
    }
}
