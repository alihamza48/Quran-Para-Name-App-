package com.example.quranparahnames;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText indexEditText;
    private Button showButton;

    private String[] dataArray = {
            "Data 1", "Data 2", "Data 3", "Data 4", "Data 5",
            "Data 6", "Data 7", "Data 8", "Data 9", "Data 10",
            "Data 11", "Data 12", "Data 13", "Data 14", "Data 15",
            "Data 16", "Data 17", "Data 18", "Data 19", "Data 20",
            "Data 21", "Data 22", "Data 23", "Data 24", "Data 25",
            "Data 26", "Data 27", "Data 28", "Data 29", "Data 30"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        indexEditText = findViewById(R.id.indexEditText);
        showButton = findViewById(R.id.showButton);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String indexString = indexEditText.getText().toString();
                if (!indexString.isEmpty()) {
                    int index = Integer.parseInt(indexString);
                    if (index >= 1 && index <= dataArray.length) {
                        String data = dataArray[index - 1];
                        resultTextView.setText(data);
                    } else {
                        resultTextView.setText("Invalid index!");
                    }
                }
            }
        });
    }
}
