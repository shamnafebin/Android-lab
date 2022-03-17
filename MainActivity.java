package com.shamnaf.addtwono;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import  android.view.View.OnClickListener;
import  android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;


public class MainActivity extends Activity {
	EditText n1,n2;
	Button b1;
	TextView res;
	int a,b,sum;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)(findViewById(R.id.txtNum1));
        n2=(EditText)(findViewById(R.id.txtNum2));
        res=(TextView)(findViewById(R.id.txtResult));
        b1=(Button)(findViewById(R.id.btnAdd));
        b1.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v ) {
        		if(n1.length()>0 && n2.length()>0)
        		{
        			a=Integer.parseInt(n1.getText().toString());
        		    b=Integer.parseInt(n2.getText().toString());
        	        sum=a+b;
        	        res.setText("Sum is "+sum);
        }
        else
        	res.setText("Input please!");
       }
  });
  
  }
  }
