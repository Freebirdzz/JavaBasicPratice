package com.shangxuefeng.spi_test.map;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author shangxuefeng @date 2018/3/19
 */
public class MapTest {
    @Test
    public void testCompute(){
        Map<String, String> map = Maps.newHashMap();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");
        map.put("Four", "4");

        Iterator<String> ite = map.keySet().iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
