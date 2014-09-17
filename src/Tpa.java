/**
 * Created by lotem on 9/4/2014.
 */
class Tpa extends Thread{
    @Override
    public void run(){
        AutomationTeam automationTeam = new AutomationTeam();
        automationTeam.setCoolestTeam("tpa");
        System.out.println("tpa: " + automationTeam.coolestTeam);
    }
}