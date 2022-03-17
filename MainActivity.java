package com.shamnaf.dialogbox;

import android.os.Bundle;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DialogFragment;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.app.AlertDialog; 
import android.app.Dialog;
import android.app.DialogFragment;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.btndialog);
        b.setOnClickListener(new OnClickListener(){
     
			 public void onClick(View v) {
				// TODO Auto-generated method stub
			   	 ShowDateTimeDialog dt=new ShowDateTimeDialog();
        		 dt.show(getFragmentManager(),null);
			}
        	
        });
    }
   public class ShowDateTimeDialog extends DialogFragment{
	   @Override
    	public Dialog onCreateDialog(Bundle savedInstanceState){
    		 Calendar c=Calendar.getInstance();
    		 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyy HH:mm:ss");
    		 String strDate=sdf.format(c.getTime());
    		 AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
    		 builder.setTitle("Date and Time");
    		 builder.setMessage(strDate);
    		 builder.setNeutralButton("ok",null);
    		 return builder.create();
    		 
    		 
    		 
    		 
    		 
    	 }
    	
    }


    
}
