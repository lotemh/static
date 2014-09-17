import java.util.Calendar;

/**
 * Created by lotem on 9/4/2014.
 */
public class AutomationTeam {

    public static String coolestTeam;

    public void setCoolestTeam(String team){
        coolestTeam = team;
    }

    public enum Team{
        EDITOR(5),
        TPA(3),
        INFRA(3);

        private int numOfPeople;

        Team(int num){
            numOfPeople = num;
        }

        public int getNumOfPeople(int day) {
            if (day == Calendar.SUNDAY) {
                return --numOfPeople;
            }
            else return  numOfPeople;
        }
    }


}
