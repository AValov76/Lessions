//: strings/Groups.java

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Groups {
    private static void print() {
        System.out.println();
    }

    private static void print(Object o) {
        System.out.print(o);
    }

    private static final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(\\w+)")
                        .matcher(POEM);
        int i = 0;
        Set<String> a = new TreeSet<>();
        while (m.find()) {
            a.add(m.group());
            i++;

        }
        print(a);
        print();
        print(i);
        print();
        print(a.size());
    }
}
