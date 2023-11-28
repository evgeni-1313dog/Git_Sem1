import java.util.ArrayList;
import java.util.List;

public class One {

    private static String name;
    private static int age;
    private static int phone;

    public One (String name, int age, int phone){
        this.name = name;
        this.age = age;
        this.phone = phone;

    }

    List<One> list = new ArrayList<>();

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        One.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        One.age = age;
    }

    public static int getPhone() {
        return phone;
    }

    public static void setPhone(int phone) {
        One.phone = phone;
    }

    public List<One> getList() {
        return list;
    }

    public void setList(List<One> list) {
        this.list = list;
    }
    list.add(new One("is", 76, 2638));
    list.add(new One("Ira", 56, 2445));
}