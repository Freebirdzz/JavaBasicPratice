package com.shangxuefeng.iterator;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author shangxuefeng @date 2018/3/13
 */
public class IteratorMain {
    public void iteratorException() {
        List<Integer> list = Lists.newArrayList(1,2,3,4,5,6,7,8,9);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer == 2) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        IteratorMain im = new IteratorMain();
        im.iteratorException();
    }
}
