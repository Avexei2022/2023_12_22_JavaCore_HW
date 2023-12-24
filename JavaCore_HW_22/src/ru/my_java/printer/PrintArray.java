package ru.my_java.printer;

public class PrintArray {

    public PrintArray(){

    }

    public void printArray(String array_int){
        StringBuilder sb = new StringBuilder();
        sb.append("\nИсходный массив чисел:\n");
        sb.append(array_int);
        sb.append("\n");
        System.out.println(sb);
    }
}
