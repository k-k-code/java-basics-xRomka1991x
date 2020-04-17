package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

public class Main {

    /*
    Условия:
    oneDimensionArray - массив содержащий не меньше 3 и не больше 99 элементов типа int.
    Среди них всегда есть хотя бы одно положительное, хотя бы одно отрицательное и хотя бы один 0.

    Подсказки:

    Для выполнения задания вспомните максимальные и минимальные значения целочисленных типов.

    Длина массива хранится в поле length. Например, длину массива myArray можно получить так: int myArrayLength = myArray.length

    Для выходя из метода используется ключевое слово return. Если после него стоит значение (или переменная), то это значение будет возвращено как результат работы метода.

    Метод main расположен последним в классе (находится в самом низу)

     */

    private static int[] oneDimensionArray = Generator.getOneDimensionArray();

    private static void level1() {
        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод, вычисляющий значение переменной должен возвращать тот же тип.
        */
        /*тип*/ int minValue = findMinValue(oneDimensionArray);
        /*тип*/ int maxValue = findMaxValue(oneDimensionArray);
        /*тип*/ int sumOfValues = sumValues(oneDimensionArray);
        /*тип*/
        int firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        /*тип*/ int firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);
    }

    private static void level2() {

        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод должен возвращать значение тогот же типа.
        */
        /*тип*/ long[] lastPositiveIndex = getLastPositiveIndex(oneDimensionArray);
        /*тип*/ long[] lastNegativeIndex = getLastNegativeIndex(oneDimensionArray);
        byte[] positiveNegativeNumber = countPositiveNegative(oneDimensionArray);

        System.out.println("last positive index: " + lastPositiveIndex);
        System.out.println("last negative index: " + lastNegativeIndex);
        System.out.println("total positives: " + positiveNegativeNumber[0]);
        System.out.println("total negatives: " + positiveNegativeNumber[1]);
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ int findMinValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/
        int minValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните минимальное в переменную minValue.
         */
        for ( int value : arrayOfValues){
            if(minValue > value){
                minValue = value;
            }
        }



        return minValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/int findMaxValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/
        int maxValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните максимальное в переменную maxValue.
         */
       for(int value : arrayOfValues){
           if(maxValue < value){
               maxValue = value;
           }
       }
        return maxValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ int sumValues(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ int sum = 0;
        /* Используя цикл for переберите все значения массива, просуммируйте и сохраните сумму
         всех значений в переменную sum. */
        for (int value : arrayOfValues){
            sum = sum + value;

        }
        return sum;
    }


    private static int getFirstPositiveIndex(int[] arrayOfValues) {

        int firstPositiveIndex = 0;


        while (firstPositiveIndex < arrayOfValues.length) {
            if (arrayOfValues[firstPositiveIndex] > 0){
                break;
            }
            firstPositiveIndex++;
        }
        return firstPositiveIndex;
    }


    private static /*тип*/int getFirstNegativeIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/
        int firstNegativeIndex = 0;
        /* Используя цикл while найдите первое отрицательное значение и сохраните в переменную firstNegativeIndex */
        while (firstNegativeIndex < arrayOfValues.length){
            if (arrayOfValues[firstNegativeIndex] < 0) {
            break;
            }
            firstNegativeIndex++;
        }
        return firstNegativeIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/long[] getLastPositiveIndex(int[] arrayOfValues) {
        /*
        Найдите последнее положительное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         */

        return new long[0];
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/long[] getLastNegativeIndex(int[] arrayOfValues) {
        /*
        Найдите последнее отрицательное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         */
        return new long[0];
    }

    private static byte[] countPositiveNegative(int[] arrayOfValues) {
        byte[] result = new byte[2];


        /*
        Посчитайте количество положительных и отрицательных значений в массиве arrayOfValues.
        Результат сохраните в массив result:
            В первый элемент - количество положительных
            Во второй элемент - количество отрицательных
             */



        byte sumPositive = 0;
        byte sumNegative = 0;
        for (int value : arrayOfValues){
            if(value > 0){
                sumPositive = sumPositive ++;
            }
            else if(value < 0){
                sumNegative = sumNegative ++;
            }
            result[0] = sumPositive;
            result[1] = sumNegative;
        }



        return result;
    }

    public static void main(String[] args) {
        level1();
        level2();
    }

}
