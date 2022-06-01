package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        editText=findViewById(R.id.editTextTextMultiLine);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String feedbackText;
                feedbackText =editText.getText().toString();

                String sub="News App Feedback";
                String to_email="biswaranjanbeheraqazplm@gcekbpatna.ac.in";
                String[] resipients=to_email.split(",");

                Intent emailIntent = new Intent(Intent.ACTION_SEND);


                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plane");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, resipients);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                emailIntent.putExtra(Intent.EXTRA_TEXT, feedbackText);
                startActivity(Intent.createChooser(emailIntent, "Send Email"));

                Toast.makeText(getApplicationContext(),"Thanks for your Feedback",Toast.LENGTH_SHORT).show();
            }
        });

    }
}