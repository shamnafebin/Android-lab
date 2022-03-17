package com.shamnaf.add;

import android.os.Bundle;


import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class MainActivity extends Activity {
	EditText E1,E2;
	TextView T1;
	Button bt;
	int a,b,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=(EditText)(findViewById(R.id.edttxt1));
        E2=(EditText)(findViewById(R.id.edttxt2));
        T1=(TextView)(findViewById(R.id.txt));
        bt=(Button)(findViewById(R.id.btn));
        bt.setOnClickListener(new OnClickListener(){
       
        	
        		

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 if(E1.length()>0 && E2.length()>0)
        		 {
        			 a=Integer.parseInt(E1.getText().toString());
        			 b=Integer.parseInt(E2.getText().toString());
        			 sum=a+b;
        			 T1.setText("sum is"+sum);
        		 }
        		 else
        			 T1.setText("input please");
        			 
        			 
        		 }
        });
    }
			
        	 
        
        
        
   

	


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
