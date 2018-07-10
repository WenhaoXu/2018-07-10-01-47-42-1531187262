package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
//        Arrays.stream(array).map(x->x= Arrays.stream(x).map(y->y=y.))
        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        throw new NotImplementedException();
    }
}
