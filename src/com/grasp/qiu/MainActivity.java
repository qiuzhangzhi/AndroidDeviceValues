package com.grasp.qiu;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView de;
	TextView dp;
	TextView size;
	TextView dpsize;
	TextView is;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		DisplayMetrics metric = new DisplayMetrics();

		getWindowManager().getDefaultDisplay().getMetrics(metric);

		 

		

		de = (TextView)findViewById(R.id.de);
		de.setText("��ȣ�"+metric.widthPixels+"�߶ȣ�"+metric.heightPixels);
		
		
		int densityDpi = metric.densityDpi; 
	    dp = (TextView)findViewById(R.id.dp);
		dp.setText("dp��"+densityDpi);
		
		
	    double x = Math.pow(metric.widthPixels/metric.xdpi,2);
	    double y = Math.pow(metric.heightPixels/metric.ydpi,2);
	    double screenInches = Math.sqrt(x+y);
	    size = (TextView)findViewById(R.id.size);
	  	size.setText("��Ļ�ߴ磺"+screenInches);
	  	
	  	 final float scale = getResources().getDisplayMetrics().density; 
	  	 dpsize = (TextView)findViewById(R.id.dpsize);
	  	 int width =(int)(metric.widthPixels/scale +0.5f);
	  	int height =(int)(metric.heightPixels/scale +0.5f);
		 dpsize.setText("��Ļ��ȣ�"+width+"��Ļ�߶ȣ�"+height );	  	
	  	
		 is = (TextView)findViewById(R.id.is);
  boolean flag=true;
		 if(flag&&width>=320&&height>=426&&height<470)
		 {
			 is.setText("С��");
			 flag=false;
		 }
		 if(flag&&((width>=320&&width<480)||(height>=470&&height<640)))
		 {
			 is.setText("����");
			 flag=false;
		 }
	 if(flag&&((width>=480&&width<720)||(height>=640&&height<960)))
	 {
		 is.setText("����");
		 flag=false;
	 }
	 if(flag&&width>=720&&height>=960)
	 {
		 is.setText("������");
		 flag=false;
	 }
	}

}
