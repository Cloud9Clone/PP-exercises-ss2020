import java.lang.annotation.Annotation;
import java.util.Scanner;
import java.lang.reflect.Field;

public class TestClass {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! You need a registration, if you want to use our services!");
        Person person = new Person();
        Class personClass = person.getClass();
        System.out.println("In order to make it simple, we follow the pattern of the class "+personClass.getName());
        System.out.println("Please, fill up the required data: ");
        Field[] fields = personClass.getDeclaredFields();


        try {
            for (Field field : fields) {
                //try {
                    if(field.isAnnotationPresent(Person.Age.class)){
                        System.out.println("Age: ");
                        int provide = sc.nextInt();
                        field.setAccessible(true);
                        field.setInt(person, provide);
                    }else {

                        String description = field.getAnnotation(Person.Field.class).description();
                        System.out.println(description);
                        String provide = sc.nextLine();
                        field.setAccessible(true);
                        field.set(person, provide);
                    }
                //} catch (NullPointerException npe){
                //    continue;   // Special case, if we don't use if-else for checking whether the @Age annotation is presented in the class and setting the age.
               // }
            }
        } catch (Exception e){
            e.printStackTrace();
        }


        Bouncer b = new Bouncer();

        if(b.check(person)) {
            System.out.println(person.representPerson());
        }else{
            System.out.println("The system can't register you, since you're under 18!");
        }

    }



}