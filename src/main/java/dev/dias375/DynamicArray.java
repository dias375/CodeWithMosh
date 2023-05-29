package dev.dias375;

public class DynamicArray {

    private int[] localArray;
    private int count;

    public DynamicArray() {
        localArray = new int[0];
        count = 0;
    }

    public DynamicArray(int size) {
        localArray = new int[size];
    }

    public void insert(int element){
        if(localArray.length == count){
            localArray = growArray(element);
        } else {
            localArray[count] = element;
        }
        count++;
    }

    public void removeAt(int indexRemoved){
        if(indexRemoved >= count || indexRemoved < 0){
            throw new IllegalArgumentException();
        }
        localArray = reduceArray(indexRemoved);
        count--;
    }

    public int indexOf(int integerLooked){
        int index = 0;
        for(int element : localArray){
            if(element == integerLooked){
                return index;
            }
            index++;
        }
        return -1;
    }

    private int[] reduceArray(int indexRemoved){
        int[] tempArray = new int[localArray.length-1];
        int j = 0;
        for(int i = 0; i < tempArray.length+1 ; i++){
            if(i != indexRemoved){
                tempArray[j] = localArray[i];
                j++;
            }
        }
        return tempArray;
    }

    private int[] growArray(int a){
        int[] tempArray = new int[localArray.length+1];
        int index = 0;
        for(int b : localArray){
            tempArray[index] = b;
            index++;
        }
        tempArray[index] = a;
        return tempArray;
    }

    //separate this concern
    public void print(){
        for(int i = 0; i<count; i++){
            System.out.println(localArray[i]);
        }
    }
}
