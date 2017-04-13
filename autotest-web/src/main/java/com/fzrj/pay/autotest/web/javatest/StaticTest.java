package com.fzrj.pay.autotest.web.javatest;

/**
 * @className:com.fzrj.pay.autotest.web.javatest.StaticTest
 * @description:静态方法测试
 * @version:v1.0.0
 * @date:2017年3月1日 下午1:52:01
 * @author:WangHao
 */
public class StaticTest
{
	static
	{
		System.out.println("静态块初始化");
	}

	public final static String finalStr = "finalStaticString";
	
	public static String str = "staticStr";
}
