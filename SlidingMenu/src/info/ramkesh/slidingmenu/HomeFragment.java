package info.ramkesh.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import info.ramkesh.slidingmenu.adapter.ImageAdapter;
import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.GridView;
import java.lang.Object.*;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class HomeFragment extends Fragment {
	Fragment fragment = null;
	View v;
	public HomeFragment(){}
	GridView gridView;

	static final String[] MOBILE_OS = new String[] { "Android", "iOS", "Windows", "Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry","Blackberry" };

	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
	
		View v = inflater.inflate(R.layout.main, null);
		
		final TextView tv;
		    
		    
		       
		        tv = (TextView) v.findViewById(R.id.marquee);  
		        tv.setSelected(true);  // Set focus to the textview
		    
		
		gridView = (GridView) v.findViewById(R.id.gridView1);
		
		gridView.setAdapter(new ImageAdapter(getActivity(),MOBILE_OS ));

		//gridView.setAdapter(new ImageAdapter(this, MOBILE_OS));
		
	/*	Handler h = new Handler();
		//h.sendEmptyMessage(0);
		
		    try {
		         h.postDelayed(new Runnable() {

		            @Override
		            public void run() {
		            	getActivity().finish();
		            	Intent ii = new Intent(getActivity(),GridViewActivity.class);
		            	 
		                //ii.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		               startActivity(ii);
		           }
		         }, 3000);

		       } catch (Exception e) {
		           e.printStackTrace();
		       }
		*/
 
       // View rootView = inflater.inflate(R.layout.main, container, false);
         
        return v;
    }
}


