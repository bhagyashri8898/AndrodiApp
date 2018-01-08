package com.example.inter_activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoSports (View view){

        MainActivity main=this;
        Context con=main;

        Class <SportsActivity> cls=SportsActivity.class;

        Intent intent=new Intent(
                con,
                cls;

        );

        protected void onActivityResult(int rrequestcode,super on)

        EditText edNm= findViewById(R.id.edtnm);
        Bundle bundle=new Bundle();
        bundle.putString("Yonm",edNm.getText().toString());
        intent.putExtras(bundle);

        startActivity(intent);

    }
}
