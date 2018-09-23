import org.jetbrains.annotations.NotNull;

import java.util.*;

public class First {

    //номер один
    public static void main(String[] args) {
        String[] array = {"faf", "ds", "erg", "faf", " wrtg", "sv", "ds", "erg", "faf", "wert"};
        test(array);
        quantity(array);
    }

    public static void test(@NotNull String[] array) {
        final Collection<String> words = new LinkedHashSet<String>();
        for (int i = 0; i< array.length; i++){
            words.add(array[i]);
        }
        System.out.print(words);
    }

    public static void quantity(@org.jetbrains.annotations.NotNull String[] array){
        for(int i = 0; i < array.length; i++) {
            int c = 0;
            for(int a = 0; a < array.length; a++){
                if(array[a] == array [i]){
                    c++;
                }
            }
            System.out.println("Элемент" + " " + array[i] + " присутствует в кол-ве: " + c);
        }
    }

}
