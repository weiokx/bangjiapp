package com.example.bangji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
    	// 重新MENU点击事件，当用户点击MENU按钮的时候，调用该方法
    	menu.add(0, 1, 1, R.string.exit);
    	menu.add(0, 2, 2, R.string.about);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		// 当用户点击菜单中某个选项时，会调用该方法
		if(item.getItemId() == 1) {
			finish();
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button write_msg = (Button)findViewById(R.id.write_msg);
        write_msg.setOnClickListener(new WriteMsgListener());
    }
    
    class WriteMsgListener implements OnClickListener{
    	
    	@Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("user_id", "12");
            intent.setClass(MainActivity.this, WriteMsg.class);
            MainActivity.this.startActivity(intent);
            finish();  // 删除task列表里面的当前Activity对象
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
