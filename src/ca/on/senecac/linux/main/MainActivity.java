package ca.on.senecac.linux.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import ca.on.senecac.linux.R;
import ca.on.senecac.linux.ttc.TTCActivity;
//import com.senecaapp.gridview.GridViewActivity;
import ca.on.senecac.linux.rss.RssReaderActivity;

public class MainActivity extends Activity {
	
	Button rssreader, /*gridview*/businfo;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        rssreader = (Button) findViewById(R.id.rssreader);
        //gridview = (Button) findViewById(R.id.gridview);
        businfo = (Button) findViewById(R.id.businfo);
        
        rssreader.setOnClickListener(new OnClickListener () {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent rss = new Intent();
				rss.setClass(MainActivity.this, RssReaderActivity.class);
				startActivity(rss);
			}
        	
        });
        
        /*gridview.setOnClickListener(new OnClickListener  () {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent grid = new Intent();
				grid.setClass(SenecaAppActivity.this, GridViewActivity.class);
				startActivity(grid);
			}
        	
        });*/
        
        businfo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bus = new Intent();
				bus.setClass(MainActivity.this, TTCActivity.class);
				startActivity(bus);
			}
		});
    }
}