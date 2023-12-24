package ru.my_java.counter;

import ru.my_java.printer.PrintResult;

import java.util.Arrays;

public class CountEvens {

    private final int[] array;
    public CountEvens(int[] array){
        this.array = array;

    }

    private int countEven(){
        return (int) Arrays.stream(array).filter(i -> i % 2 == 0).count();
    }

    public void showResult(){
        PrintResult print_result = new PrintResult();
        String result = Integer.toString(countEven());
        String message = "Количество четных элементов в массиве";
        print_result.printResult(result, message);
    }

}
