package lesson_6.ITC_1;

import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Иван1");
        map.put("Сидоров", "Петр2");
        map.put("Васильев", "Петр1");
        map.put("Смирнов", "Петр");

        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        for (String values1 : map.values()) {
            int count = 0;
            for (String values : map.values()) {
                if (values.equals(values1)) {
                    count++;
                    if (count > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
