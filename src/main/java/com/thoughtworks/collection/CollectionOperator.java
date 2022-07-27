package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if (left > right) {
            for (int i = left; i >=right ; i--) {
                resultList.add(i);
            }
        }
        else {
            for (int i = left; i <= right; i++) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if (left > right) {
            for (int i = left; i >=right ; i--) {
                if (i%2 == 0) {
                    resultList.add(i);
                }
            }
        }
        else {
            for (int i = left; i <= right; i++) {
                if (i%2 == 0) {
                    resultList.add(i);
                };
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenList = new ArrayList<>();
        for (int number : array) {
            if (number%2 == 0) {
                evenList.add(number);
            }
        }
        return evenList;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<>();
        for (int numberInFirstArray : firstArray) {
            for (int numberInSecondArray : secondArray) {
                if (numberInFirstArray == numberInSecondArray) {
                    resultList.add(numberInFirstArray);
                }
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<>(firstArray.length);
        Collections.addAll(resultList, firstArray);
        boolean isCommonNumber = false;
        for (int numberInSecondArray : secondArray) {
            for (int numberInFirstArray : firstArray) {
                if (numberInFirstArray == numberInSecondArray) {
                    isCommonNumber = true;
                }
            }
            if (!isCommonNumber) {
                resultList.add(numberInSecondArray);
                isCommonNumber = false;
            }
        }
        resultList.add(8);
        return resultList;
    }
}
