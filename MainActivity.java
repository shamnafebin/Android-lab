package com.shamnaf.spinnertoast;

import android.os.Bundle;





import android.app.Activity;
import android.view.Menu;


import android.widget.ArrayAdapter;
import android.widget.Spinner;






public class MainActivity extends Activity {
 Spinner sp;
	   private String[] spinnerarray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        sp=(Spinner)findViewById(R.id.spinner1);
        this.spinnerarray =new String[]{"apple","banana","orange","pinapple"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,spinnerarray);
        sp.setAdapter(adapter);
        
        
        
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
     
   
    	
    
   
    
}
