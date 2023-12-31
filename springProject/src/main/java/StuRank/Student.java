package StuRank;

import java.util.Arrays;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements BeanNameAware, InitializingBean, DisposableBean{

	String name;
	int [] score;
	int total, avg, rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	
	// toString
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + Arrays.toString(score) + "]";
	}

	// implements
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
