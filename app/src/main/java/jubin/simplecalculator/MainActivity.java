package jubin.simplecalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    //EditText numDisplay;
    TextView resultDisplay,numDisplay;
    //String operator;
    Button bClear,bOpen,bClose,bDel,bAdd,bSub,bMul,bDiv,bDot,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int a;
    double total;

    //private HelperCalculator calc = new HelperCalculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bClear=(Button)findViewById(R.id.button_clear);
        bOpen=(Button)findViewById(R.id.button_open);
        bClose=(Button)findViewById(R.id.button_close);
        bDel=(Button)findViewById(R.id.button_del);
        bAdd=(Button)findViewById(R.id.button_plus);
        bSub=(Button)findViewById(R.id.button_sub);
        bMul=(Button)findViewById(R.id.button_mul);
        bDiv=(Button)findViewById(R.id.button_div);
        bDot=(Button)findViewById(R.id.button_dot);
        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);

        numDisplay=(TextView)findViewById(R.id.numDisp);
        resultDisplay=(TextView)findViewById(R.id.totalDisp);

        bDot.setOnClickListener(this);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numDisplay.setText(numDisplay.getText()+"+");
                a=1;

            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                numDisplay.setText(numDisplay.getText()+"-");
                a=2;

            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                numDisplay.setText(numDisplay.getText()+"*");
                a=3;

            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                numDisplay.setText(numDisplay.getText()+"/");
                a=4;

            }
        });

    }
    public void onClick(View v)
    {

        switch(v.getId())
        {
            case R.id.button1:
                numDisplay.setText(numDisplay.getText()+"1");
                break;
            case R.id.button2:
                numDisplay.setText(numDisplay.getText()+"2");
                break;
            case R.id.button3:
                numDisplay.setText(numDisplay.getText()+"3");
                break;
            case R.id.button4:
                numDisplay.setText(numDisplay.getText()+"4");
                break;
            case R.id.button5:
                numDisplay.setText(numDisplay.getText()+"5");
                break;
            case R.id.button6:
                numDisplay.setText(numDisplay.getText()+"6");
                break;
            case R.id.button7:
                numDisplay.setText(numDisplay.getText()+"7");
                break;
            case R.id.button8:
                numDisplay.setText(numDisplay.getText()+"8");
                break;
            case R.id.button9:
                numDisplay.setText(numDisplay.getText()+"9");
                break;
            case R.id.button0:
                numDisplay.setText(numDisplay.getText()+"0");
                break;
            default:
                numDisplay.setText(numDisplay.getText()+".");
        }

    }

    public void total(View v){


        String asd=numDisplay.getText().toString();



        if(asd.equalsIgnoreCase("")){
            tosttt("pls enter values");
        }
        else {
            // second = Integer.parseInt(asd);
            double x,y;
            switch (a) {

                case 1:
                    String[] addd = asd.split("\\+");
                    String add1= addd[0] ;
                    String add2= addd[1] ;
                    x=Double.parseDouble(add1);
                    y=Double.parseDouble(add2);
                    total=x+y;
                    break;
                case 2:
                    String[] subb = asd.split("\\-");
                    String subb1= subb[0] ;
                    String subb2= subb[1] ;
                    x=Double.parseDouble(subb1);
                    y=Double.parseDouble(subb2);
                    total =x-y;
                    break;
                case 3:
                    String[] mull = asd.split("\\*");
                    String mull1= mull[0] ;
                    String mull2= mull[1] ;
                    x=Double.parseDouble(mull1);
                    y=Double.parseDouble(mull2);
                    total =x*y;
                    break;
                case 4:
                    String[] divv = asd.split("\\/");
                    String divv1= divv[0] ;
                    String divv2= divv[1] ;
                    x=Double.parseDouble(divv1);
                    y=Double.parseDouble(divv2);
                    total =x/y;
                    break;
                default:
                    total=Double.parseDouble(asd);

            }
            resultDisplay.setText(numDisplay.getText()+"="+total);
            numDisplay.setText("" + total);
        }



    }
    public void tosttt(String msg){

        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }
    public void clear(View v){
        numDisplay.setText("");
        resultDisplay.setText("");
    }

}
