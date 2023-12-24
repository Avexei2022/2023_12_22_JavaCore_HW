package ru.my_java.counter;

import ru.my_java.printer.PrintResult;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class ZeroSearcher {

    private final int[] array;
    public ZeroSearcher(int[] array){
        this.array = array;
    }

    private boolean isZero2Zero(){
        AtomicBoolean flag = new AtomicBoolean(false);
        Arrays.stream(array).reduce((a, b) ->
            {if (a + b == 0) flag.set(true); return b;});
        return flag.get();
    }

    public void showResult(){
        PrintResult print_result = new PrintResult();
        String s_array = Arrays.toString(array);
        String result = Boolean.toString(isZero2Zero());
        String message = "Наличие в массиве двух соседних элементов, с нулевым значением";
        print_result.printResult(result, message);
    }
}
