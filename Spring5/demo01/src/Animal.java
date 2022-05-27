import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Animal {
    String[] arr;
    List<Dog> list;
    Map<String,Dog> map;
    Set<String> set;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<Dog> getList() {
        return list;
    }

    public void setList(List<Dog> list) {
        this.list = list;
    }

    public Map<String, Dog> getMap() {
        return map;
    }

    public void setMap(Map<String, Dog> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }

    @Test
    public void testAnimal(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        Animal animal = (Animal) context.getBean("animal");
        System.out.println(animal);
    }
}
