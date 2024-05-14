package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures=new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float totalOrderCost= 0.0f;
        for(Map.Entry<Furniture, Integer> entry:this.ordersOfFurnitures.entrySet()){
            totalOrderCost+=entry.getKey().cost()*entry.getValue();
        }
        return totalOrderCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        int count = 0;
        for(Map.Entry<Furniture, Integer> entry:this.ordersOfFurnitures.entrySet()){
            if(type.equals(entry.getKey())){
                count+=entry.getValue();
            }
        }
        return count;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        int typeCost = 0;
        for(Map.Entry<Furniture, Integer> entry:this.ordersOfFurnitures.entrySet()){
            if(type.equals(entry.getKey())){
                typeCost+=entry.getValue()*type.cost();
            }
        }
        return typeCost;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int totalOrderQuantity = 0;
        for(Map.Entry<Furniture, Integer> entry:this.ordersOfFurnitures.entrySet()){
                totalOrderQuantity+=entry.getValue();          
        }
        return totalOrderQuantity;
    }
}