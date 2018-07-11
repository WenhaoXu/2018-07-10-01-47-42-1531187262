package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        return IntStream.rangeClosed(0, number).filter(x -> (x < number && x > 0 && x % 2 != 0)).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
