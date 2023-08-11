package StuRank;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.BeforeInit 실행 : " + beanName + " => " + bean);

        // StuScore 클래스의 경우 처리 예시
        if (bean instanceof StuScore) {
            StuScore stuScore = (StuScore) bean;
            int totalScore = calculateTotalScore(stuScore.getScore());
            stuScore.setGrade(calculateGrade(totalScore));
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.AfterInit 실행 : " + beanName + " => " + bean);

        // 추가적인 처리를 위한 로직 작성

        return bean;
    }

    // 학생들의 점수를 바탕으로 총점을 계산하는 메서드
    private int calculateTotalScore(List<Integer> list) {
        int totalScore = 0;
        
        for (int score : list) {
            totalScore += score;
        }
        return totalScore;
    }

    // 총점을 바탕으로 등급을 계산하는 메서드
    private String calculateGrade(int totalScore) {
        if (totalScore >= 250) {
            return "A";
        } else if (totalScore >= 200) {
            return "B";
        } else if (totalScore >= 150) {
            return "C";
        } else {
            return "F";
        }
    }
}
