package ru.my_java;

import ru.my_java.array_creator.GetArray;
import ru.my_java.counter.CountDelta;
import ru.my_java.counter.CountEvens;
import ru.my_java.counter.ZeroSearcher;
import ru.my_java.printer.PrintArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GetArray array_int = new GetArray();
        PrintArray print_array = new PrintArray();

        int array_len = 32;
        int array_max = 8;
        int[] array = array_int.getArray(array_len, array_max);

        print_array.printArray(Arrays.toString(array));

        CountEvens count_evens = new CountEvens(array);
        count_evens.showResult();

        CountDelta count_delta = new CountDelta(array);
        count_delta.showResult();

        ZeroSearcher zero_searcher = new ZeroSearcher(array);
        zero_searcher.showResult();

    }

}

