/**
 * Created by IntelliJ IDEA.
 * User: lotemh
 * Date: 9/15/2014
 * Time: 4:12 PM
 */
public class StaticInit {

    public static String str = StaticOrder.firstVar;

    public static void main(String[] args){
        System.out.println("starting main function");
        System.out.println(StaticOrder.firstVar);
        StaticOrder staticOrder = new StaticOrder();
        staticOrder.printInstanceMember();
        System.out.println(str2);
    }

    public static String str2 = StaticOrder.firstVar;
}
