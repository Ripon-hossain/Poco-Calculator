package net.cogentit.pococalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView calculator,currency;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0, btnac,btndel,btnpercent,btndiv,btnmulti,btnminus,btnplus,btndot,btnequal;
    EditText ShowClatulation;
    Integer res1;
    Float   res2;
    Boolean Add, Sub, Dev, Multi, mode;
    Float ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculator=(ImageView)findViewById(R.id.calculator);
        currency=(ImageView)findViewById(R.id.currency);
        btn1=(Button)findViewById(R.id.num1);
        btn2=(Button)findViewById(R.id.num2);
        btn3=(Button)findViewById(R.id.num3);
        btn4=(Button)findViewById(R.id.num4);
        btn5=(Button)findViewById(R.id.num5);
        btn6=(Button)findViewById(R.id.num6);
        btn7=(Button)findViewById(R.id.num7);
        btn8=(Button)findViewById(R.id.num8);
        btn9=(Button)findViewById(R.id.num9);
        btn0=(Button)findViewById(R.id.num0);
        btnac=(Button)findViewById(R.id.clear);
        btndel=(Button)findViewById(R.id.del);
        btnpercent=(Button)findViewById(R.id.percentage);
        btndiv=(Button)findViewById(R.id.divide);
        btnmulti=(Button)findViewById(R.id.multiply);
        btnminus=(Button)findViewById(R.id.minus);
        btnplus=(Button)findViewById(R.id.plus);
        btndot=(Button)findViewById(R.id.dot);
        btnequal=(Button)findViewById(R.id.equal);
        ShowClatulation=(EditText)findViewById(R.id.calculation);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowClatulation.setText(ShowClatulation.getText()+".");
            }
        });

        // ----------------  Actions   -------------
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Clear();
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str=ShowClatulation.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    ShowClatulation.setText(str);
                }
                else if (str.length() <=1 ) {
                    ShowClatulation.setText(null);
                }
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ShowClatulation == null){
                    ShowClatulation.setText("");
                }else{
                    storePre();
                    setFalse();
                    Add=true;
                    ShowClatulation.setText(null);
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ShowClatulation == null){
                    ShowClatulation.setText("");
                }else{
                    storePre();
                    setFalse();
                    Sub=true;
                    ShowClatulation.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ShowClatulation == null){
                    ShowClatulation.setText("");
                }else{
                    storePre();
                    setFalse();
                    Dev=true;
                    ShowClatulation.setText(null);
                }
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ShowClatulation == null){
                    ShowClatulation.setText("");
                }else{
                    storePre();
                    setFalse();
                    Multi=true;
                    ShowClatulation.setText(null);
                }
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ShowClatulation == null){
                    ShowClatulation.setText("");
                }else{
                    storePre();
                    setFalse();
                    mode=true;
                    ShowClatulation.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add){
                    ShowClatulation.setText(res1+Integer.parseInt(ShowClatulation.getText()+"")+"");
                }
                if(Sub){
                    ShowClatulation.setText(res1-Integer.parseInt(ShowClatulation.getText()+"")+"");
                }
                if(Dev){
                    ShowClatulation.setText(res1/Float.parseFloat(ShowClatulation.getText()+"")+"");
                }
                if(Multi){
                    ShowClatulation.setText(res1*Integer.parseInt(ShowClatulation.getText()+"")+"");
                }
                if(mode){
                    ShowClatulation.setText(res1/100.0f*Integer.parseInt(ShowClatulation.getText()+"")+"");
                }
            }
        });
    }

    void storePre(){
        res1= Integer.parseInt(ShowClatulation.getText()+"");
        res2 = Float.parseFloat(ShowClatulation.getText()+"");
    }
    void setFalse(){
        Add=Sub=Dev=Multi=mode=false;
    }
    void Clear(){
        res1=null;
        ShowClatulation.setText(null);
        setFalse();
    }
}