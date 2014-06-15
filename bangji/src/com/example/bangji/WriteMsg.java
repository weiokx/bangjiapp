package com.example.bangji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WriteMsg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_msg);
        Button publish_msg = (Button)findViewById(R.id.publish_msg);
        //write_msg.setOnClickListener(mWriteListener);
        publish_msg.setOnClickListener(new WriteMsgListener());
        
    }
    
	class WriteMsgListener implements OnClickListener{
	    	
	    	@Override
	        public void onClick(View v) {
	            Intent intent = new Intent();
	            intent.setClass(WriteMsg.this, MainActivity.class);
	            WriteMsg.this.startActivity(intent);
	        }
	 }

}
