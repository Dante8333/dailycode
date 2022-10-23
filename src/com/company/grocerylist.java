package com.company;

import java.util.ArrayList;

public class grocerylist {

    private ArrayList<String> grocerylist = new ArrayList<String>();

    public void addGroceryitem(String item){
        grocerylist.add(item);
    }
    public void printgrocerylist(){
        System.out.println("you have "+grocerylist.size()+" items in your grocery list");
        for(int i = 0; i<grocerylist.size(); i++){
            System.out.println((i+1)+". "+grocerylist.get(i));
        }
    }
    public void mofifygroceryItem(String currentItem,String newItem){
        int position = findItem(currentItem);
        if(position>= 0){
            modifygroceryitem(position,newItem );
        }
    }
    private void modifygroceryitem(int position,String newitem){
        grocerylist.set(position,newitem);
        System.out.println("grocery item "+(position+1)+" has been modified");

    }public void removegroceryitem(String item){
        int position = findItem(item);
        if(position>= 0){
            removegroceryitem(position);
    }
    }
    private void removegroceryitem(int position){
         grocerylist.remove(position);

    }
    private int findItem(String searchItem){
        return grocerylist.indexOf(searchItem);

    }
    public boolean onlist(String searchitem){
        int position = findItem(searchitem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
