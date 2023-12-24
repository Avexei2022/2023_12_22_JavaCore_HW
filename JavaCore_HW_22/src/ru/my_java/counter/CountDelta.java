package ru.my_java.counter;

import ru.my_java.printer.PrintResult;

import java.util.Arrays;

public class CountDelta {

    private final int[] array;
    public CountDelta(int[] array){
        this.array = array;
    }

    private int countDelta(){
        int max_value = Arrays.stream(array).max().getAsInt();
        int min_value = Arrays.stream(array).min().getAsInt();
        return max_value - min_value;
    }

    public void showResult(){
        PrintResult print_result = new PrintResult();
        String result = Integer.toString(countDelta());
        String message = "Разница между самым большим и самым маленьким элементами";
        print_result.printResult(result, message);
    }

}
