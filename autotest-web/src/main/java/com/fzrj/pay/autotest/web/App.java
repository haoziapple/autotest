package com.fzrj.pay.autotest.web;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		String test = "111^222^333";
		String[] a = test.split("\\^");

		String triggerTimes = "2";
		System.out.println("民生提交结算-定时器触发次数:" + (null == triggerTimes ? "null" : triggerTimes));
		
		String A= "acb";
		
		String B = A;
		
		A = "XYZ";
		
		System.out.println(B);
	}
}
