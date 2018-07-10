package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left<right){
       return      IntStream.rangeClosed(left,right).boxed().collect(Collectors.toList());
        }else{
            return IntStream.rangeClosed(right, left).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left<right){
            return      IntStream.rangeClosed(left,right).filter(x->x%2==0).boxed().collect(Collectors.toList());
        }else{
            return IntStream.rangeClosed(right, left).filter(x->x%2==0).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
//        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
            return Arrays.stream(array).filter(x->x%2==0).boxed().collect(Collectors.toList());


//        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
     return    Arrays.stream(array).skip(array.length-1).toArray()[0];
//        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
     return Arrays.stream(firstArray).filter(x-> Arrays.stream(secondArray).anyMatch(y->x==y)).boxed().collect(Collectors.toList()) ;
//        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
 return       Arrays.stream(firstArray).filter(x-> Arrays.stream(secondArray).anyMatch(y->x==y)).collect(Collectors.toList());
    }
}
