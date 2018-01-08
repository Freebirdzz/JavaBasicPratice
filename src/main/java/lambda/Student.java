package lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private String addr;
    private int age;
    private boolean gender;


    public List<Student> getList(){
        return null;
    }
}
