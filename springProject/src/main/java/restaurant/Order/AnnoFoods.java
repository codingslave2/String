package Restaurant.Order;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class AnnoFoods {

    HashMap<String, Foods> map;

    public AnnoFoods() {
        map = new HashMap<>();
        map.put("제육덮밥", new Foods("제육덮밥", "밥", 5000, 1)); // 이름 종류 가격 수량
        map.put("불고기덮밥", new Foods("불고기덮밥", "밥", 7000, 1));
        map.put("오므라이스", new Foods("오므라이스", "밥", 6000, 1));
        map.put("돈까스덮밥", new Foods("돈까스덮밥", "밥", 8000, 1));
        map.put("카레라이스", new Foods("카레라이스", "밥", 6000, 1));
        
        map.put("된장찌개", new Foods("된장찌개", "찌개", 5000, 1));
        map.put("김치찌개", new Foods("김치찌개", "찌개", 6000, 1));
        map.put("부대찌개", new Foods("부대찌개", "찌개", 7000, 1));
    }
    
    public Foods ordering(String ...ord) {
		System.out.println(ord[0] + " 주문 완료");
    	
    	return map.get(ord[0]);
    	
    }
}
