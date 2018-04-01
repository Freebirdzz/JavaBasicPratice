package com.shangxuefeng.spi_test.collection;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author shangxuefeng @date 2018/3/14
 */
public class SetMain {
    @Test
    public void modifySet() {
        Set<String> set = Sets.newHashSet("4","2","3","4","1","4");

        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();

        System.out.println(set);
    }

    @Test
    public void setSequence(){
        Set<Integer> set = Sets.newLinkedHashSet();
        set.add(2);
        set.add(1);
        set.add(31);
        set.add(9);
        set.add(12);
        Iterator<Integer> ite = set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
