package p6;

//1 Создайте класс Phone, который содержиит переменные number, model, weight
//2 создайте три экземпляра этого класса
//3 Выводите на консоль значения переменных
//4 Добавить в класс Phone методы: receiveCall, имеет один параметр - имя звонящего. Выводит на консоль
//сообщение "Звонит (name)". Метод getNumber - возвращает номер телефона. Вызвать эти методы для
//каждого из объектов.
//5 добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
//переменных класса - number, model, weight.
//6 Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
//number, model.
//7 Добавить конструктор без параметров
//8 Вызвать из конструктора с тремя параметрами конструктор с двумя
//9 Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
//телефона звонящего. Вызвать этот метод.
//10 создать метод sendMessage с аргументами переменной длинны. Данный метод принимает на вход номера
//телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих сообщений.


public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.receiveCall("Ann");
        phone1.getNumber();
        phone2.receiveCall("Ann");
        phone2.getNumber();
        phone3.receiveCall("Ann");
        phone3.getNumber();
        phone1.receiveCall("Ann","8-900-000-00-00");
        phone1.sendMessage("786565","975445");


        String strOb1 = "Первая строка";
        String strOb2 = "Первая строка";
        System.out.println(strOb1 == strOb2);
        System.out.println(strOb1.equals(strOb2));
        Phone phone4 = new Phone("123", "123", 123);
        Phone phone5 = new Phone("123", "123", 123);
        System.out.println(phone4 == phone5);
        System.out.println(phone4.equals(phone5));

    }





}

