package com.example.bangji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WriteMsg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_msg);
        Button publish_msg = (Button)findViewById(R.id.publish_msg);
        publish_msg.setOnClickListener(new WriteMsgListener());
        Intent intent = getIntent();
        String user_id = intent.getStringExtra("user_id");
        System.out.println("intent.extra");
        TextView publish_title = (TextView)findViewById(R.id.publish_title);
        publish_title.setText("user_id="+user_id);
        
    }
    
	class WriteMsgListener implements OnClickListener{
	    	
	    	@Override
	        public void onClick(View v) {
	            Intent intent = new Intent();
	            intent.setClass(WriteMsg.this, MainActivity.class);
	            WriteMsg.this.startActivity(intent);
	            finish();  // 删除task列表里面的当前Activity对象
	        }
	 }

}
