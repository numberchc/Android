package org.crazyit.service;

import android.app.IntentService;
import android.content.Intent;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class MyIntentService extends IntentService
{
	public MyIntentService()
	{
		super("MyIntentService");
	}

	// IntentService会使用单独的线程来执行该方法的代码
	@Override
	protected void onHandleIntent(Intent intent)
	{
		// 该方法内可以执行任何耗时任务，比如下载文件等，此处只是让线程暂停20秒
		long endTime = System.currentTimeMillis() + 20 * 1000;
		System.out.println("onStart");
		while (System.currentTimeMillis() < endTime)
		{
			synchronized (this)
			{
				try
				{
					wait(endTime - System.currentTimeMillis());
				}
				catch (Exception e)
				{
				}
			}
		}
		System.out.println("---耗时任务执行完成---");
	}
}
