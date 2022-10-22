package serializable;

import java.io.Serializable;

public class SerializableTest implements Serializable {
    private transient String name;
    private int age;
    public SerializableTest(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SerializableTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
