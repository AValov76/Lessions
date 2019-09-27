//Exercise 10 p.376

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpressions {

    private static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String... args) {

        //строка для исследования регулрного выражения и сами регулярные выражения
        String[] test = new String[]{"Java Java now    has regular expressions", "^Java", "Java", "\\breg\\w+", ".+", "n.w\\s+h(a|i)s", "s", "s?", "s*", "s+", "s{1}", "s{1}.", "s{0,3}", ""};
        //if (test.length < 2) {
            print("In this case:" + "\"" + test.toString() + "\"" + "too small parameters");
            System.exit(0);
        //}
        print("Input string is: \"" + test[0] + "\"");
        for (String s : test
        ) {
            print("Regular expressions: \"" + s + "\"");
            Pattern pattern = Pattern.compile(s); // создаем объект с паттерном с шаблоном
            Matcher matcher = pattern.matcher(test[0]); //создаем engine that perfom the match operation и передаем в него строку для анализа
            while (matcher.find()) { //Attempts to find the next subsequence of the input sequence that matches the pattern.
                print("Match \"" + matcher.group() + "\" at positions " + matcher.start() + "-" + (matcher.end() - 1) + "");
            }
            print("__________________________________________________________");
        }

        String[] test2 = new String[]{"Arline ate eight apples and one orange while Anita hadn`t any", "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"};
        Pattern p = Pattern.compile(test2[1]);
        Matcher m = p.matcher(test2[0]);
        while (m.find()) { print(m.group());
        }
    }


}