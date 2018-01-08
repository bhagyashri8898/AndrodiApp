package com.example.inter_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);


        Intent intent =getIntent();

        Bundle bundle=intent.getExtras();

        if(bundle !=null)
        {
            ((TextView)findViewById(R.id.txtcmp)).setText(bundle.getString("Yonm"));

        }
         Intent intent= getIntent();
         Bundle bundle1= intent.getExtras();

         if (bundle !=null)
             builder.append(bundle.getString("yoNm"));



    }
    public void onMain(View view){

        Intent intent=new intent();
        Bundle bundle=new bundle();
        bundle.putString("opNm", builder.toString());
        dt.putExtras(bundle);
        setResult(RESULT_OK , dt);
        finish();



    }
}

