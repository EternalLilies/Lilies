package homework3;

import homework3.ShoppingCart.*;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        //不推荐使用这种方式创建对象
//        cart.addItem(new Clothing("T-Shirt", 80, "M", "Black"));
//        cart.addItem(new Food("Apple", 2, "2025-5-1"));
//        cart.addItem(new Electronics("Laptop", 5999, "2 years"));
//        System.out.println(cart.toString());

        Clothing clothing = new Clothing("Jeans", 120, "L", "Blue");
        clothing.setItemCount(2);
        cart.addItem(clothing);
        Food food = new Food("Banana", 3, "2025-5-1");
        food.setItemCount(1);
        cart.addItem(food);
        food.addItemCount(8);
        cart.renewItem();
        Food food2 = new Food("Banana", 5, "2025-5-1");
        food2.addItemCount(10);
        cart.addItem(food2);
        System.out.println(cart.toString());

        cart.removeItem(food);
        System.out.println(cart.toString());

        System.out.println("The item count is " + cart.getItemCount() + ".");
        System.out.println("The total is " + cart.getTotalPrice() + " yuan.");

/*        //无法移除的对象
        cart.removeItem(new Clothing("T-Shirt", 80, "M", "Black"));
        System.out.println(cart.toString());

        //只能通过修改ArrayList中的对象来移除对象
        ArrayList <Item> items = cart.getItems();
        for (Item item : items) {
            if (item instanceof Clothing) {
                Clothing clothingItem = (Clothing) item;
                if (clothingItem.getName().equals("T-Shirt")) {
                    cart.removeItem(clothingItem);
                    break;
                }
            }
        }
        System.out.println(cart.toString());

        //或者通过清空来移除所有对象
        cart.clear();
        System.out.println(cart.toString()); */

    }
}
