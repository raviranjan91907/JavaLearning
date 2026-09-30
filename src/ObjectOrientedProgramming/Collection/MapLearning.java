package ObjectOrientedProgramming.Collection;

import java.util.HashMap;
import java.util.Map;

/*
    In Java, Map is an interface in the Collection Framework that stores data in the form of key-value pairs

    For example:
    Key       Value
    ----------------
    101       Ravi
    102       Amit
    103       Rahul

    Note:Key must be unique in the Map duplicate key are not allowed but different keys can have the same value.

    Different types of Map
The most important Map implementations are:
                  Map
                   |
        -------------------------
        |           |           |
     HashMap    LinkedHashMap  TreeMap

HashMap:HashMap stores data in key-value pairs and does not guarantee any iteration order.

LinkedHashMap:LinkedHashMap is similar to HashMap, but it maintains insertion order by default.

TreeMap:reeMap stores key-value pairs and keeps the keys sorted according to their natural              ordering or a supplied Comparator.

Methods of Map
    put(key, value)
    get(key)
    getOrDefault(key, defaultValue)

    remove(key)
    remove(key, value)

    containsKey(key)
    containsValue(value)

    size()
    isEmpty()
    clear()

    keySet()
    values()
    entrySet()

    putAll(map)
    putIfAbsent(key, value)

    replace(key, value)
    replace(key, oldValue, newValue)

    replaceAll(function)

    compute(key, function)
    computeIfAbsent(key, function)
    computeIfPresent(key, function)

    merge(key, value, function)

    forEach(action)

    equals(object)
    hashCode()
 */
public class MapLearning {
    public static void main(String args[]){
        Map<String,Integer> m=new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",5);

        System.out.println(m.get("a"));
        System.out.println(m.containsKey("a"));
        System.out.println(m.remove("a"));
        System.out.println(m.keySet());
        System.out.println(m.values());

    }
}
