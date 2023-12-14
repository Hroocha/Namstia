package p8;

public class Main {

/*
  класс BOХ является контейнером, он может содержать в себе др. фигуры
  у него есть метод add который принимает на вход фигуры, нужно добавлять новые фигуры пока для них хватает места в БОХ
  размер это площадь (вместимость) если места в БОХ для фигуры не хватает метод возвращает false

как сделать:
Box будет иметь длину высоту и ширину и вычисляемую из этого площадь Volume (вместимость)
в него будут класть фигуры, фигуры будут тоже иметь длину, высоту и ширину и тоже будут вычислять Volume, но каждый по своему (полиморфизм?)
мне нужно придумать фигуры н-р треугольник, квадрат, круг???, а если это звезда???
придумать их через наследование от класса фигуры, у класса фигуры будет объем и это общее у всех фигур,

как сувать фигуры в коробку?
взять фигуру (передать ее методу)
от объема коробки отнять заполненный объем (нужна переменная которая будет держать заполненный объем)
сравнить меньше ли объем фигуры чем оставшееся свободное место, если да то положить ее внутрь (увеличить переменную на объем фигуры)
если нет вернуть false

пока для меня супер неочевидная вещь до которой нужно додумываться с силой:
создать фигуры с параметрами
создать переменную суперкласса
присвоить переменной суперкласса ссылку на объект подкласса (созданную фигуру)
вызвать метод который переопределен (полиморфизм)
по идее должен срабатывать нужный метод
 */


    public static void main(String[] args) {

        Pyramid p = new Pyramid(4,6);
        Circle c = new Circle(2);
        Square s = new Square(3);

        Box box = new Box();
        box.add(s);
        box.add(s);
        box.add(s);
        boolean a = box.add(s);
        System.out.println(a);

    }
}