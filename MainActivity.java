package com.shamnaf.alertbox;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	Button b;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.btn);
        b.setOnClickListener(new OnClickListener(){
        	 @Override
        	 public void onClick(View v){
        		 AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        		 builder.setCancelable(true);
        		 builder.setMessage("this is an alert box");
        		 builder.setPositiveButton("ok",null);
        		 builder.setNeutralButton("cancel",null);
        		 AlertDialog myalert=builder.create();
        		 myalert.show();
        		 
        	 }
        	 
        });
    }


   
    
}
