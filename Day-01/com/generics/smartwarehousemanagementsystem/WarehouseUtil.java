package com.generics.smartwarehousemanagementsystem;
import java.util.List;
class WarehouseUtil {
    public  static  void displayItems(List<? extends  WarehouseItem>items){
        for(WarehouseItem item:items){
            System.out.println(item);
        }
    }
}
