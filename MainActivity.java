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
            "Alif Lam Meem-الم",
            "Sayaqool-سیقول ",
            "Tilkal Rusull-تلک الرسل",
            "Lan Tana Loo-لن تنالوالبر",
            "Wal Mohsanat-والمحصنت",
            "La Yuhibbullah-لایحب اللہ",
            "Wa Iza Samiu-واذاسمعوا",
            "Wa Lau Annana-ولواننا",
            "Qalal Malao-قال الملاء",
            "Wa A'lamu-واعلموا",
            "Yatazeroon-یعتذرون ",
            "Wa Mamin Da'abat-ومامن دآبۃ",
            "Wa Ma Ubrioo-وماابرئ",
            "Rubama-ربما",
            "Subhanallazi-سبحن الذی",
            "Qal Alam-قال الم",
            "Aqtarabo-اقترب للناس",
            "Qadd Aflaha-قد افلح",
            "Wa Qalallazina-وقال الذین",
            "A'man Khalaq-امن خلق",
            "Utlu Ma Oohi-اتل مااوحی",
            "Wa Manyaqnut-ومن یقنت",
            "Wa Mali-ومالی",
            "Faman Azlam-فمن اظلم",
            "Elahe Yuruddo-الیہ یرد",
            "Ha'a Meem-حم",
            "Qala Fama Khatbukum-قال فماخطبکم",
            "Qadd Sami Allah-قدسمع اللہ",
            "Tabarakallazi-تبارک الذی",
            "Amma Yatasa'aloon-عم یتسآءلون"
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
