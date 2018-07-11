package com.thoughtworks.collection;

import java.text.DecimalFormat;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
     return   arrayList.stream().max((o1, o2) -> o1.compareTo(o2)).get();
//        throw new NotImplementedException();
    }

    public double getMinimum() {
        return   arrayList.stream().min((o1, o2) -> o1.compareTo(o2)).get();
//        throw new NotImplementedException();
    }

    public double getAverage() {
      return   arrayList.stream().reduce((x,y)->x+y).get()/(double)arrayList.size();
//        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        if(arrayList.size()%2==0){
         return   ( (double)(arrayList.get(arrayList.size()/2-1)+arrayList.get(arrayList.size()/2)))/2;
        }else{
         return    arrayList.get(arrayList.size()/2);
        }
//        throw new NotImplementedException();
    }

    public int getFirstEven() {
       return arrayList.stream().filter(x->x%2==0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
      return   arrayList.indexOf(arrayList.stream().filter(x->x%2==0).findFirst().get());

    }

    public boolean isEqual(List<Integer> arrayList) {
       return arrayList.size()==this.arrayList.size()&&this.arrayList.stream().anyMatch(x->arrayList.contains(x));
//        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        DecimalFormat df = new DecimalFormat("######0.0");

        Integer integer1 = (Integer) singleLink.getNode(6);
        Integer integer2 = (Integer) singleLink.getNode(7);
        if (integer2 == null) {
            return Double.parseDouble(integer1.toString());
        }
        String format = df.format((Double.parseDouble(integer1.toString()) + Double.parseDouble(integer2.toString())) / 2);
        return Double.parseDouble(format);
    }

    public int getLastOdd() {
    return   arrayList.stream().filter(x->x%2!=0).skip(arrayList.stream().filter(x->x%2!=0).count()-1).findFirst().get();
//        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        return     arrayList.lastIndexOf(arrayList.stream().filter(x->x%2!=0).skip(arrayList.stream().filter(x->x%2!=0).count()-1).findFirst().get());
    }
}
