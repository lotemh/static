/**
 * Created by IntelliJ IDEA.
 * User: lotemh
 * Date: 9/15/2014
 * Time: 4:15 PM
 */
public class StaticOrder{

    public static String firstVar = "static class member not initialized";
    private String instanceMember = "instance member";

    static {
        firstVar = "static class member";
    }

    public StaticOrder() {
        System.out.println("creating instance of the class");
    }

    public void printInstanceMember(){
        System.out.println(instanceMember);
    }

}
