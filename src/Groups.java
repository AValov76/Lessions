//: strings/Groups.java
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.*;


public class Groups {
    static void print(){System.out.println();}
    static void print(Object o){
        System.out.print(o);
    }
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the the the the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(\\w+)")
                        .matcher(POEM);
        int i=0;
        HashSet a = new HashSet();
        while(m.find()) {
                a.add(m.group());
                i++;

        }
        print(a);
        print();
        print(i);
    }
}
