package com.shangxuefeng.spi_test.iterator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @author shangxuefeng @date 2018/3/14
 */
public class MainTest {
    @Test
    public void test1(){
        List<String> list = Lists.newArrayList("1","2", "3", "4", "5");
        Iterator<String> iterator = list.iterator();
        iterator.remove();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
