import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Person {

    @Retention(RetentionPolicy.RUNTIME)
    @interface Field {
        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Age {}

    @Field(description = "Your name, please: ")
    private String name;

    @Field(description = "Your family name, please: ")
    private String family_name;

    @Field(description = "Your date of birth, please: ")
    private String date_of_birth;


    @Age
    private int age=19;

    public String representPerson(){
        return "The user with the name "+name+", family name "+family_name+" , date of birth "+date_of_birth+ " and age "+age +"  is successful registered!";
    }

}
