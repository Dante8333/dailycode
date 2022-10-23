package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static grocerylist grocerylist = new grocerylist();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                case 1:
                    grocerylist.printgrocerylist();
                    break;
                case 2:
                    additem();
                    break;
                case 3:
                    modifyitem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforitem();
                    break;
                case 6:
                    quit =true;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0- to print options.");
        System.out.println("\t 1- to print the list of grocery items");
        System.out.println("\t 2- to add an item to te list.");
        System.out.println("\t 3- to modify the item in the list.");
        System.out.println("\t 4- to remove an item from the list.");
        System.out.println("\t 5- to search for an item in the list");
        System.out.println("\t 6 = to quit the application.");

    }
    public static void additem(){
        System.out.print("enter the grocery item ");
        grocerylist.addGroceryitem(scanner.nextLine());
    }
    public  static void modifyitem(){
        System.out.print("enter current item name: ");
        String  itemname = scanner.nextLine();
        System.out.print("Enter replaced item to list: ");
        String newItem = scanner.nextLine();
        grocerylist.mofifygroceryItem(itemname,newItem);
    }
    public static void removeItem(){
        System.out.print("enter item name: ");
        String itemname = scanner.nextLine();
        grocerylist.removegroceryitem(itemname);
    }
    public static void searchforitem(){
        System.out.print("enter item to search for: ");
        String searchitem = scanner.nextLine();
        if(grocerylist.onlist(searchitem)){
            System.out.println("found " + searchitem + " in our grocerylist");
        }else{
                System.out.println("no item");
            }
        }
    }

