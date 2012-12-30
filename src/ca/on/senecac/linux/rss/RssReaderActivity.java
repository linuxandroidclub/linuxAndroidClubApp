package ca.on.senecac.linux.rss;

import ca.on.senecac.linux.R;
import android.app.ListActivity;
import android.net.Uri;
import android.os.Bundle;

public class RssReaderActivity extends ListActivity {
    /** Called when the activity is first created. */
	
	private static final String FEED_URI = "http://news.google.ca/news?pz=1&cf=all&ned=ca&hl=en&output=rss";
	//private static final String FEED_URI = "https://scs.senecac.on.ca/feed/class-cancellation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.feedlist);
        setListAdapter(Adapters.loadCursorAdapter(this, R.xml.rss_feed,
                "content://linuxandroidxmldocument/?url=" + Uri.encode(FEED_URI)));
        //getListView().setOnItemClickListener(new UrlIntentListener());
    }
}