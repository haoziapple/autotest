package com.fzrj.pay.autotest.web.springtest.dynamicbean;

/**
 * @className:com.fzrj.pay.autotest.web.springtest.dynamicbean.ExampleBeanHelper
 * @description:TODO
 * @version:v1.0.0 
 * @date:2017年3月6日 上午10:09:31
 * @author:WangHao
 */
public class ExampleBeanHelper
{
	private static String name = null;

	public static String getName()
	{
		return name;
	}

	public static void setName(String name)
	{
		ExampleBeanHelper.name = name;
	}
}
