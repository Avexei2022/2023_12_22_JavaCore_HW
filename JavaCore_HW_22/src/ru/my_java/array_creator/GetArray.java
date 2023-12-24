package ru.my_java.array_creator;

import java.util.Random;


public class GetArray {
    public GetArray (){

    }
    public int[] getArray(int array_len, int array_max){
        int[] array = new int[array_len];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, array_max + 1);
        }
        return array;
    }
}
