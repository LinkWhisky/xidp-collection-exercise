package com.thoughtworks.collection;

import org.apache.commons.collections.collection.AbstractCollectionDecorator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder >= rightBorder){
            int switchNumber = leftBorder;
            leftBorder = rightBorder;
            rightBorder = switchNumber;
        }
        int sumOfEvens = 0;
        for(int number = leftBorder; number <= rightBorder; number++){
            if (number%2 == 0) {
                sumOfEvens += number;
            }
        }
        return sumOfEvens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(leftBorder >= rightBorder){
            int switchNumber = leftBorder;
            leftBorder = rightBorder;
            rightBorder = switchNumber;
        }
        int sumOfOdds = 0;
        for(int number = leftBorder; number <= rightBorder; number++){
            if (number%2 == 1) {
                sumOfOdds += number;
            }
        }
        return sumOfOdds;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sumTripleAndAddTwo = 0;
        for (Integer number : arrayList) {
            sumTripleAndAddTwo += number*3+2;
        }
        return sumTripleAndAddTwo;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer number : arrayList) {
            if(number%2 == 1) {
                resultList.add(number*3+2);
            }
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sumOfProcessedOdds = 0;
        for (Integer number : arrayList) {
            if (number%2 == 1) {
                sumOfProcessedOdds += number*3+5;
            }
        }
        return sumOfProcessedOdds;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer number : arrayList) {
            if (number%2 == 0) {
                evenList.add(number);
            }
        }
        return evenList.get(2);
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int evenSum = 0;
        int numberOfSum = 0;
        for (Integer integer : arrayList) {
            if (integer%2 == 0) {
                evenSum += integer;
                numberOfSum += 1;
            }
        }
        return evenSum/numberOfSum;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean existSpecialElement = false;
        for (Integer integer : arrayList) {
            if (integer%2 == 0 && integer.equals(specialElment)) {
                existSpecialElement = true;
            }
        }
        return existSpecialElement;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for(int index = 0; index < arrayList.size(); index++) {
            if(arrayList.get(index) %2 == 0) {
                resultList.add(arrayList.get(index));
            }
        }
        return resultList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        LinkedList<Integer> sortedList = new LinkedList<>();
        for (Integer integer : arrayList) {
            if (integer%2 == 0) {
                sortedList.addFirst(integer);
            }
            if (integer%2 == 1) {
                sortedList.addLast(integer);
            }
        }
        return sortedList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> processedList = new ArrayList<>();
         for (int index = 1; index<arrayList.size(); index++) {
                processedList.add((arrayList.get(index-1)+arrayList.get(index))*3);
         }
         return processedList;
    }
}
