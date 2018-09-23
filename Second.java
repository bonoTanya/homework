package homework.git;

import com.sun.javafx.collections.MappingChange;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Second{
    public static void main(String[] args) {
        final Map<String, String> tel = new HashMap<String, String>();
        tel.put("Андрей", "89120562476");
        tel.put("Андрей", "82758420847");

        System.out.print(tel.get("Андрей"));
    }
}
