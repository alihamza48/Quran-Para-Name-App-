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
            "Alif Lam Meem",
            "Sayaqool ",
            "Tilkal Rusull",
            "Lan Tana Loo",
            "Wal Mohsanat",
            "La Yuhibbullah",
            "Wa Iza Samiu",
            "Wa Lau Annana",
            "Qalal Malao",
            "Wa A'lamu",
            "Yatazeroon ",
            "Wa Mamin Da'abat",
            "Wa Ma Ubrioo",
            "Rubama",
            "Subhanallazi",
            "Qal Alam",
            "Aqtarabo",
            "Qadd Aflaha",
            "Wa Qalallazina",
            "A'man Khalaq",
            "Utlu Ma Oohi",
            "Wa Manyaqnut",
            "Wa Mali",
            "Faman Azlam",
            "Elahe Yuruddo",
            "Ha'a Meem",
            "Qala Fama Khatbukum",
            "Qadd Sami Allah",
            "Tabarakallazi",
            "Amma Yatasa'aloon"
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
