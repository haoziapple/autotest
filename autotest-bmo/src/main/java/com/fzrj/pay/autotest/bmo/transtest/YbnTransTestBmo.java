package com.fzrj.pay.autotest.bmo.transtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fzrj.pay.autotest.bean.po.ybn.order.YbnOrderBean;
import com.fzrj.pay.autotest.dao.transtest.YbnTransTestDao;

/**
 * @className:com.fzrj.pay.autotest.bmo.transtest.YbnTransTestBmo
 * @description:煜百年数据库事务测试DAO
 * @version:v1.0.0
 * @date:2017年2月25日 上午10:59:26
 * @author:WangHao
 */
@Service
public class YbnTransTestBmo
{
	/**
	 * 日志记录
	 */
	private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager
			.getLogger(YbnTransTestBmo.class);

	@Autowired
	private YbnTransTestDao ybnTransTestDao;

	// 测试事务回滚
	@Transactional
	public void testTransRollback()
	{
		String testOrderCode = "111111111";

		YbnOrderBean testBean = ybnTransTestDao.queryOrder(testOrderCode);
		logger.debug("更新前订单审核状态：" + testBean.getCheck_status());

		// 更新操作
		ybnTransTestDao.updateOrderCheckStatus(testOrderCode);

		testBean = ybnTransTestDao.queryOrder(testOrderCode);
		logger.debug("更新后订单审核状态：" + testBean.getCheck_status());

		throw new RuntimeException("事务提交前异常");
	}

	// 测试嵌套事务
	@Transactional
	public void testRecurseTrans()
	{
		// 插入操作
		YbnOrderBean testInsertBean = new YbnOrderBean();
		testInsertBean.setConsumption_code("testOrderCode");
		ybnTransTestDao.insertOrder(testInsertBean);

		testTransRollback();
	}

	// 测试事务更新的可见性
	@Transactional
	public void testUpdateReadable()
	{
		String testOrderCode = "111111111";

		YbnOrderBean testBean = ybnTransTestDao.queryOrder(testOrderCode);
		String beforeStatus = testBean.getCheck_status();
		logger.debug("更新前订单审核状态：" + beforeStatus);

		// 更新操作
		ybnTransTestDao.updateOrderCheckStatus(testOrderCode);

		YbnOrderBean updatedBean = ybnTransTestDao.queryOrder(testOrderCode);
		String afterStatus = updatedBean.getCheck_status();
		logger.debug("更新后订单审核状态：" + afterStatus);

		if (beforeStatus.equals(afterStatus))
		{
			logger.debug("事务中更新方法，更新后的数据不可见，仍为更新前数据");
		}
	}

	// 测试事务插入的可见性
	@Transactional
	public void testInsertReadable()
	{
		String testOrderCode = "testOrderCode";

		YbnOrderBean testBean = ybnTransTestDao.queryOrder(testOrderCode);

		String count = ybnTransTestDao.queryOrderCount();
		logger.debug("插入前订单条数：" + count);
		if (null == testBean)
		{
			logger.debug("待插入订单不存在");
		}
		else
		{
			logger.debug("待插入订单已存在，测试结束");
			return;
		}

		// 插入操作
		YbnOrderBean testInsertBean = new YbnOrderBean();
		testInsertBean.setConsumption_code(testOrderCode);
		ybnTransTestDao.insertOrder(testInsertBean);

		testBean = ybnTransTestDao.queryOrder(testOrderCode);

		count = ybnTransTestDao.queryOrderCount();
		logger.debug("插入后订单条数：" + count);
		if (null == testBean)
		{
			logger.debug("事务中插入数据后仍然查询不到");
		}
		else
		{
			logger.debug("事务插入数据后可以查询到:" + testBean);
		}
	}

	// 测试事务删除的可见性
	@Transactional
	public void testDeleteReadable()
	{
		String testOrderCode = "testOrderCode";
		YbnOrderBean testBean = ybnTransTestDao.queryOrder(testOrderCode);

		String count = ybnTransTestDao.queryOrderCount();
		logger.debug("删除前订单条数：" + count);
		if (null == testBean)
		{
			logger.debug("待删除订单不存在，测试结束");
			return;
		}
		else
		{
			logger.debug("待删除订单存在" + testBean);
		}
		// 删除操作
		ybnTransTestDao.deleteOrder(testOrderCode);

		testBean = ybnTransTestDao.queryOrder(testOrderCode);
		count = ybnTransTestDao.queryOrderCount();
		logger.debug("删除后订单条数：" + count);

		if (null == testBean)
		{
			logger.debug("事务中查询不到已删除订单");
		}
		else
		{
			logger.debug("事务中仍然能查询到订单" + testBean);
		}
	}
}