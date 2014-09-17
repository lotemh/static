/**
 * Created by IntelliJ IDEA.
 * User: lotemh
 * Date: 9/14/2014
 * Time: 6:10 PM
 */
public class NumOfPeople implements Runnable {

    private int day;

    public NumOfPeople(int day) {
        this.day = day;
    }

    public void run() {
        System.out.println("day " + day  + ": " + AutomationTeam.Team.INFRA.getNumOfPeople(day));
    }
}
