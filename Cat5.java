package example;

import java.util.HashMap;
import java.util.Map;

public class Cat5 {
    public static void main(String[] args)
            throws Exception {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "１匹目の猫");
        map.put(2, "２匹目の猫");
        map.put(3, "３匹目の猫");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
    }
}
