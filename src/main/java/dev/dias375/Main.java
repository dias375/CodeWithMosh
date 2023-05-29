package dev.dias375;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        dynamicArray.print();
        System.out.println("");
        dynamicArray.removeAt(0);
        dynamicArray.print();
        System.out.println("");
        System.out.println(dynamicArray.indexOf(40));
    }

}