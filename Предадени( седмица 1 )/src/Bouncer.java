import java.lang.reflect.Field;

public class Bouncer {

    public boolean check(Object o){
        Class personClass = o.getClass();
        Field[] fields = personClass.getDeclaredFields();
        for(Field field: fields){
            if(field.isAnnotationPresent(Person.Age.class)){
                field.setAccessible(true);
                try {
                    int age = field.getInt(o);
                    if(age >= 18){
                        return true;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

}
