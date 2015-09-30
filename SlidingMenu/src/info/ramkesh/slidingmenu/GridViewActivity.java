package info.ramkesh.slidingmenu;

import info.ramkesh.slidingmenu.adapter.ImageAdapter;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;

public class GridViewActivity extends Activity {
	public void HomeFragment(){}

	GridView gridView;

	static final String[] MOBILE_OS = new String[] { "Android", "iOS", "Windows", "Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry" };

	public boolean onCreate(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		gridView = (GridView) findViewById(R.id.gridView1);

		gridView.setAdapter(new ImageAdapter(this, MOBILE_OS));


		 //View rootView = inflater.inflate(R.layout.main, container, false);
         
	        return true;
	}

}