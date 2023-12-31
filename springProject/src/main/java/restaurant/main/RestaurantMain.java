package Restaurant.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Restaurant.Order.AnnoFoods;
import Restaurant.Order.Foods;

public class RestaurantMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("Restaurant.Order");

        AnnoFoods annoFoods = context.getBean(AnnoFoods.class);
        Foods fd1 = annoFoods.ordering("제육덮밥");
        Foods fd2 = annoFoods.ordering("불고기덮밥");

        System.out.println("식단: " + fd1.getName());
        System.out.println("가격: " + fd1.getPrice() + "원");
        System.out.println("수량: " + fd1.getQuantity() + "개");
        
        System.out.println("======================================");
        System.out.println("식단: " + fd2.getName());
        System.out.println("가격: " + fd2.getPrice() + "원");
        System.out.println("수량: " + fd2.getQuantity() + "개");

        context.close();
    }
}
