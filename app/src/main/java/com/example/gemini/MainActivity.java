package com.example.gemini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button actionButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        userInput = findViewById(R.id.user_input);
        actionButton = findViewById(R.id.action_button);
        resultText = findViewById(R.id.result_text);

        // Set click listener for the button
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText
                String text = userInput.getText().toString().trim();

                // Count the words
                int wordCount = countWords(text);

                // Display the result
                resultText.setText("Word Count: " + wordCount);
            }
        });
    }

    // Method to count words in a string
    private int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+"); // Split by one or more whitespace characters
        return words.length;
    }
}