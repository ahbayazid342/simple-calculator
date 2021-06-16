package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnSub, btnMul, btnDiv, btnClear, btnEqual, btnDot;
    private TextView sin, cos, tan, log, squre, fact;
    private ImageView backSpace;
    private TextView edInput, edResult;
    private boolean ADD, SUB, MUL, DIV, SIN, COS, TAN, LOG, SQURE, FACT;
    private double res1, res2, a;
    private int factNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findButton();

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnPlus.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        backSpace.setOnClickListener(this);

        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        log.setOnClickListener(this);
        squre.setOnClickListener(this);
        fact.setOnClickListener(this);

    }

    private void findButton() {
        btn0 = (TextView) findViewById(R.id.tvZero);
        btn1 = (TextView) findViewById(R.id.tvOne);
        btn2 = (TextView) findViewById(R.id.tvTwo);
        btn3 = (TextView) findViewById(R.id.tvThree);
        btn4 = (TextView) findViewById(R.id.tvFour);
        btn5 = (TextView) findViewById(R.id.tvFive);
        btn6 = (TextView) findViewById(R.id.tvSix);
        btn7 = (TextView) findViewById(R.id.tvSeven);
        btn8 = (TextView) findViewById(R.id.tvEight);
        btn9 = (TextView) findViewById(R.id.tvNine);

        btnPlus = (TextView) findViewById(R.id.tvPlus);
        btnSub = (TextView) findViewById(R.id.tvMinus);
        btnMul = (TextView) findViewById(R.id.tvMulti);
        btnDiv = (TextView) findViewById(R.id.tvDiv);

        btnClear = (TextView) findViewById(R.id.tvClear);
        btnEqual = (TextView) findViewById(R.id.tvEqual);
        btnDot = (TextView) findViewById(R.id.tvDot);
        backSpace = (ImageView) findViewById(R.id.tvBack);

        sin = (TextView) findViewById(R.id.tvSin);
        cos = (TextView) findViewById(R.id.tvCos);
        tan = (TextView) findViewById(R.id.tvTan);
        log = (TextView) findViewById(R.id.tvLog);
        squre = (TextView) findViewById(R.id.tvSqrt);
        fact = (TextView) findViewById(R.id.tvFact);

        edInput = (TextView) findViewById(R.id.tvInput);
        edResult = (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.tvZero){
            edResult.setText(edResult.getText() + "0");
        }if (v.getId() == R.id.tvOne){
            edResult.setText(edResult.getText() + "1");
        }if (v.getId() == R.id.tvTwo){
            edResult.setText(edResult.getText() + "2");
        }if (v.getId() == R.id.tvThree){
            edResult.setText(edResult.getText() + "3");
        }if (v.getId() == R.id.tvFour){
            edResult.setText(edResult.getText() + "4");
        }if (v.getId() == R.id.tvFive){
            edResult.setText(edResult.getText() + "5");
        }if (v.getId() == R.id.tvSix){
            edResult.setText(edResult.getText() + "6");
        }if (v.getId() == R.id.tvSeven){
            edResult.setText(edResult.getText() + "7");
        }if (v.getId() == R.id.tvEight){
            edResult.setText(edResult.getText() + "8");
        }if (v.getId() == R.id.tvNine){
            edResult.setText(edResult.getText() + "9");
        }if (v.getId() == R.id.tvDot){
            edResult.setText(edResult.getText() + ".");
        } if (v.getId() == R.id.tvPlus){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText(edResult.getText() + " + ");
            edResult.setText(null);
            ADD = true;
        }if (v.getId() == R.id.tvMinus){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText(edResult.getText() + " - ");
            edResult.setText(null);
            SUB = true;
        }if (v.getId() == R.id.tvMulti){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText(edResult.getText() + " * ");
            edResult.setText(null);
            MUL = true;
        }if (v.getId() == R.id.tvDiv){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText(edResult.getText() + " / ");
            edResult.setText(null);
            DIV = true;
        }if (v.getId() == R.id.tvSin){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText("sin("+edResult.getText()+")");
            edResult.setText(null);
            SIN = true;
            Operation(res1);
        }if (v.getId() == R.id.tvCos){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText("cos("+edResult.getText()+")");
            edResult.setText(null);
            COS = true;
            Operation(res1);
        }if (v.getId() == R.id.tvLog){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText("log (" + res1 + ")");
            edResult.setText(null);
            LOG = true;
            Operation(res1);
        }if (v.getId() == R.id.tvSqrt){
            res1 = Double.parseDouble(edResult.getText().toString());
            edInput.setText("sqrt(" + res1 + ")");
            edResult.setText(null);
            SQURE = true;
            Operation(res1);
        }if (v.getId() == R.id.tvFact){
            res1 = Integer.parseInt(edResult.getText().toString());
            edInput.setText(res1 + "!");
            edResult.setText(null);
            FACT = true;
            Operation(res1);
        }

        if (v.getId() == R.id.tvEqual){
            if (edInput.getText()==""){
                Toast.makeText(MainActivity.this, "Press Number For Action", Toast.LENGTH_SHORT).show();
            }else{
                res2 = Double.parseDouble(edResult.getText().toString());
                edInput.setText(edInput.getText() +" "+ edResult.getText() + " = ");
                if (ADD){
                    edResult.setText( (res1 + res2) + "");
                    ADD = false;
                }if (SUB){
                    edResult.setText( (res1 - res2) + "");
                    SUB = false;
                }if (MUL){
                    edResult.setText( (res1 * res2) + "");
                    MUL = false;
                }if (DIV){
                    edResult.setText( (res1 / res2) + "");
                    DIV = false;
                }
            }
        }if (v.getId() == R.id.tvClear){
            clear();
        }if (v.getId() == R.id.tvBack){
            String val = edResult.getText().toString();
            val = val.substring(0, val.length()-1);
            edResult.setText(val);
        }

    }

    private void Operation(double res1) {
        if (SIN){
            double b = Math.toRadians(res1);
            a = Math.sin(b);
            edResult.setText(Double.toString(a));
            a=0;
            SIN=false;
        } else if (COS){
            double b = Math.toRadians(res1);
            a = Math.cos(b);
            edResult.setText(Double.toString(a));
            a=0;
            COS=false;
        } else if (TAN){
            double b = Math.toRadians(res1);
            a = Math.tan(b);
            edResult.setText(Double.toString(a));
            a=0;
            TAN=false;
        } else if (LOG){
            a = Math.log10(res1);
            edResult.setText(Double.toString(a));
            a=0;
            LOG=false;
        } else if (SQURE){
            a = Math.sqrt(res1);
            edResult.setText(Double.toString(a));
            a = 0;
            SQURE = false;
        } else if (FACT){
            factNum = (int) res1;
            int f = factorial(factNum);
            edResult.setText(Integer.toString(f));
            a = 0;
            FACT = false;
        }
    }

//    factorial problem
    private int factorial(int a) {
        if (a >= 1){
            return (a * factorial(a - 1));
        } else return 1;
    }

    private void clearEdRes() {
        edResult.setText(null);
    }

    private void clear() {
        edInput.setText(null);
        edResult.setText(null);
    }
}