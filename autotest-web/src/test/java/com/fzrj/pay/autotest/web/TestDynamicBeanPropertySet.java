package com.fzrj.pay.autotest.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fzrj.pay.autotest.web.springtest.dynamicbean.ExampleBean;
import com.fzrj.pay.autotest.web.springtest.dynamicbean.ExampleBeanHelper;

import junit.framework.TestCase;

public class TestDynamicBeanPropertySet extends TestCase
{
	private ClassPathXmlApplicationContext context = null;

	public void setUp()
	{
		ExampleBeanHelper.setName("bean");
		context = new ClassPathXmlApplicationContext(new String[] { "classpath:dispatcher-servlet.xml", "classpath:mybatis.xml" });
	}

	public void testBean()
	{
		ExampleBean bean = (ExampleBean) context.getBean("exampleBean");

		assertEquals("bean", bean.getName());
	}
}
