package com.fzrj.pay.autotest.web.converttest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fzrj.pay.autotest.bean.vo.converttest.TestXmlBean;

/**
 * @className:com.fzrj.pay.autotest.web.converttest.ConverterTestController
 * @description:请求转换测试
 * @version:v1.0.0
 * @date:2017年2月27日 下午3:22:49
 * @author:WangHao
 */
@Controller
@RequestMapping("/converterTest")
public class ConverterTestController
{
	/**
	 * 日志记录
	 */
	private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager
			.getLogger(ConverterTestController.class);

	// 测试请求bean的xml转换
	@RequestMapping(value = "/testConvert", method = RequestMethod.POST)
	public @ResponseBody TestXmlBean testTransRollback(@RequestBody TestXmlBean testXmlBean)
	{
		logger.debug("测试请求bean的xml转换:" + testXmlBean);

		testXmlBean.setName("测试bean名称");

		return testXmlBean;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Integer.parseInt(" "));
	}
}
