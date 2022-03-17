package com.shamnaf.checkbox;

import android.os.Bundle;

import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;

import android.app.Activity;

import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends Activity {
	CheckBox c1,c2,c3;
	Button b;
	TextView t;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.cbox1);
        c2=(CheckBox)findViewById(R.id.cbox2);
        c3=(CheckBox)findViewById(R.id.cbox3);
        b=(Button)findViewById(R.id.btn);
        t=(TextView)findViewById(R.id.txt);
        
        b.setOnClickListener(new OnClickListener(){
        	 @Override
        	public void onClick(View v){
        		String arr="";
        		if(c1.isChecked())
        		{
        			arr+="\n apple is selected";
        		}
        		if(c2.isChecked())
        		{
        			arr+="\n banana is selected";
        		}
        		if(c3.isChecked())
        		{
        			arr+="\n orange is selectd";
        			
        		}
        		t.setText(arr);
        		
        		
        		
        		
        	}
        	 
        		
        	
        });
    }
}
    


    
   
    

