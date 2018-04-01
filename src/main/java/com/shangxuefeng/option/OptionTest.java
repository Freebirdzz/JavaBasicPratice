package com.shangxuefeng.option;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
class Movie{
    private String name;
    private int rank;
    private String director;
    private int year;
    private double mark;

    public static List<Movie> getList(int n){
        return null;
    }
}

public class OptionTest {
    public static void main(String[] args){


    }
}
