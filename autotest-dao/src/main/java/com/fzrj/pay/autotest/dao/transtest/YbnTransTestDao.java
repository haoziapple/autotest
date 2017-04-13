package com.fzrj.pay.autotest.dao.transtest;

import com.fzrj.pay.autotest.bean.po.ybn.order.YbnOrderBean;

/**
 * @className:com.fzrj.pay.autotest.dao.transtest.YbnTransTestDao
 * @description:煜百年数据库事务测试DAO
 * @version:v1.0.0
 * @date:2017年2月25日 上午9:46:06
 * @author:WangHao
 */
public interface YbnTransTestDao
{

	/**
	 * @Description:更新订单审核状态
	 * @param orderCode
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2017年2月25日 上午9:56:13
	 */
	void updateOrderCheckStatus(String orderCode);

	/**
	 * @Description:插入订单信息
	 * @param ybnOrderBean
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2017年2月25日 上午10:13:17
	 */
	void insertOrder(YbnOrderBean ybnOrderBean);

	/**
	 * @Description:查询订单信息
	 * @param orderCode
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2017年2月25日 上午10:16:33
	 */
	YbnOrderBean queryOrder(String orderCode);

	/**
	 * @Description:查询订单总数
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2017年2月25日 上午10:16:16
	 */
	String queryOrderCount();

	/**
	 * @Description:删除订单
	 * @param orderCode
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2017年2月25日 下午4:39:42
	 */
	void deleteOrder(String orderCode);
}
