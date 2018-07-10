package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
      if(leftBorder<rightBorder){
    return       IntStream.rangeClosed(leftBorder,rightBorder).filter(x->x%2==0).sum();
      }
      else{
      return    IntStream.rangeClosed(rightBorder,leftBorder).filter(x->x%2==0).sum();
      }
//      return 1;
//        Arrays.stream(list).
//
// return  throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(leftBorder<rightBorder){
            return       IntStream.rangeClosed(leftBorder,rightBorder).filter(x->x%2!=0).sum();
        }
        else{
            return    IntStream.rangeClosed(rightBorder,leftBorder).filter(x->x%2!=0).sum();
        }
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

       return arrayList.stream().map(x->x*3+2).reduce(0,(count,x) ->count+x);
//        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
       return arrayList.stream().map(x->{if(x%2!=0){return x*3+2;}else{return x;}}).collect(Collectors.toList());
//        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        arrayList.la
//        throw new NotImplementedException();\
     return   arrayList.stream().filter(x->x%2!=0).map(x->x*3+5).reduce(0,(count ,x)->count+x);

    }

    public double getMedianOfEven(List<Integer> arrayList) {
       arrayList= arrayList.stream().filter(x->x%2==0).sorted().collect(Collectors.toList());
        Arrays.sort(arrayList.toArray());
        if(arrayList.size() %2!=0){
       return     arrayList.get((int)(arrayList.size()/2));}
       else{
            return  (arrayList.get((int)(arrayList.size()/2)-1)+arrayList.get((int)((arrayList.size()+1)/2)))/2;
        }
//        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
     return   arrayList.stream().filter(x->x%2==0).mapToDouble(x->x).average().getAsDouble();
//        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
      return  arrayList.stream().filter(x->x%2==0).anyMatch(x->x==specialElment);

    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return  arrayList.stream().filter(x->x%2==0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> list=arrayList.stream().filter(x->x%2==0).sorted().collect(Collectors.toList());
        List<Integer> list2=arrayList.stream().filter(x->x%2!=0).sorted().collect(Collectors.toList());
       for (int i=list2.size()-1;i>=0;i--){
           list.add(list2.get(i));
       };

     return   list;
//        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
     return    arrayList.stream().map(x-> {if(arrayList.indexOf(x)!=arrayList.size()-1){return (x+arrayList.get(arrayList.indexOf(x)+1))*3;}else{return x;}}).collect(Collectors.toList()).subList(0,arrayList.size()-1);

    }
}
