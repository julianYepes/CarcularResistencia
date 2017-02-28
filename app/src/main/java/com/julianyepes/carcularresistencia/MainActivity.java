package com.julianyepes.carcularresistencia;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import static com.julianyepes.carcularresistencia.R.color.chocolate;
import static com.julianyepes.carcularresistencia.R.color.lightgray;
import static com.julianyepes.carcularresistencia.R.color.resis;

public class MainActivity extends AppCompatActivity {


    TextView tTole,tPpm;
    Button bBu1,bBu2,bttn;
    TextView eValor;
    String valor,mult;
    int cBan1=6,cBan2=2,cBan3=0,cBan4=3,cBan5=11,cBan6=0,color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eValor = (TextView) findViewById(R.id.eValor);
        tTole = (TextView)findViewById(R.id.tTole);
        tPpm = (TextView)findViewById(R.id.tPpm);


    }

    public void buttonOnClick(View v){

        switch ( v.getId() ) {
            case R.id.btBan1:
                bBu1 = (Button) findViewById(R.id.bBan1);
                bBu2 = (Button) findViewById(R.id.btBan1);

                cBan1++;
                if (cBan1 > 9) {
                    cBan1 = 0;
                    color = -1;
                    bBu2.setText("-");
                    bttn=(Button) findViewById(R.id.bBan5);
                    bttn.setBackgroundResource(R.color.resis);
                    bttn=(Button)findViewById(R.id.btBan5);
                    bttn.setBackgroundResource(R.color.resis);
                    bttn.setText("-");
                    cBan5=0;
                    tTole.setText("");
                    tPpm.setText("Tole +-");
                    if (cBan2==0){
                        bttn=(Button) findViewById(R.id.bBan2);
                        bttn.setBackgroundResource(R.color.brown);
                        bttn=(Button)findViewById(R.id.btBan2);
                        bttn.setBackgroundResource(R.color.brown);
                        bttn.setText("1");
                        cBan2=1;
                    }
                    if (cBan4==5)cBan4=7;
                    else if (cBan4==6)cBan4=8;

                } else {
                    if (cBan4>4 && cBan1 == 1){
                        cBan4=1;
                        bttn=(Button) findViewById(R.id.bBan4);
                        bttn.setBackgroundResource(R.color.brown);
                        bttn=(Button)findViewById(R.id.btBan4);
                        bttn.setBackgroundResource(R.color.brown);
                        bttn.setText("x1");
                    }
                    color = cBan1;
                    bBu2.setText(String.valueOf(cBan1));
                }
                break;

            case R.id.btBan2:
                bBu1 = (Button) findViewById(R.id.bBan2);
                bBu2 = (Button) findViewById(R.id.btBan2);

                cBan2++;
                if (cBan2 > 9) cBan2 = 0;
                if (cBan1 == 0 && cBan2 == 0) cBan2 = 1;
                color = cBan2;
                bBu2.setText(String.valueOf(cBan2));
                if (cBan2 == 0) bBu2.setTextColor(getResources().getColor(R.color.white));
                else bBu2.setTextColor(getResources().getColor(R.color.black));
                break;

            case R.id.btBan3:
                bBu1 = (Button) findViewById(R.id.bBan3);
                bBu2 = (Button) findViewById(R.id.btBan3);

                cBan3++;
                if (cBan3 > 9) cBan3 = 0;
                color = cBan3;
                bBu2.setText(String.valueOf(cBan3));
                if (cBan3 == 0) bBu2.setTextColor(getResources().getColor(R.color.white));
                else bBu2.setTextColor(getResources().getColor(R.color.black));
                break;

            case R.id.btBan4:
                bBu1 = (Button) findViewById(R.id.bBan4);
                bBu2 = (Button) findViewById(R.id.btBan4);

                cBan4++;
                if (cBan1 == 0 && cBan5 == 0) {
                    if (cBan4 > 9) cBan4 = 0;
                    switch (cBan4) {
                        case 7:
                            color = 10;
                            bBu2.setText("/10");
                            break;
                        case 8:
                            color = 11;
                            bBu2.setText("/100");
                            break;
                        case 9:
                            color = cBan4 = 0;
                            bBu2.setText("x10^0");
                            break;
                        default:
                            color = cBan4;
                            bBu2.setText("x10^" + String.valueOf(cBan4));
                    }

                } else {
                    if (cBan4 > 7) cBan4 = 0;
                    switch (cBan4) {
                        case 5:
                            color = 10;
                            bBu2.setText("/10");
                            break;
                        case 6:
                            color = 11;
                            bBu2.setText("/100");
                            break;
                        case 7:
                            color = cBan4 = 0;
                            bBu2.setText("x10^0");
                            break;
                        default:
                            color = cBan4;
                            bBu2.setText("x10^" + String.valueOf(cBan4));
                    }
                }

                if (cBan4 == 0) bBu2.setTextColor(getResources().getColor(R.color.white));
                else bBu2.setTextColor(getResources().getColor(R.color.black));

                break;
            case R.id.btBan5:
                bBu1 = (Button) findViewById(R.id.bBan5);
                bBu2 = (Button) findViewById(R.id.btBan5);

                if (cBan1 == 0){
                    color = -1;
                    bBu2.setText("-");
                    tTole.setText("");
                    tPpm.setText("Tole +-");
                }else{
                    tTole.setText("Tole +-");
                    tPpm.setText("Ppm");
                    cBan5++;
                    switch (cBan5){
                        case 1: color=cBan5;
                            bBu2.setText(String.valueOf(cBan5)+"%");
                            break;
                        case 2: color=cBan5;
                            bBu2.setText(String.valueOf(cBan5)+"%");
                            break;
                        case 3: color=5;
                            bBu2.setText("0.5%");
                            break;
                        case 4: color=6;
                            bBu2.setText("0.25%");
                            break;
                        case 5:color=7;
                            bBu2.setText("0.1%");
                            break;
                        case 6:color=10;
                            bBu2.setText("5%");
                            break;
                        case 7:color=11;
                            bBu2.setText("10%");
                            break;
                        default:
                            color=-1;
                            cBan5=0;
                            bBu2.setText("-");
                            tTole.setText("");
                            tPpm.setText("Tole +-");
                    }
                }

                break;
            case R.id.btBan6:
                bBu1 = (Button) findViewById(R.id.bBan6);
                bBu2 = (Button) findViewById(R.id.btBan6);

                cBan6++;
                if (cBan5 == 0){
                    switch (cBan6){
                        case 1:color=2;
                            bBu2.setText("2%");
                            break;
                        case 2:color=10;
                            bBu2.setText("5%");
                            break;
                        case 3:color=11;
                            bBu2.setText("10%");
                            break;
                        default:
                            cBan6=0;
                            color=1;
                            bBu2.setText("1%");
                            break;
                    }
                }else {
                    switch (cBan6){
                        case 1:color=2;
                            bBu2.setText("50");
                            break;
                        case 2:color=3;
                            bBu2.setText("15");
                            break;
                        case 3:color=4;
                            bBu2.setText("25");
                            break;
                        case 4:color=6;
                            bBu2.setText("10");
                            break;
                        case 5:color=7;
                            bBu2.setText("5");
                            break;
                        default:
                            cBan6=0;
                            color=1;
                            bBu2.setText("100");
                    }
                }

                break;
        }

        switch (color){
            case -1:
                bBu1.setBackgroundResource(R.color.resis);
                bBu2.setBackgroundResource(R.color.resis);
                break;
            case 0:
                bBu1.setBackgroundResource(R.color.black);
                bBu2.setBackgroundResource(R.color.black);
                break;
            case 1:
                bBu1.setBackgroundResource(R.color.brown);
                bBu2.setBackgroundResource(R.color.brown);
                break;
            case 2:
                bBu1.setBackgroundResource(R.color.red);
                bBu2.setBackgroundResource(R.color.red);
                break;
            case 3:
                bBu1.setBackgroundResource(R.color.orange);
                bBu2.setBackgroundResource(R.color.orange);
                break;
            case 4:
                bBu1.setBackgroundResource(R.color.yellow);
                bBu2.setBackgroundResource(R.color.yellow);
                break;
            case 5:
                bBu1.setBackgroundResource(R.color.green);
                bBu2.setBackgroundResource(R.color.green);
                break;
            case 6:
                bBu1.setBackgroundResource(R.color.blue);
                bBu2.setBackgroundResource(R.color.blue);
                break;
            case 7:
                bBu1.setBackgroundResource(R.color.purple);
                bBu2.setBackgroundResource(R.color.purple);
                break;
            case 8:
                bBu1.setBackgroundResource(R.color.gray);
                bBu2.setBackgroundResource(R.color.gray);
                break;
            case 9:
                bBu1.setBackgroundResource(R.color.white);
                bBu2.setBackgroundResource(R.color.white);
                break;
            case 10:
                bBu1.setBackgroundResource(R.color.gold);
                bBu2.setBackgroundResource(R.color.gold);
                break;
            case 11:
                bBu1.setBackgroundResource(R.color.silver);
                bBu2.setBackgroundResource(R.color.silver);
                break;
        }

        if (cBan1==0){
            switch (cBan4){
                case 0:
                    valor=String.valueOf(cBan2)+String.valueOf(cBan3);
                    break;
                case 1:
                    valor=String.valueOf(cBan2)+String.valueOf(cBan3)+"0";
                    break;
                case 2:
                    valor=String.valueOf(cBan2)+"."+String.valueOf(cBan3)+"K";
                    break;
                case 3:
                    valor=String.valueOf(cBan2)+String.valueOf(cBan3)+"K";
                    break;
                case 4:
                    valor=String.valueOf(cBan2)+String.valueOf(cBan3)+"0K";
                    break;
                case 5:
                    valor=String.valueOf(cBan2)+"."+String.valueOf(cBan3)+"M";
                    break;
                case 6:
                    valor=String.valueOf(cBan2)+String.valueOf(cBan3)+"M";
                    break;
                case 7:
                    valor=String.valueOf(cBan2)+"."+String.valueOf(cBan3);
                    break;
                case 8:
                    valor="0."+String.valueOf(cBan2)+String.valueOf(cBan3);
                    break;
            }
        }else {
            switch (cBan4) {
                case 0:
                    valor = String.valueOf(cBan1) + String.valueOf(cBan2) +
                            String.valueOf(cBan3);
                    break;
                case 1:
                    valor = String.valueOf(cBan1) + "." + String.valueOf(cBan2) +
                            String.valueOf(cBan3) + "K";
                    break;
                case 2:
                    valor = String.valueOf(cBan1) + String.valueOf(cBan2) + "." +
                            String.valueOf(cBan3) + "K";
                    break;
                case 3:
                    valor = String.valueOf(cBan1) + String.valueOf(cBan2) +
                            String.valueOf(cBan3) + "K";
                    break;
                case 4:
                    valor = String.valueOf(cBan1) + "." + String.valueOf(cBan2) +
                            String.valueOf(cBan3) + "M";
                    break;
                case 5:
                    valor = String.valueOf(cBan1) + String.valueOf(cBan2) + "." +
                            String.valueOf(cBan3);
                    break;
                case 6:
                    valor = String.valueOf(cBan1) + "." + String.valueOf(cBan2) +
                            String.valueOf(cBan3);
                    break;
            }
        }

        eValor.setText(valor+" Ohms");
    }
}
