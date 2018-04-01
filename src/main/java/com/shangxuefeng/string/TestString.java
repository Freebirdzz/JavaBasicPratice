package com.shangxuefeng.string;

public class TestString {
    public void testSplit(){
    }
    public static void main(String[] args){
    //    String str = "";
     //   List<Long> list = Arrays.com.shangxuefeng.stream(str.split(",")).map(n->Long.valueOf(n)).collect(Collectors.toList());
    //    list.com.shangxuefeng.stream().forEach(System.out::println);

/*        for (int i=0;i<100;i++) {
            print(i);
        }*/
        String str = "PassengerGender:男";
        System.out.println(str);
        str.replace("男", "1");
        System.out.println(str);
    }
    public static void print(int i){
        System.out.println("Number: " + i);
    }
}
