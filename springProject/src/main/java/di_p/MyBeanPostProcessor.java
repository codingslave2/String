package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor.BeforeInit 실행 : "+beanName+" => "+ bean);
		
		if(bean.getClass().getName().equals("di_p.Umbrella")) {
			System.out.println(bean + " : 우산");
			Umbrella uu = (Umbrella)bean;
			
			if(uu.getPrice() > 5000) {
				uu.setType("expensive");
			}
			
		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("MyBeanPostProcessor.AfterInit 실행 : "+beanName+" => "+ bean);
		
		Umbrella uu = (Umbrella)bean;
		uu.setPrice(4500);
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
}