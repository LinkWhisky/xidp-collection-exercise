package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);
    private Map<Integer, String> createIntegerStringMap() {
        Map<Integer,String> letterMap = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            letterMap.put(i+1,letters[i]);
        }
        return letterMap;
    }

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        for (int i = 0; i < array.size(); i++) {
            array.set(i,array.get(i)*3);
        }
        return array;
    }

    public List<String> mapLetter() {
        Map<Integer, String> letterMap = createIntegerStringMap();
        List<String> resultList = new ArrayList<>();
        for (Integer number : array) {
            resultList.add(letterMap.get(number));
        }
        return resultList;
    }


    public List<String> mapLetters() {
        Map<Integer, String> letterMap = createIntegerStringMap();
        List<String> resultList = new ArrayList<>();
        for (Integer number : array) {
            if (number > 26) {
                resultList.add(letterMap.get(number/26)+letterMap.get(number%26));
            }else {
                resultList.add(letterMap.get(number));
            }

        }
        return resultList;

    }

    public List<Integer> sortFromBig() {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i) < array.get(j)) {
                    int switchTemp = array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,switchTemp);
                }
            }
        }
        return array;
    }

    public List<Integer> sortFromSmall() {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i) > array.get(j)) {
                    int switchTemp = array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,switchTemp);
                }
            }
        }
        return array;
    }
}
