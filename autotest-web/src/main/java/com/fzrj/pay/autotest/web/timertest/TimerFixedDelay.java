package com.fzrj.pay.autotest.web.timertest;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @className:com.fzrj.pay.autotest.web.timertest.TimerFixedDelay
 * @description:固定延时
 * @version:v1.0.0
 * @date:2017年4月18日 下午2:44:47
 * @author:WangHao
 */
public class TimerFixedDelay
{
	static class LongRunningTask extends TimerTask
	{
		@Override
		public void run()
		{
			System.out.println("long running started" + new Date());
			try
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
			}
			System.out.println("long running finished" + new Date());
		}
	}

	static class FixedDelayTask extends TimerTask
	{
		@Override
		public void run()
		{
			System.out.println(new Date());
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		Timer timer = new Timer();

		timer.schedule(new LongRunningTask(), 10);
		// 上一个任务执行完才会执行
//		timer.schedule(new FixedDelayTask(), 1000, 2000);
		// 固定周期的会把执行次数尽量补上
		timer.scheduleAtFixedRate(new FixedDelayTask(), 1000, 2000);
	}
}
