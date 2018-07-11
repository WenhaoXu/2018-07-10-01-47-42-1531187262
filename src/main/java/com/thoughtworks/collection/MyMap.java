package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return  array.stream().map(x->x*3).collect(Collectors.toList());
//        throw new NotImplementedException();
    }

    public List<String> mapLetter() {
       return array.stream().map(x->letters[x-1]).collect(Collectors.toList());
//        throw new NotImplementedException();
    }

    public List<String> mapLetters() {
      return   array.stream().map(x->{
          if(x/26==0){
              return letterList.get(x%26-1);
          }
          if(x%26==0){
              return letterList.get(x/26-2)+"z";
          }
            return letterList.get(x/26-1) +letterList.get(x%26-1);

        }).collect(Collectors.toList());
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
       return array.stream().sorted((o1,o2)->-1).collect(Collectors.toList());
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
