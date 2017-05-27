package cn.caizhongdong.numberofsteps.domain.annotation;


import cn.caizhongdong.numberofsteps.domain.validator.OrderValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME) 
@Constraint(validatedBy = OrderValidator.class)
public @interface ValidOrder {
	String message() default "订单验证失败。";  
    Class<?>[] groups() default {};  
    Class<? extends Payload>[] payload() default {}; 
}
