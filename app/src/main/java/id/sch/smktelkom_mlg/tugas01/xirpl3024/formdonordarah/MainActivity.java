package id.sch.smktelkom_mlg.tugas01.xirpl3024.formdonordarah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText etTL;
    EditText etAlamat;
    EditText etNo;
    Button buttonDaftar;
    TextView textViewhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
