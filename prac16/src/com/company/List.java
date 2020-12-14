package com.company;

public class List {
    private Item food[] = new Item[100];
    private int next;
    private int last;
    public int getNext() {
        return next;
    }
    public List(){
        next=0;
        last=-1;
    }
    public void add(Item item){
        food[next]=item;
        next++;
        last++;
    }
    public Item[] toArray(){
        return food;
    }
    public void addArray(Item arr[]){
        for(int i=0;i< arr.length;i++){
            food[next]=arr[i];
            next++;
            last++;
        }
    }
    public int num(){
        int i=0;
        while (food[i]!=null){
            i++;

        }
        return i;
    }

    public Item[] getAllItem(){
        return food;
    }

    public int getallprice(){
        int price=0;
        for(int i=0;i< food.length;i++ ){
            if (food[i]!=null)
                price+=food[i].getPrice();
        }
        return price;
    }

    public int getAllNumByEnterName(String name_){
        int num=0;
        for(int i=0;i<food.length;i++){
            if(food[i]!=null) {
                if (food[i].getName().equals(name_)) num++;
            }
        }
        return  num;
    }
    public String[] getAllName(){
        String[] name=new String[food.length];
        int position=0;
        for(int i=0;i<food.length;i++){
            if(food[i]!=null){
            name[i]=food[i].getName();
            }
        }
        return name;
    }


}

