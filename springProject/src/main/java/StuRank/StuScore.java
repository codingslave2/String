package StuRank;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class StuScore implements BeanNameAware, InitializingBean, DisposableBean{
    
    List<Integer> score;

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StuScore [score=" + score + "]";
    }

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

	public void setGrade(String calculateGrade) {
		// TODO Auto-generated method stub
		
	}
}
