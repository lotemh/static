/**
 * Created by lotem on 9/4/2014.
 */
class Editor extends Thread{
    @Override
    public void run(){
        try {
            AutomationTeam automationTeam = new AutomationTeam();
            automationTeam.coolestTeam = "editor";
            Thread.sleep(500);
            System.out.println("editor: " + automationTeam.coolestTeam);
        } catch (InterruptedException e) {
            System.out.println("error");
        }
    }
}