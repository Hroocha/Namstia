package p6;

import java.util.Objects;

public class Phone {
    private String number;
    private String  model;
    private int weight;
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " " + number);
    }
    public String getNumber() {
        return number;
    }
    Phone(String number, String model, int weight){
        this(number,model);
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return weight == phone.weight && Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone(){
    }

    //10 создать метод sendMessage с аргументами переменной длинны. Данный метод принимает на вход номера
    //телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих сообщений.
    public void sendMessage(String...numbers){

        for (String x:numbers){
            System.out.println(x);
        }


//        for(int x:numbers) {
//            do {
//                Scanner in = new Scanner(System.in);
//                System.out.println("введите номер телефона");
//                x = in.nextInt();
//            } while (x=0);
//        }
//        System.out.println(numbers);


    }
}


