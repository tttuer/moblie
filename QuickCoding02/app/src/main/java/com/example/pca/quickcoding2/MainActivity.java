package com.example.pca.quickcoding2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRand = new Random();
    }

    TextView mTextResult;

    Random mRand;

    int RandNum;
    int max=100;
    int min=0;
    int currentNum = max;
    int count=0;
    int key;

    public void onButton1Clicked(View v){
        this.RandNum = getRandom(100,0);
    }

    public int getRandom(int max,int offset){
        int nResult = mRand.nextInt(max)+offset;

        return nResult;
    }

    public void onButtonBigger(View v){
        this.min=currentNum;
        this.currentNum = (currentNum+max)/2;
        TextView text = (TextView) findViewById(R.id.currentResult);
        text.setText("Your Number is "+currentNum);
        count++;
    }

    public void onButtonSmaller(View v){
        TextView text = (TextView) findViewById(R.id.currentResult);

        if(count==0) {
            this.currentNum = (currentNum + min) / 2;
            text.setText("Your Number is " + currentNum);
            count++;
        }
        else{
            this.max=currentNum;
            this.currentNum = (currentNum + min) / 2;
            text.setText("Your Number is " + currentNum);
            count++;
        }

    }

    public void insertBtnClicked(View v){
        EditText et = (EditText) findViewById(R.id.insertNum);

        this.key=Integer.parseInt(et.getText().toString());
    }

    public void bingoBtn(View v){
        Toast.makeText(getApplicationContext(),count+"번 만에 맞췄습니다.",Toast.LENGTH_SHORT).show();
    }


}
