package ru.vorh;

import ru.vorh.dao.RandomDao;
import ru.vorh.model.RandomNumber;

/**
 * Created by vorh on 4/9/17.
 */
public class Main {

    public static void main(String[] args) {

        Generator generator = new Generator();
        RandomDao randomDao = new RandomDao();

        randomDao.clearStore();
        long startTime = System.currentTimeMillis();
        int i = 100000000;
//        long i = 100000000000L;
//        int i = 10;
        int start = 1000000;
        int end = 9000000;
        while (i != 0){
            int key = generator.get(start, end);
            RandomNumber numberByKey = randomDao.getNumberByKey(key);
            numberByKey.increment();
            randomDao.insert(numberByKey);
            i--;
        }


        int max = 0;
        int min = 0;

        int countMax= 0;
        int  countMin = 0;


        int countValue = 0;
        int countKey = 0;



        System.out.println("MIN " + min + " COUNT " + countMin);
        System.out.println("MAX " + max + " COUNT " + countMax);

        System.out.println("KEY " + countKey + " " + countValue);


        long endTime = System.currentTimeMillis();


        long time = (endTime - startTime)/ 1000;

        System.out.println("TIME " + time);

    }


}
