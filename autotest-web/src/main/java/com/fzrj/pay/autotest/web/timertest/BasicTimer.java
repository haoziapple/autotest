package com.fzrj.pay.autotest.web.timertest;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @className:com.fzrj.pay.autotest.web.timertest.BasicTimer
 * @description:TODO
 * @version:v1.0.0
 * @date:2017年4月18日 下午2:41:02
 * @author:WangHao
 */
public class BasicTimer
{
	static class DelayTask extends TimerTask
	{

		@Override
		public void run()
		{
			System.out.println("delayed task");
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		Timer timer = new Timer();
		timer.schedule(new DelayTask(), 1000);
		Thread.sleep(2000);
		timer.cancel();
	}
}
