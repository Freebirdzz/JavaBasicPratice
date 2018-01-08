package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {
    public static void main(String[] args){
        String str = "";
        List<Long> list = Arrays.stream(str.split(",")).map(n->Long.valueOf(n)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }
}
