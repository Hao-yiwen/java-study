import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            // 获取Class对象
            Class<?> personClass = Class.forName("Person");

            // 获取并打印类名
            System.out.println("Class Name: " + personClass.getName());

            // 创建对象实例
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Object personObject = constructor.newInstance("John Doe", 30);

            // 获取并调用方法
            Method setNameMethod = personClass.getMethod("setName", String.class);
            setNameMethod.invoke(personObject, "Jane Doedsad");

            Method getNameMethod = personClass.getMethod("getName");
            System.out.println("Name: " + getNameMethod.invoke(personObject));

            // 访问并修改字段
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true); // 对于私有字段，需要这样做
            ageField.set(personObject, 35);

            Method getAgeMethod = personClass.getMethod("getAge");
            System.out.println("Age: " + getAgeMethod.invoke(personObject));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
