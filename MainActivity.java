package com.shamnaf.listview;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView li;
	TextView t;
	String[] ar={"apple","orange","pinapple","gua","watermelon","blueberry","mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        li=(ListView)findViewById(R.id.list);
        t=(TextView)findViewById(R.id.txt);
      
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  
                android.R.layout.simple_spinner_dropdown_item,ar);  
        li.setAdapter(adapter);
        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
            @Override  
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {  
                
                String value=adapter.getItem(position);  
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();  
    }
        });


   
    }
    
}
