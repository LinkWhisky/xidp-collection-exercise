package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int maxNumber = Integer.MIN_VALUE;
        for (Integer integer : arrayList) {
            if (integer > maxNumber) {
                maxNumber = integer;
            }
        }
        return maxNumber;
    }

    public double getMinimum() {
        int minNumber = Integer.MAX_VALUE;
        for (Integer integer : arrayList) {
            if (integer < minNumber) {
                minNumber = integer;
            }
        }
        return minNumber;
    }

    public double getAverage() {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return (double) sum/arrayList.size();
    }

    public double getMedian() {
        if (arrayList.size()%2 == 1) {
            return arrayList.get(arrayList.size()/2);
        }
        return ((double) arrayList.get(arrayList.size()/2) + arrayList.get(arrayList.size()/2-1))/2;
    }

    public double getOrderedMedian() {
        if (arrayList.size()%2 == 1) {
            return arrayList.get(arrayList.size()/2);
        }
        return ((double) arrayList.get(arrayList.size()/2) + arrayList.get(arrayList.size()/2-1))/2;
    }

    public int getFirstEven() {
        for (Integer integer : arrayList) {
            if (integer%2 == 0) {
                return integer;
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                return  i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(arrayList.size() != this.arrayList.size()){
            return false;
        }
        boolean equal = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != this.arrayList.get(i)){
                equal = false;
            }
        }
        return equal;
    }



    public int getLastOdd() {
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if (arrayList.get(i)%2 == 1) {
                return arrayList.get(i);
            }
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if (arrayList.get(i)%2 == 1) {
                return i;
            }
        }
        return -1;

    }
}
