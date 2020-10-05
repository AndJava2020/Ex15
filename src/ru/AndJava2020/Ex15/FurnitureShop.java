package ru.AndJava2020.Ex15;

import java.util.ArrayList;

public class FurnitureShop {
    private int pointer=0;
    private ArrayList<Furniture> warehouse;
    private int val;

    public FurnitureShop() {
        this.warehouse = new ArrayList<>();
        val=0;
    }

    public void sell(Furniture a){
        if (warehouse.contains(a)){
            System.out.println("selling " + a);
            warehouse.remove(a);
            System.out.println("success");
        }
        else{
            System.out.println("all sold");
        }

    }

    public void addWarehouse(Furniture...a){
        for (Furniture obj:a
        ) {
            warehouse.add(obj);
            val++;
        }
    }

    void showAssortment(){
        System.out.println("in storage");
        for(int i=0; i<warehouse.size(); i++)
            System.out.println(warehouse.get(i));
    }
    public Furniture getFurn(Furniture a){
        for (int i = 0; i < pointer ; i++) {
            if(warehouse.contains(a)) return warehouse.get(i);
        }
        return null;
    }
    public Furniture getFurn(int index){
        if(warehouse.get(index)!=null)
            return warehouse.get(index);
        return null;

    }
}
