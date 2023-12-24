package ru.my_java.printer;

public class PrintResult {

    public PrintResult(){

    }

    public void printResult(String result, String message){
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append(" -> ");
        sb.append(result);
        sb.append("\n");
        System.out.println(sb);

    }
}
