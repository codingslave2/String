package aop_p.Score;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StudentRes {
	
	Map<String, Student> map = new HashMap();

	void add(Student data) {
		Student sd = null;
		if(map.containsKey(data.getName())) {
            sd = map.get(data.getName());
            sd.setScore(sd.getName() + data.getName());
        }else {
			sd = new Student();

		}
	}
	
}
