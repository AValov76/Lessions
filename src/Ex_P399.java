/*
Exercise 8: (5) Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.
Exercise 9: (5) Modify the previous exercise so that it uses Class.getDeclaredFields( ) to also display information about the fields in a class.
*/

import java.lang.reflect.Field;

// --------------------------
interface Zero {
}

class First {
    private static int q;
    static void f(){}
}

class Second extends First implements Zero {
    static private Object p;
    class Sec2 {
    }
    Double d;
    void fff(){}
    interface Int2 {
    }
}
//---------------------------


public class Ex_P399 {

    public static void println(Object o) {
        System.out.println(o);
    }
    public static void print(Object o) {
        System.out.print(o);
    }
    public static void printfields(Class p){
        println("   Поля класса: ");
        Field[] fields = p.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            print(fields[i]+",");
        }
        System.out.println();
    }

    public static void main(String... arg) {

        // создаем объект класса Second
        Second second = new Second();
        // Получаем класс который делает класс Second
        Class c = second.getClass();
        System.out.println("Класс для исследования: " + c.toString().substring(6));
        Class p = c.getSuperclass();

        printfields(p);
        int i=1;

        Class p0 = c;
        while (p != null) {
            println("("+i+")"+"Родитель класса "+p0.toString().substring(6)+": " + p.toString().substring(6));
            Field[] fields = p.getDeclaredFields();
            printfields(p);
            p0=p;
            p = p.getSuperclass();
            i++;
        }

    }

}
