package cn.caizhongdong.numberofsteps.domain.validator;


import cn.caizhongdong.numberofsteps.domain.Order;
import cn.caizhongdong.numberofsteps.domain.OrderItem;
import cn.caizhongdong.numberofsteps.domain.annotation.ValidOrder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrderValidator implements ConstraintValidator<ValidOrder, Order> {
	private final static Log log = LogFactory.getLog(OrderValidator.class);

	@Override
	public void initialize(ValidOrder order) {
		if(log.isTraceEnabled()){
			log.trace("validate ... " + order);
		}
	}

	@Override
	public boolean isValid(Order order, ConstraintValidatorContext context) {
		if(log.isTraceEnabled()){
			log.trace("isValid ... " + order + " " + order.getConsigneeAddress());
		}
		int cnt = 0;
		for(OrderItem item : order.getOrderItems()){
			cnt += item.getNum();
		}
		if(cnt > 20){
			 context.disableDefaultConstraintViolation();
		     context.buildConstraintViolationWithTemplate("订购商品总数不能超过20").addConstraintViolation();
		     return false;
		}
		return true;
	}

}
