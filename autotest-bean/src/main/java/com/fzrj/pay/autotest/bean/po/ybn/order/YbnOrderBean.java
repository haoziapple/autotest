package com.fzrj.pay.autotest.bean.po.ybn.order;

import java.util.Date;

/**
 * @className:com.fzrj.pay.autotest.bean.po.ybn.order.YbnOrderBean
 * @description:煜百年订单信息bean
 * @version:v1.0.0
 * @date:2017年2月25日 上午10:12:11
 * @author:WangHao
 */
public class YbnOrderBean
{
	private String ID;

	private String consumption_key;

	private String consumption_code;

	private String account;

	private String card_key;

	private String consumption_money;

	private String actually_money;

	private Date add_time;

	private Date update_time;

	private String operate_code;

	private String store_key;

	private String associator_key;

	private String remarks;

	private String status;

	private String favourable_money;

	private String order_status;

	private String order_source;

	private String rank_name;

	private Date succuss_time;

	private Date close_time;

	private String close_type;

	private String check_status;

	private String first_blood;

	private String associator_name;

	private String tel;

	private String card;

	public String getID()
	{
		return ID;
	}

	public void setID(String iD)
	{
		ID = iD;
	}

	public String getConsumption_key()
	{
		return consumption_key;
	}

	public void setConsumption_key(String consumption_key)
	{
		this.consumption_key = consumption_key;
	}

	public String getConsumption_code()
	{
		return consumption_code;
	}

	public void setConsumption_code(String consumption_code)
	{
		this.consumption_code = consumption_code;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public String getCard_key()
	{
		return card_key;
	}

	public void setCard_key(String card_key)
	{
		this.card_key = card_key;
	}

	public String getConsumption_money()
	{
		return consumption_money;
	}

	public void setConsumption_money(String consumption_money)
	{
		this.consumption_money = consumption_money;
	}

	public String getActually_money()
	{
		return actually_money;
	}

	public void setActually_money(String actually_money)
	{
		this.actually_money = actually_money;
	}

	public Date getAdd_time()
	{
		return add_time;
	}

	public void setAdd_time(Date add_time)
	{
		this.add_time = add_time;
	}

	public Date getUpdate_time()
	{
		return update_time;
	}

	public void setUpdate_time(Date update_time)
	{
		this.update_time = update_time;
	}

	public String getOperate_code()
	{
		return operate_code;
	}

	public void setOperate_code(String operate_code)
	{
		this.operate_code = operate_code;
	}

	public String getStore_key()
	{
		return store_key;
	}

	public void setStore_key(String store_key)
	{
		this.store_key = store_key;
	}

	public String getAssociator_key()
	{
		return associator_key;
	}

	public void setAssociator_key(String associator_key)
	{
		this.associator_key = associator_key;
	}

	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getFavourable_money()
	{
		return favourable_money;
	}

	public void setFavourable_money(String favourable_money)
	{
		this.favourable_money = favourable_money;
	}

	public String getOrder_status()
	{
		return order_status;
	}

	public void setOrder_status(String order_status)
	{
		this.order_status = order_status;
	}

	public String getOrder_source()
	{
		return order_source;
	}

	public void setOrder_source(String order_source)
	{
		this.order_source = order_source;
	}

	public String getRank_name()
	{
		return rank_name;
	}

	public void setRank_name(String rank_name)
	{
		this.rank_name = rank_name;
	}

	public Date getSuccuss_time()
	{
		return succuss_time;
	}

	public void setSuccuss_time(Date succuss_time)
	{
		this.succuss_time = succuss_time;
	}

	public Date getClose_time()
	{
		return close_time;
	}

	public void setClose_time(Date close_time)
	{
		this.close_time = close_time;
	}

	public String getClose_type()
	{
		return close_type;
	}

	public void setClose_type(String close_type)
	{
		this.close_type = close_type;
	}

	public String getCheck_status()
	{
		return check_status;
	}

	public void setCheck_status(String check_status)
	{
		this.check_status = check_status;
	}

	public String getFirst_blood()
	{
		return first_blood;
	}

	public void setFirst_blood(String first_blood)
	{
		this.first_blood = first_blood;
	}

	public String getAssociator_name()
	{
		return associator_name;
	}

	public void setAssociator_name(String associator_name)
	{
		this.associator_name = associator_name;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getCard()
	{
		return card;
	}

	public void setCard(String card)
	{
		this.card = card;
	}

	@Override
	public String toString()
	{
		return "YbnOrderBean [ID=" + ID + ", consumption_key=" + consumption_key + ", consumption_code="
				+ consumption_code + ", account=" + account + ", card_key=" + card_key + ", consumption_money="
				+ consumption_money + ", actually_money=" + actually_money + ", add_time=" + add_time + ", update_time="
				+ update_time + ", operate_code=" + operate_code + ", store_key=" + store_key + ", associator_key="
				+ associator_key + ", remarks=" + remarks + ", status=" + status + ", favourable_money="
				+ favourable_money + ", order_status=" + order_status + ", order_source=" + order_source
				+ ", rank_name=" + rank_name + ", succuss_time=" + succuss_time + ", close_time=" + close_time
				+ ", close_type=" + close_type + ", check_status=" + check_status + ", first_blood=" + first_blood
				+ ", associator_name=" + associator_name + ", tel=" + tel + ", card=" + card + "]";
	}
}
