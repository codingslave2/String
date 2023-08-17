package Restaurant.Order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AnnoOrder {

    @Before("execution(* Restaurant.Order.AnnoFoods.ordering(..))")
    void beforeOrdering(JoinPoint joinPoint) {
        System.out.println("비포: " + joinPoint.getSignature().toShortString());
    }
    
    @After("execution(* Restaurant.Order.AnnoFoods.ordering(..))")
    void afterOrdering(JoinPoint joinPoint) {
    	System.out.println("에프터: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning("execution(* Restaurant.Order.AnnoFoods.ordering(..))")
    void afterOrdering2(JoinPoint joinPoint) {
        System.out.println("리터닝: " + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing("execution(* Restaurant.Order.AnnoFoods.ordering(..))")
    void afterOrdering3(JoinPoint joinPoint) {
        System.out.println("스로잉: " + joinPoint.getSignature().toShortString());
    }

}
