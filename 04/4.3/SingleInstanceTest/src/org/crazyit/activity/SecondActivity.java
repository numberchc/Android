package org.crazyit.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Description: <br/>
 * site: <a href="http://www.crazyit.org">crazyit.org</a> <br/>
 * Copyright (C), 2001-2014, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class SecondActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		setContentView(layout);
		// 创建一个TextView来显示该Activity和它所在Task ID。
		TextView tv = new TextView(this);
		tv.setText("Activity为：" + this.toString()
			+ "\n" + "，Task ID为:" + this.getTaskId());
		layout.addView(tv);
		Button button = new Button(this);
		button.setText("启动SingleInstanceTest");
		layout.addView(button);
		button.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(SecondActivity.this
					, SingleInstanceTest.class);
				startActivity(intent);
			}
		});
	}
}
