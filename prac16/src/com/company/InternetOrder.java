package com.company;

import java.util.Arrays;

public class InternetOrder implements Order {
    private List myList = new List();
    private int position;
    private Item dish[]= new Item[100];
    private final int size=10;
    public InternetOrder(Item arr[]){
        myList.addArray(arr);
    }

    public void add(Item food){
        myList.add(food);
    }

    @Override
    public String toString() {
        return "InternetOrder{" +
                "myList=" + myList +
                ", position=" + position +
                ", dish=" + Arrays.toString(dish) +
                ", size=" + size +
                '}';
    }

    public boolean delete(String name) {
        int i=0;
        while(!name.equals(dish[i].getName()) && i<size ){
            i++;
        }
        if(i!=size-1) {
            dish[i] = null;
            return true;
        }
        return  false;
    }

    @Override
    public int deleteAllWithName(String name) {
        int num=0;
        for(int i=0;i< dish.length;i++){
            if(dish[i].getName().equals(name)){
                dish[i]=null;
                num++;
            }
        }
        return num;

    }

    @Override
    public int num() {
        int num=0;
        for (Item food : dish) {
            if (food != null) num++;
        }
        return num;

    }

    @Override
    public Item[] MasOrder() {
        return dish;
    }

    @Override
    public int allPrice() {
        int price=0;
        for(Item item:dish){
            price+=item.getPrice();
        }
        return price;

    }

    @Override
    public int numByName(String name) {
        int num=0;
        for(Item item: dish) {

            if (item!= null) {
                if (item.getName().equals(name)) num++;
            }
        }
        return num;

    }

    @Override
    public String[] nameInMas() {
        String[] name= new String[size];
        int position=0;

        for(Item item :dish) {
            if (item != null) {
                if (this.checkName(item.getName(),name) && item.getName()!=null) {
                    name[position] = item.getName();
                    position++;
                }
            }
        }
        return name;

    }

    @Override
    public Item[] masItemSort() {
        for (int i = 0; i < dish.length; i++) {
            Item min = dish[i];
            int min_i = i;
            for (int j = i+1; j < dish.length; j++) {
                if (dish[j] != null) {
                    if (dish[j].getPrice() < min.getPrice()) {
                        min = dish[j];
                        min_i = j;
                    }
                }
            }
            if (i != min_i) {
                Item tmp = dish[i];
                dish[i] = dish[min_i];
                dish[min_i] = tmp;
            }
        }
        return this.dish;
    }
    public boolean checkName(String name,String[] names){

        for(String item:names){
            if(item!=null)
                if(item.equals(name)) return  false;
        }
        return  true;
    }

    public int getAllItem(){

        return  myList.num();
    }

    public Item[] getArray(){
        return myList.getAllItem();
    }

    public int getAllPrice(){
        return  myList.getallprice();
    }

    public int getAllNumByEnterName(String name){
        return myList.getAllNumByEnterName(name) ;
    }

    public String[] getAllNameByEnter(){
        return  myList.getAllName();
    }

}

