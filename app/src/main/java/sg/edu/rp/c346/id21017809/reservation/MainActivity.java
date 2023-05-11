package sg.edu.rp.c346.id21017809.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

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
    TextView tvDisplay;

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
        tvDisplay = findViewById(R.id.tvDisplay);

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setIs24HourView(true);
                int h = tp.getHour();
                int min = tp.getMinute();
                int d = dp.getDayOfMonth();
                int m = dp.getMonth();
                int y = dp.getYear();
                if (cbNS.isChecked()) {
                    tvDisplay.setText("The table reserved is at a non-smoking area.");
                    if (d < 10) {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is 0" + d + "/" + (m+1) + "/" + y);
                    }
                    else if (m < 10) {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is " + d + "/0" + (m+1) + "/" + y);
                    }
                    else if (d < 10 && m < 10) {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is 0" + d + "/0" + (m+1) + "/" + y);
                    }
                    else {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is " + d + "/" + (m+1) + "/" + y);
                    }
                }
                else {
                    tvDisplay.setText("The table reserved is at a smoking area.");
                    if (d < 10) {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is 0" + d + "/" + (m+1) + "/" + y);
                    }
                    else if (m < 10) {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is " + d + "/0" + (m+1) + "/" + y);
                    }
                    else if (d < 10 && m < 10) {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is 0" + d + "/0" + (m+1) + "/" + y);
                    }
                    else {
                        tvDisplay.setText("Reservation timing is" + h + ":" + min + "Date is " + d + "/" + (m+1) + "/" + y);
                    }
                }
                Toast.makeText(MainActivity.this,"Reservation Successful!",
                        Toast.LENGTH_LONG).show();

//have yet to do default date & time
//have yet to do clear inputs
            }
        });

    }
}