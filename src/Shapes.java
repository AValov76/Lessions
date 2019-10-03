// Глава про RunTime type information
// классы создаются при первом обращении к их статическому методу --> классы подгружаются не все сразу а по мере их необходимости
// все классы герузятся в ява машину с помощью подсистемы загрузки классов как класс Class

import java.util.Arrays;
import java.util.List;

interface Test {
}

abstract class Shape {
    static {
        System.out.println("Loading Shape class");
    }

    Shape() {
        System.out.println("Идет выполнение статического метода Shape.Shape() при создании объекта класса " + this.toString());
    }

    //abstract public String toString();

    public void draw() {
        System.out.println(toString() + ".draw() in " + this.getClass().toString());
    }
}

class Triangle extends Shape implements Test {
    static {
        System.out.println("Loading Triangle class");
    }

    public String toString() {

        return "Triangle";
    }
}

class Circle extends Shape {
    static {
        System.out.println("Loading Circle class");
    }

    public String toString() {
        return "Circle";
    }
}

public class Shapes {
    static {
        System.out.println("Loading Shapes class");
    }

    public static void main(String... arg) {
        try {
            Class.forName("Triangle");

        } catch (Exception e) {
            System.out.println("Класса Triangle не существует!");
        }
        String string = "Trianggggggggggggggle";
        try {
            Class.forName(string);

        } catch (Exception e) {
            System.out.println("Класса " + string + " не существует!");
        }
        //--------------------------------------------------
        List<Shape> shapesList = Arrays.asList(new Circle(), new Triangle());
        for (Shape s : shapesList
        ) {
            s.draw();
        }

        //--------------------------------------------------
        Test test = new Triangle();
        Class c = test.getClass();
        for (Class cc :
                c.getInterfaces()) {
            System.out.println(cc.toString());
        }
    }
}