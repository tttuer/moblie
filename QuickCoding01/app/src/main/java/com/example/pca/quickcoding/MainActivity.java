package com.example.pca.quickcoding;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String string;
    List<Integer> list = new ArrayList<Integer>();

    public void strToInt() {
        string = string.replaceAll("\\s+","");
        String[] s = string.split(",");

        for(int i=0;i<s.length;i++){
            this.list.add(Integer.parseInt(s[i]));
        }

    }

    public void onButtonInsert(View v){
        EditText editText = (EditText) findViewById(R.id.input);

        if(editText.getText().toString().length()==0){
            Toast.makeText(getApplicationContext(),"값을 입력해 주세요",Toast.LENGTH_LONG).show();
        }
        else{
            this.string = editText.getText().toString();
        }
    }

    public void findMiniBtn(View v) {
        this.strToInt();
        MyMinimum mymini = new MyMinimum();
        int mini;

        mymini.setValues(list);

        mini = mymini.getResult();

        Toast.makeText(getApplicationContext(), "최소값은 " + mini, Toast.LENGTH_SHORT).show();
    }

    public void findAverBtn(View v) {
        this.strToInt();
        MyAverage myAver = new MyAverage();
        int aver = 0;

        myAver.setValues(list);

        aver = myAver.getResult();

        Toast.makeText(getApplicationContext(), "평균값은 " + aver, Toast.LENGTH_SHORT).show();
    }




}
