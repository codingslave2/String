package Restaurant.Order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Order {
    
    private List<Foods> orderedFoods;
    
    public Order() {
        orderedFoods = new ArrayList<>();

    }
    
    public void addOrderedFood(Foods food) {
        if (orderedFoods.isEmpty()) {
            orderedFoods.add(food);
            return;
        }

        if (orderedFoods.contains(food)) {
            food.setQuantity(food.getQuantity() + 1);
            return;
        }

        orderedFoods.add(food);
    }
    
    public void removeOrderedFood(Foods food) {
        if (orderedFoods.isEmpty()) {
            return;
        }

        if (!orderedFoods.contains(food)) {
            return;
        }

        if (orderedFoods.size() == 1) {
            orderedFoods.clear();
            return;
        }

        food.setQuantity(food.getQuantity() - 1);

        if (food.getQuantity() == 0) {
            orderedFoods.remove(food);
        }
        orderedFoods.remove(food);

    }
    
    
    public List<Foods> getOrderedFoods() {
        if (orderedFoods.isEmpty()) {
            return null;
        }

        List<Foods> orderedFoods = new ArrayList<>();
        for (Foods food : this.orderedFoods) {
            orderedFoods.add(food);
        }

        return orderedFoods;
    }
    
    public int getTotalPrice() {
        int total = 0;
        for (Foods food : orderedFoods) {
            total += food.getPrice() * food.getQuantity();
        }
        return total;
    }
}
