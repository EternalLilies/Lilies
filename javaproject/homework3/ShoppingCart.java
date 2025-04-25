package homework3;

import java.util.*;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double totalPrice;
    private int itemCount;

    public static abstract class Item {
        private String name;
        private double price;
        private int itemCount = 0;
        private double totalPrice = 0.0;

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setName(String name) {
            if (name == null) {
                throw new IllegalArgumentException("Name cannot be null");
            }
            this.name = name;
        }

        public void setPrice(double price) {
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be positive");
            }
            if (Double.isInfinite(price)) {
                throw new IllegalArgumentException("Price cannot be infinite");
            }
            if (Double.isNaN(price)) {
                throw new IllegalArgumentException("Price cannot be NaN");
            }
            this.price = price;
            this.totalPrice = itemCount * price;
        }

        public int getItemCount() {
            return itemCount;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setItemCount(int itemCount) {
            if (itemCount < 0) {
                throw new IllegalArgumentException("Item count cannot be negative");
            }
            this.itemCount = itemCount;
            this.totalPrice = itemCount * price;
        }

        public void addItemCount(int itemCount) {
            this.itemCount += itemCount;
            this.totalPrice += itemCount * price;
        }

        public void subItemCount(int itemCount) {
            if (itemCount > this.itemCount) {
                throw new IllegalArgumentException("Cannot remove more items than available");
            }
            if (itemCount < 0) {
                throw new IllegalArgumentException("Item count cannot be negative");
            }
            this.itemCount -= itemCount;
            this.totalPrice -= itemCount * price;
        }

        public abstract String toString();
    }

    public static class Clothing extends Item {
        private String size;
        private String color;

        public Clothing(String name, double price, String size, String color) {
            setName(name);
            setPrice(price);
            this.size = size;
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Clothing [name=" + getName() + ", price=" + getPrice() + ", size=" + size + ", color=" + color
                    + ", itemCount=" + getItemCount() + ", totalPrice=" + getTotalPrice() + "]";
        }
    }

    public static class Food extends Item {
        private String expirationDate;

        public Food(String name, double price, String expirationDate) {
            setName(name);
            setPrice(price);
            this.expirationDate = expirationDate;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        @Override
        public String toString() {
            return "Food [name=" + getName() + ", price=" + getPrice() + ", expirationDate=" + expirationDate
                    + ", itemCount=" + getItemCount() + ", totalPrice=" + getTotalPrice() + "]";
        }
    }

    public static class Electronics extends Item {
        private String warrantyPeriod;

        public Electronics(String name, double price, String warrantyPeriod) {
            setName(name);
            setPrice(price);
            this.warrantyPeriod = warrantyPeriod;
        }

        public String getWarrantyPeriod() {
            return warrantyPeriod;
        }

        @Override
        public String toString() {
            return "Electronics [name=" + getName() + ", price=" + getPrice() + ", warrantyPeriod=" + warrantyPeriod
                    + ", itemCount=" + getItemCount() + ", totalPrice=" + getTotalPrice() + "]";
        }
    }

    public ShoppingCart() {
        items = new ArrayList<Item>();
        totalPrice = 0.0;
        itemCount = 0;
    }

    public void renewItem() {
        totalPrice = 0.0;
        itemCount = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
            itemCount += item.getItemCount();
        }
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (item.getName() == null || item.getPrice() <= 0 || item.getItemCount() <= 0) {
            throw new IllegalArgumentException("Invalid item: " + item);
        }
        items.add(item);
        itemCount++;
        totalPrice += item.getPrice() * item.getItemCount();
    }

    public void removeItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (item.getName() == null || item.getPrice() <= 0 || item.getItemCount() <= 0) {
            throw new IllegalArgumentException("Invalid item: " + item);
        }
        for (Item existingItem : items) {
            if (existingItem == item) {
                items.remove(existingItem);
                itemCount--;
                totalPrice -= existingItem.getTotalPrice();
                break;
            }
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping Cart:\n");
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total Price: ").append(totalPrice).append("\n");
        return sb.toString();
    }

    public void clear() {
        items.clear();
        totalPrice = 0.0;
        itemCount = 0;
    }
}
