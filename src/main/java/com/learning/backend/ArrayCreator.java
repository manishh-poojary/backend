package com.learning.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ArrayCreator implements Callable<List<Integer>> {

    private final int number;
    private final List<Integer> numberList;

    public ArrayCreator(int number) throws ExecutionException, InterruptedException {
        this.number = number;
        this.numberList = new ArrayList<>();
    }

    @Override
    public List<Integer> call() {
        for (int i = 1; i <= number; i++) {
            numberList.add(i);
        }
        return numberList;
    }


}
