package com.shangxuefeng.spi_test.clone;

import com.shangxuefeng.clone.TBean;
import org.junit.Test;

import java.beans.beancontext.BeanContext;

/**
 * @author shangxuefeng @date 2018/3/12
 */
public class CloneTest {
    @Test
    public void lightClone(){
        try {
            TBean bean = new TBean("KEvin");
            TBean b = (TBean)bean.clone();
            System.out.println(b == bean);
            System.out.println(b.getName().equals(bean.getName()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
