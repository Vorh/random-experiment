package ru.vorh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Created by vorh on 4/9/17.
 */
public class Main {

    public static void main(String[] args) {

        Generator generator = new Generator();
        long startTime = System.currentTimeMillis();
//        int i = 100000000;
        long i = 100000000000L;
//        int i = 10;
        int start = 1000000;
        int end = 9000000;
        while (i != 0){
            int value = generator.get(start, end);
            generator.put(value);
            i--;
        }

        Map<Integer, Integer> data = generator.getData();

        System.out.println(data.size());
        int max = 0;
        int min = 0;

        int countMax= 0;
        int  countMin = 0;


        int countValue = 0;
        int countKey = 0;

        for (Map.Entry<Integer, Integer> integerIntegerEntry : data.entrySet()) {
            Integer key = integerIntegerEntry.getKey();
            if (key> max){
                max = key;
                countMax = integerIntegerEntry.getValue();
            }
            if (key < min ){
                min = key;
                countMin = integerIntegerEntry.getValue();
            }

            if (countValue <integerIntegerEntry.getValue()){
                countValue = integerIntegerEntry.getValue();
                countKey = integerIntegerEntry.getKey();
            }
        }

        System.out.println("MIN " + min + " COUNT " + countMin);
        System.out.println("MAX " + max + " COUNT " + countMax);

        System.out.println("KEY " + countKey + " " + countValue);

        try {
           FileWriter fileWriter = new FileWriter("generator.txt");
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            data.forEach((integer, integer2) -> {
                try {
                    bufferedWriter.write(integer+ " " + integer2);
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();


        long time = (endTime - startTime)/ 1000;

        System.out.println("TIME " + time);

    }


}
