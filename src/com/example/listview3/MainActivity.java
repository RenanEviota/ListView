package com.example.listview3;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lv;
	//define data source
	ArrayList<Student>list=new ArrayList<Student>();
	MyAdapter adapter;
    
   
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		lv=(ListView)this.findViewById(R.id.listView1);
		//put static data to the data source
		list.add(new Student(R.drawable.icon,"Alpha,Bravo","BSIT"));
		list.add(new Student(R.drawable.icon,"Charlie,hotel","BSCOE"));
		list.add(new Student(R.drawable.icon,"Mike,India","BSOA"));
		list.add(new Student(R.drawable.icon,"James,Ruzzel","ABSA"));
		list.add(new Student(R.drawable.icon,"David,Cruz","BSBA"));
		list.add(new Student(R.drawable.icon,"juliet,Sierra","BSEE"));
		list.add(new Student(R.drawable.icon,"Delta,Tango","BSHRM"));
		list.add(new Student(R.drawable.icon,"November,Kilo","AB"));
		//instance of adapter
		adapter=new MyAdapter(this,list);
		//associate the adapter to the listview
		this.lv.setAdapter(adapter);
	}

    
    
}
