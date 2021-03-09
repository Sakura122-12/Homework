package Goncharova.Hw3;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

    static class MyRunnableClass implements Callable{
        float[] arr;

        MyRunnableClass(float[] arr) {
            this.arr = arr;
        }

        @Override
        public float [] call() {

            long a = System.currentTimeMillis();

            int i = 0;

            for (i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.out.println(System.currentTimeMillis() - a);

            return arr;
        }
    }

    static private ArrayList<float []> splitArray(float [] inputArray, int numberOfParts){
        ArrayList<float []> L = new ArrayList<>();
        int partSize = inputArray.length / numberOfParts;
        int part = 0;

        for(part = 0; part < (numberOfParts-1); part++) {

            float [] temp = new float[partSize];
            for(int c = 0; c < partSize; c++) {
                temp[c] = inputArray[c + partSize*part];
            }

            L.add(temp);

        }

        float [] temp = new  float [inputArray.length - (part * partSize)];

        for(int i = part*partSize, c = 0; i < inputArray.length; i++, c++) {
            temp[c] = inputArray[i];
        }

        L.add(temp);

        return L;
    }

    static private void createArray1(float [] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

    }

    static private void createArray2(float [] arr, int numberOfParts) {

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfParts);

        ArrayList<float []> L = splitArray(arr, numberOfParts);

        Future<float []> [] res = new Future[numberOfParts];

        for(int i = 0; i < L.size(); i++){
            MyRunnableClass thread = new MyRunnableClass(L.get(i));
            res[i] = executorService.submit(thread);
        }

        float [] resArr = new float[arr.length];
        int pos = 0;

        for(int i = 0; i < numberOfParts;i++) {

            float[] temp;

            try {
                temp = res[0].get();
            } catch (Exception e) {
                System.out.println(e);
                break;
            }

            System.arraycopy(temp, 0, resArr, pos, temp.length);
            pos += temp.length;
        }
    }

    public static void main(String[] args) {

        final int size = 10000000;
        final int half = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        createArray1(arr);
        createArray2(arr, 4);
    }


}
