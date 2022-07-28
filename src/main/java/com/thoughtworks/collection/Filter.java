package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) { this.array = array; }

    public List<Integer> filterEven() {
        List <Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2 == 0) {
                resultList.add(array.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        List <Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%3 ==0) {
                resultList.add(array.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();
        for (int numberInFirstList : firstList) {
            for (int  numberInSecondList: secondList) {
                if (numberInFirstList ==  numberInSecondList) {
                    resultList.add(numberInFirstList);
                }
            }
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> resultList = new ArrayList<>();
        for (Integer number : array) {
            boolean duplicated = false;
            for (Integer deduplicatedNumber : resultList) {
                if (number == deduplicatedNumber) {
                    duplicated = true;
                }
            }
            if (duplicated == false) {
                resultList.add(number);
            }
        }
        return resultList;
    }
}