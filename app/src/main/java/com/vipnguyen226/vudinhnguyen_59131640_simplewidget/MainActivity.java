package com.vipnguyen226.vudinhnguyen_59131640_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Thongbao;
    EditText edtTen, edtDate, edtOthers;
    RadioGroup rdg;
    CheckBox stFilm,stMusic , stCafe, stONha, stNauAn;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private  void addView(){
        edtTen = findViewById(R.id.edtTen);
        edtDate = findViewById(R.id.edtDate);
        rdg = findViewById(R.id.rdg);
        stFilm = findViewById(R.id.stFilm);
        stMusic = findViewById(R.id.stMusic);
        stCafe = findViewById(R.id.stCafe);
        stONha = findViewById(R.id.stONha);
        stNauAn = findViewById(R.id.stNauAn);
        edtOthers = findViewById(R.id.edtOthers);
        button = findViewById(R.id.button);
    }
    private void addEvent(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacnhan();
            }
        });
    }
    private void xacnhan(){
        Thongbao = edtTen.getText().toString() + "\n" +
                "Ngày sinh: " + edtDate.getText().toString() + "\n" +
                "Giới tính: ";
        if(rdg.getCheckedRadioButtonId() == R.id.rdbNam)
            Thongbao += "Nam" + "\n" + "Sở thích: ";
        else
            Thongbao += "Nữ" + "\n" + "Sở thích: ";

        if (stFilm.isChecked())
            Thongbao += "Xem phim; ";
        if (stMusic.isChecked())
            Thongbao += "Nghe nhạc; ";
        if (stCafe.isChecked())
            Thongbao += "Đi cafe với bạn; ";
        if (stONha.isChecked())
            Thongbao += "Ở nhà một mình; ";
        if (stNauAn.isChecked())
            Thongbao += "Vào bếp nấu ăn; ";

        Thongbao += edtOthers.getText().toString();
        Toast.makeText(getApplicationContext(), Thongbao, Toast.LENGTH_SHORT).show();
    }
}
