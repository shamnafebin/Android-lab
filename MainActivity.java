package com.shamnaf.radiobutton;

import android.os.Bundle;


import android.app.Activity;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;


public class MainActivity extends Activity {
	RadioButton rm,rf;
	RadioGroup rg;
	TextView t;
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rm=(RadioButton)findViewById(R.id.rbtn1);
        rf=(RadioButton)findViewById(R.id.rbtn2);
        rg=(RadioGroup)findViewById(R.id.grp);
        t=(TextView)findViewById(R.id.txt1);
       
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener(){
        	@Override
        	public void onCheckedChanged(RadioGroup group,int checkdid){
        		if(rm.isChecked())
        			t.setText("you are a man");
        	
        	if(rf.isChecked())
        		t.setText("you are a women");
        	}
        });
    }


    
   
    }
    

