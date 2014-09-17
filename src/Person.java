/**
 * Created by IntelliJ IDEA.
 * User: lotemh
 * Date: 9/16/2014
 * Time: 5:29 PM
 */
public class Person {

    private static String staticName;
    private String name;

    public Person() {
        this.name = "default name";
        staticName  = "default static name";
    }

    public void setName(String name) {
        this.name = name;
        staticName = name;
    }

    public String getName() {
        return name;
    }

    public static String getStaticName() {
        return staticName;
    }
}
