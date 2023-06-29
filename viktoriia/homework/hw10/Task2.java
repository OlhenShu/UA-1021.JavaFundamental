package hw10;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static boolean hasSameName(Map<String, String> map) {
        boolean result = false;
        for (Map.Entry<String, String> el: map.entrySet()) {
            for (Map.Entry<String, String> el2: map.entrySet()) {
                if (el.getValue().equals(el2.getValue()) && !el.getKey().equals(el2.getKey())) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public static Map removeName(Map <String, String> map, String name) {
        Map<String, String> result = new HashMap<>();
        result.putAll(map);
        for (Map.Entry<?, String> el: map.entrySet()) {
            if (el.getValue().equals(name)) {
                result.remove(el.getKey());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Map<String, String> personeMap = new HashMap<>();
        personeMap.put("Smith", "John");
        personeMap.put("Scott", "Ted");
        personeMap.put("Brown", "Tisha");
        personeMap.put("Miller", "Elisabeth");
        personeMap.put("Davis", "John");
        personeMap.put("Williams", "Sam");
        personeMap.put("Taylor", "Hannah");
        personeMap.put("Jackson", "Trevor");
        personeMap.put("Harris", "Mary");
        personeMap.put("Lewis", "Kelly");
        for (Map.Entry<String, String> person: personeMap.entrySet()) {
            System.out.println("Name: " + person.getValue() + ", last name: " + person.getKey());
        }
        System.out.print("Has map the same name? ");
        System.out.println(Task2.hasSameName(personeMap));
        String nameToRemove = "Mary";
        Map<String, String> withoutSomeName = Task2.removeName(personeMap, nameToRemove);
        System.out.println("Map without person with name " + nameToRemove);
        for (Map.Entry<String, String> person: withoutSomeName.entrySet()) {
            System.out.println("Name: " + person.getValue() + ", last name: " + person.getKey());
        }
    }
}
