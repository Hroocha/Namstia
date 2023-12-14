package P3;

public class Main {
    public static void main(String[] args) {
//        Создать матрицу со значениями boolean, посчитать сколько значений true в матрице
        boolean matrix [][] = {
                { true, true, false, false, true },
                { false, true, true, true, false },
                { true, false, false, true, false }
        };


        int count = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
                if (matrix[i][j]) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count);

//          Создать одномерный массив и заполнить его значениями от 0 до 499 с помощью for, посчитать сколько чисел массива > 3
        int array[] = new int[500];
        array[0] = 0;

        for (int i = 0; i < 500; i++ ) {
            array[i] = i;
            System.out.print(array[i] + "\t");
        }

        int countNumbersMoreThree = 0;
        for (int i = 0; i < 500; i++) {
            if (array[i] > 3) {
                countNumbersMoreThree++;
            }
        }
        System.out.println(countNumbersMoreThree);

//          матрица с boolean, вывести в транспанированном виде


//        boolean matrix [][] = {
//                { true, true, false, false, true },
//                { false, true, true, true, false },
//                { true, false, false, true, false }
//        };
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }

    }
}
