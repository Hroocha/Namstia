package p5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();

//        task2();
//        task3();
        task4();
    }

    private static void task4() {
//        Никита занимается страстной любовью с Настей,
//        чувственно входит 1 млн раз, с шансом 2% соскальзывает и 1% происходит травма пени$а,
//        каждый раз когда чувственно входит, Настя говорит uwu,
//        если соскальзывает, Настя не говорит uwu
//        если происходит травма, чувственное занятие завершается
//        нужно сделать симуляцию занятий любовью используя brake и continue и посчтать сколько раз Настя сказала uwu
        int size = 100;

        int moan = 0;
        for (int i = 0; i < size; i++) {
            double random = Math.random();
            random *= 100;
            int chance = (int) random;
           System.out.print("\n" + chance + " ");

            if (chance == 3) {
                System.out.print("Вы сломали пинску :(");
                break;
            }
            else if(chance != 2 && chance != 1) {
                moan++;
            }
            else {
                System.out.print("не попал");
            }

        }
        System.out.println("\n" + moan);






    }

    private static void task3() {
//  то же задание что и в task2, но через while
        int count = 0;
        int number = 1;
        while(number != 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("введите число");
            number = in.nextInt();
            count += number;
        }
        System.out.println("Сумма чисел равна " + count);

    }

    private static void task2() {
//  в консоль бесконечно вводят числа,
//  если вводят ноль нужно вывести результат, результатом будет сумма всех введенных до нуля чисел


        int count = 0;
        int number;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("введите число");
            number = in.nextInt();
            count += number;
        } while (number != 0);

        System.out.println("Сумма чисел равна " + count);


    }

    private static void task1() {
        //        создать массив из 100 чисел, заполнить его числами от 100 до 0
//        и приэтом каждое 10-е число нужно делить на 2
//        и потом найти минимальное, среднеарефмитическое всех элементов и максимальное значения

        int size = 101;
        int array [] = new int [size];
//      Создаю массив от 0 до 100
//      Меняю в массиве значения с 0 до 100 на от 100 до нуля
//      И делю каждое 10-е значение на 2
        for(int i = 0; i <= 100; i++) {
            array[i] = 100 - i;
            if(i%10 == 0) {
                array[i] = (100 - i)/2;
            }
            System.out.print(array[i] + " ");
        }
//      Ищу минимальное значение
        int min = array[0];
        for (int i = 0; i <= 100; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
//      Ищу максимальное значение
        int max = array[0];
        for (int i = 0; i <= 100; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
//      Ищу среднеарифметическое значение
        float average = 0;
        for (int i = 0; i <= 100; i++) {
            average += array[i];
        }
        average /= size ;

        System.out.println();
        System.out.println("минимальное значение = " + min);
        System.out.println("максимальное значение = " + max);
        System.out.println("среднее значение = " + average);}
}

