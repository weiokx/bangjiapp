package com.example.bangji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button write_msg = (Button)findViewById(R.id.write_msg);
        //write_msg.setOnClickListener(mWriteListener);
        write_msg.setOnClickListener(new WriteMsgListener());
    }
    
    class WriteMsgListener implements OnClickListener{
    	
    	@Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, WriteMsg.class);
            MainActivity.this.startActivity(intent);
        }
    }
    
    /*
    private OnClickListener mWriteListener = new OnClickListener() {
    	
    	@Override
        public void onClick(View v) {
            // Request the next activity transition (here starting a new one).
            startActivity(new Intent(MainActivity.this, WriteMsg.class));
            // Supply a custom animation.  This one will just fade the new
            // activity on top.  Note that we need to also supply an animation
            // (here just doing nothing for the same amount of time) for the
            // old activity to prevent it from going away too soon.
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };
    */

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    */
    
}
