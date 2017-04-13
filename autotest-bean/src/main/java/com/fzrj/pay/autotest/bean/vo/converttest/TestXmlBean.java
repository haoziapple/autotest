package com.fzrj.pay.autotest.bean.vo.converttest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className:com.fzrj.pay.autotest.bean.vo.converttest.TestXmlBean
 * @description:测试xml转换bean
 * @version:v1.0.0
 * @date:2017年2月27日 下午3:38:16
 * @author:WangHao
 */
@XmlRootElement
public class TestXmlBean
{
	private String name;

	private int id;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "TestXmlBean [name=" + name + ", id=" + id + "]";
	}
}
