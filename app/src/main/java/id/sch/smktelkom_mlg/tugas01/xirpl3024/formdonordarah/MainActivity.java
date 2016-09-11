package id.sch.smktelkom_mlg.tugas01.xirpl3024.formdonordarah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText ettl;
    EditText etalamat;
    EditText ettel;
    RadioGroup rg1;
    RadioButton rblaki;
    RadioButton rbpr;
    Spinner spinnergoldar;
    CheckBox cbpel;
    CheckBox cbmaha;
    CheckBox cbpeg;
    Button bDaftar;
    TextView textViewhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
