package com.fzrj.pay.autotest.bean.vo.converttest;

/**
 * @className:com.fzrj.pay.autotest.bean.vo.converttest.TestResponseBean
 * @description:测试返回bean-不使用@XmlRootElement注解
 * @version:v1.0.0
 * @date:2017年2月27日 下午4:01:23
 * @author:WangHao
 */
public class TestResponseBean
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
		return "TestResponseBean [name=" + name + ", id=" + id + "]";
	}
}
