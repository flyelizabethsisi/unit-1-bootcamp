import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructures {

    public static void main(String args[]) {


        Cat cat1 = new Cat("Alpha");
        Cat cat2 = new Cat("Beta");
        ArrayList<Cat> ABC = new ArrayList();
        ABC.add(cat1);
        ABC.add(cat2);
        for (Cat s : ABC) {
            System.out.println(s.getName());
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("enrique", 22);
        map.put("talha", 20);
        map.put("cliff", 22);
        map.put("elizabeth", 32);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "" + value);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        mostFrequentElement(list);
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("Adam", 26);
        map2.put("Brian", 27);
        map2.put("Chris", 24);
        carRentACar(map2);

    }

    public static void mostFrequentElement(ArrayList<Integer> list) {

        HashMap<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (!elements.containsKey(i)) {
                elements.put(i, 1);
            } else {
                elements.put(i, elements.get(i) + 1);
            }
        }

        Map.Entry<Integer, Integer> mostFrequentElement = null;

        for (Map.Entry<Integer, Integer> i : elements.entrySet()) {
            if (mostFrequentElement == null || i.getValue() > mostFrequentElement.getValue()) {

                mostFrequentElement = i;
            }
        }
        System.out.println(mostFrequentElement);
    }

    public static boolean carRentACar(HashMap<String, Integer> map) {
        for (String element : map.keySet()) {
            if (map.get(element) > 25) {
                return true;
            }
        }
        return false;


    }
}
//## Exercises++
//
//#### 5. wordsWithoutList
//
//    Given an array of strings and an integer,
// write a method that return a an ArrayList where
// all the strings of the given length are omitted.
//
//    ```
//wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
//wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
//wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}
//```
//
//#### 6. How many clumps?
//
//            Say that a "clump" in an ArrayList is
// a series of 2 or more adjacent elements of the same value.
// Write a method that returns the number of clumps in
// the given ArrayList.
//
//    ```
//countClumps({1, 2, 2, 3, 4, 4}) → 2
//countClumps({1, 1, 2, 1, 1}) → 2
//countClumps({1, 1, 1, 1, 1}) → 1
//```
//
//#### 7. Sorting sentences
//
//    Write a method that takes a String sentence,
// breaks it up into an ArrayList of Strings
// (one word per ArrayList element),
// and prints out the words in alphabetical order.



