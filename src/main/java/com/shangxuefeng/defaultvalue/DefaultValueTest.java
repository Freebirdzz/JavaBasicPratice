package com.shangxuefeng.defaultvalue;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class T{
    private Integer offset;
    private Integer limit;
}


public class DefaultValueTest {
    public static void main(String[] args){
      //  T test = new T();
       // System.out.println(test.getOffset()+"  " + test.getLimit());

        String str = "     ";
        String str2 = "   a   ";
        String str3 = "     a";
        String tmp = str.trim();
        boolean flag = (tmp == "");
        String ppt = "";
        System.out.println(ppt == "");

        String ppt2 = new String("");
        System.out.println(ppt2 == "");

        System.out.println(ppt2 == ppt);
        System.out.println(str.trim().length() + "  " + str2.trim().length()+"  " + str3.trim().length());

    }
}
