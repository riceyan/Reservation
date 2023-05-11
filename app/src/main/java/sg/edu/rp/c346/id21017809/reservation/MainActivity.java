package sg.edu.rp.c346.id21017809.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    TextView tvName;
    EditText etName;
    TextView tvNum;
    EditText etNum;
    TextView tvPax;
    EditText etPax;
    CheckBox cbNS;
    TextView tvDate;
    TextView tvTime;
    Button btnReserve;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        etName = findViewById(R.id.etName);
        tvNum = findViewById(R.id.tvNum);
        etNum = findViewById(R.id.etNum);
        tvPax = findViewById(R.id.tvPax);
        etPax = findViewById(R.id.etPax);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        cbNS = findViewById(R.id.cbNS);
        tvDate = findViewById(R.id.tvDate);
        tvTime = findViewById(R.id.tvTime);
        btnReserve = findViewById(R.id.btnReserve);
        btnReset = findViewById(R.id.btnReset);


    }
}