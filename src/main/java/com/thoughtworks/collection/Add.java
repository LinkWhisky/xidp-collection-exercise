package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
