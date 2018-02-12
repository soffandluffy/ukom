package com.windows10.ukom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AutoText;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;

import meridianid.farizdotid.actdaerahindonesia.adapter.SuggestionDesaAdapter;
import meridianid.farizdotid.actdaerahindonesia.adapter.SuggestionKabAdapter;
import meridianid.farizdotid.actdaerahindonesia.adapter.SuggestionKecAdapter;
import meridianid.farizdotid.actdaerahindonesia.adapter.SuggestionProvAdapter;
import meridianid.farizdotid.actdaerahindonesia.util.JsonParse;

public class WilayahActivity extends AppCompatActivity {

    //private SsonParse jsonParse;
    private AutoCompleteTextView actvProvinsi, actvKabupaten, actvKecamatan, actvDesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wilayah);

        //jsonParse = new SsonParse(this);

        actvProvinsi = (AutoCompleteTextView) findViewById(R.id.actvProvinsi);
        actvKabupaten = (AutoCompleteTextView) findViewById(R.id.actvKabupaten);
        actvKecamatan = (AutoCompleteTextView) findViewById(R.id.actvKecamatan);
        actvDesa = (AutoCompleteTextView) findViewById(R.id.actvDesa);

//        actvProvinsi.setAdapter(new SuggestionProviAdapter(WilayahActivity.this, actvProvinsi.getText().toString()));
//        actvProvinsi.setThreshold(1);
//        actvProvinsi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String namaProv = adapterView.getItemAtPosition(position).toString();
//                jsonParse.searchIdProv(namaProv);
//            }
//        });
//        actvKabupaten.setAdapter(new SuggestionKabAdapter(this, actvProvinsi.getText().toString(), actvKabupaten.getText().toString()));
//        actvKabupaten.setThreshold(1);
//        actvKabupaten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String namaKab = adapterView.getItemAtPosition(position).toString();
//                jsonParse.searchIdKab(namaKab);
//            }
//        });
//        actvKecamatan.setAdapter(new SuggestionKecAdapter(this, actvKabupaten.getText().toString(), actvKecamatan.getText().toString()));
//        actvKabupaten.setThreshold(1);
//        actvKabupaten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String namaKec = adapterView.getItemAtPosition(position).toString();
//                jsonParse.searchIdKec(namaKec);
//            }
//        });
//        actvDesa.setAdapter(new SuggestionDesaAdapter(this, actvKecamatan.getText().toString(), actvDesa.getText().toString()));
//        actvKabupaten.setThreshold(1);
//        actvKabupaten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//            }
//        });

    }
}
