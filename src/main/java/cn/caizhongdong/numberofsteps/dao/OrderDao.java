package cn.caizhongdong.numberofsteps.dao;

import cn.caizhongdong.numberofsteps.domain.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {

	
	public int insertOrder(@Param(value = "order") Order order);
	
	
	public Order getOrderById(int id);
}
