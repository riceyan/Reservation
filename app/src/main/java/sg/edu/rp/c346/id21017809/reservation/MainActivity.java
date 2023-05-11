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
    TextView tvDisplay2;

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
        tvDisplay2 = findViewById(R.id.tvDisplay2);

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
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on 0" + d + "/" + (m+1) + "/" + y);
                    }
                    else if (m < 10) {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on " + d + "/0" + (m+1) + "/" + y);
                    }
                    else if (d < 10 && m < 10) {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on 0" + d + "/0" + (m+1) + "/" + y);
                    }
                    else {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on " + d + "/" + (m+1) + "/" + y);
                    }
                }
                else {
                    tvDisplay.setText("The table reserved is at a smoking area.");
                    if (d < 10) {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on is 0" + d + "/" + (m+1) + "/" + y);
                    }
                    else if (m < 10) {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on " + d + "/0" + (m+1) + "/" + y);
                    }
                    else if (d < 10 && m < 10) {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on 0" + d + "/0" + (m+1) + "/" + y);
                    }
                    else {
                        tvDisplay2.setText("Reservation timing is " + h + ":" + min + " on " + d + "/" + (m+1) + "/" + y);
                    }
                }
                Toast.makeText(MainActivity.this,"Reservation Successful!",
                        Toast.LENGTH_LONG).show();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //put all variable names of inputs to clear when RESET is clicked
                etName.getText().clear();
                etNum.getText().clear();
                etPax.getText().clear();

                if (cbNS.isChecked()) {
                    cbNS.setChecked(false);

                }
                tvDisplay.setText("");
                tvDisplay2.setText("");
            }
        });


    }
}