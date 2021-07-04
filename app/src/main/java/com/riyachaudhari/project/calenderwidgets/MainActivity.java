package com.riyachaudhari.project.calenderwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datepicker;
    TimePicker timepicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datepicker=findViewById(R.id.datepicker);
        timepicker=findViewById(R.id.timepicker);
        timepicker.setIs24HourView(true);
    }

    public void Submit(View view) {

          StringBuilder builder = new StringBuilder();
          builder.append("Date: "+ datepicker.getDayOfMonth());
          builder.append("\nMonth: "+ (datepicker.getMonth()+1));
          builder.append("\nYear: "+ datepicker.getYear());
          builder.append("\nCurrentTime: "+ timepicker.getCurrentHour());
          builder.append("\nCurrentTime: "+ timepicker.getCurrentMinute());

        Toast.makeText(this, builder.toString(), Toast.LENGTH_SHORT).show();
    }

}