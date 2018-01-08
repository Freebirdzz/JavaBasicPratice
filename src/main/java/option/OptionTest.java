package option;

import jdk.nashorn.internal.runtime.options.Option;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;
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
