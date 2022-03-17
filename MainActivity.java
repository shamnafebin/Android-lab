package com.shamnaf.multiplication;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	TextView t;
	EditText e;
	Button b;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.edt);
        t=(TextView)findViewById(R.id.t);
        t.setText("enter the number");
       
        b=(Button)findViewById(R.id.btn);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()){
					case R.id.btn:
						StringBuffer bf=new StringBuffer();
						
						String s=e.getText().toString();
						int n=Integer.parseInt(s);
						for(int i=1;i<=10;i++)
							{
							int ans=i*n;
							bf.append(i+"x"+n+"="+ans+"\n");
							
							}
					 t.setText(bf);
					break;
					
				}
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
