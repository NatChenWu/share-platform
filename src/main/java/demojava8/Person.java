package demojava8;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * @author alonso.chen
 * @date 2019/1/14下午5:32
 */
@Setter
@Getter
public class Person {
    @NonNull
    private String name;
    private Integer age;

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public static Person createPerson(String name,Integer age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return  person;
    }
}
