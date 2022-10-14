package com.example.uts_papbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class InputData extends AppCompatActivity {

    TextView tvTanggal;
    int usia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        tvTanggal = findViewById(R.id.tv_tanggal);

        Spinner spinner = findViewById(R.id.sp_kat);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.kategori, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapter.getItem(i).equals("Pilih Kategori")){

                }
                else if (adapter.getItem(i).equals("Sport")){

                    Intent intent = new Intent(InputData.this, SportActivity.class);
                    intent.putExtra(SportActivity.EXTRA_USIA, usia);
//                    Toast toast = Toast.makeText(getApplicationContext(), "DEBUG1: " +Integer.toString(usia), Toast.LENGTH_SHORT);
//                    toast.show();
                    InputData.this.startActivity(intent);
                }
                else if (adapter.getItem(i).equals("Technology")){
                    Intent intent = new Intent(InputData.this, TechnologyActivity.class);
                    intent.putExtra(TechnologyActivity.EXTRA_USIA, usia);
                    InputData.this.startActivity(intent);
//                    Toast toast = Toast.makeText(getApplicationContext(), "DEBUG1: " +Integer.toString(usia), Toast.LENGTH_SHORT);
//                    toast.show();
                }
                else if (adapter.getItem(i).equals("Politics")){
                    Intent intent = new Intent(InputData.this, PoliticsActivity.class);
                    intent.putExtra(PoliticsActivity.EXTRA_USIA, usia);
                    InputData.this.startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        tvTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });
    }

    public void showDatePicker() {
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(),"date-picker");
    }

    public void processDatePickerResult(int day, int month, int year) {
        String day_string = Integer.toString(day);
        String month_string = Integer.toString(month+1);
        String year_string = Integer.toString(year);

        String dateMessage = day_string + "-" + month_string + "-" + year_string;
        tvTanggal.setText(dateMessage);

        Calendar now=  Calendar.getInstance();

        int years = now.get(Calendar.YEAR) - year;
        int months = now.get(Calendar.MONTH) - month;
        int days = now.get(Calendar.DAY_OF_MONTH) - day;

        if (days < 0){
            months --;
            days +=now.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        if (months < 0){
            years --;
            months +=12;
        }
        usia = years;

//        String umur = years+" tahun "+months+ " bulan "+days+" hari";
//
//            Toast toast = Toast.makeText(getApplicationContext(), umur, Toast.LENGTH_SHORT);
//        toast.show();

    }


}
