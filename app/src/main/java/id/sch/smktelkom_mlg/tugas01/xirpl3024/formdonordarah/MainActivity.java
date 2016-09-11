package id.sch.smktelkom_mlg.tugas01.xirpl3024.formdonordarah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    TextView tvhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.etnama);
        ettl = (EditText) findViewById(R.id.ettl);
        etalamat = (EditText) findViewById(R.id.etalamat);
        ettel = (EditText) findViewById(R.id.ettel);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rblaki = (RadioButton) findViewById(R.id.rblaki);
        rbpr = (RadioButton) findViewById(R.id.rbpr);
        tvhasil = (TextView) findViewById(R.id.tvhasil);
        bDaftar = (Button) findViewById(R.id.bDaftar);

        bDaftar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                String nama = etnama.getText().toString();
                int tahun = Integer.parseInt(ettl.getText().toString());
                int usia = 2016 - tahun;
                tvhasil.setText("Terima Kasih Atas Partisipasi Saudara" + "\n" +
                        nama + "(" + usia + ")" + "\n" +
                        "Anda telah berpartisipasi dalam donor darah" + "\n" +
                        " SEMOGA BERMANFAAT");
            }
        });
    }
}

