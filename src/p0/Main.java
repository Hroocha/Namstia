package p0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
       //то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.
       //Пример ввода: Amigo 18 Пример вывода: Amigo, явитесь в военкомат


        Scanner n = new Scanner(System.in);
        String nikita = "Никита";
        String name = n.nextLine();
        int age = n.nextInt();
        if (name.equals(nikita)) {
            System.out.println(name + " не должен появляться в военкомате");
        }
        else if (age <= 28 && age >= 18) {
            System.out.println(name + ", явитесь в военкомат");
        };

    }

}