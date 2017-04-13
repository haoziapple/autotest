package com.fzrj.pay.autotest.web.transtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fzrj.pay.autotest.bmo.transtest.YbnTransTestBmo;

/**
 * @className:com.fzrj.pay.autotest.web.transtest.YbnTransTestController
 * @description:煜百年数据库事务测试Controller
 * @version:v1.0.0
 * @date:2017年2月25日 上午11:19:27
 * @author:WangHao
 */

@Controller
@RequestMapping("/ybnTransTest")
public class YbnTransTestController
{

	/**
	 * 日志记录
	 */
	private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager
			.getLogger(YbnTransTestController.class);
	@Autowired
	private YbnTransTestBmo ybnTransTestBmo;

	// 测试事务回滚
	@RequestMapping(value = "/testTransRollback", method = RequestMethod.POST)
	public @ResponseBody String testTransRollback(@RequestBody String testString)
	{
		logger.debug(testString);

		try
		{
			ybnTransTestBmo.testTransRollback();
		}
		catch (Exception e)
		{
			logger.error("测试事务回滚异常", e);
		}
		return "测试事务回滚";
	}

	// 测试嵌套事务
	@RequestMapping(value = "/testRecurseTrans", method = RequestMethod.POST)
	public @ResponseBody String testRecurseTrans(@RequestBody String testString)
	{
		logger.debug(testString);

		try
		{
			ybnTransTestBmo.testRecurseTrans();
		}
		catch (Exception e)
		{
			logger.error("测试嵌套事务异常", e);
		}
		return "测试嵌套事务";
	}

	// 测试事务更新的可见性
	@RequestMapping(value = "/testUpdateReadable", method = RequestMethod.POST)
	public @ResponseBody String testUpdateReadable(@RequestBody String testString)
	{
		logger.debug(testString);

		try
		{
			ybnTransTestBmo.testUpdateReadable();
		}
		catch (Exception e)
		{
			logger.error("测试事务更新的可见性异常", e);
		}
		return "测试事务更新的可见性";
	}

	// 测试事务插入的可见性
	@RequestMapping(value = "/testInsertReadable", method = RequestMethod.POST)
	public @ResponseBody String testInsertReadable(@RequestBody String testString)
	{
		logger.debug(testString);

		try
		{
			ybnTransTestBmo.testInsertReadable();
		}
		catch (Exception e)
		{
			logger.error("测试事务插入的可见性异常", e);
		}
		return "测试事务插入的可见性";
	}

	// 测试事务删除的可见性
	@RequestMapping(value = "/testDeleteReadable", method = RequestMethod.POST)
	public @ResponseBody String testDeleteReadable(@RequestBody String testString)
	{
		logger.debug(testString);

		try
		{
			ybnTransTestBmo.testDeleteReadable();
		}
		catch (Exception e)
		{
			logger.error("测试事务删除的可见性异常", e);
		}
		return "测试事务删除的可见性";
	}
}
