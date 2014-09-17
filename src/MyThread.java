/**
 * Created by IntelliJ IDEA.
 * User: lotemh
 * Date: 9/16/2014
 * Time: 5:23 PM
 */
public class MyThread extends Thread {

    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    public void run(){
        Person person = new Person();
        person.setName("person" + id);
        try {
            Thread.sleep(1000);
            System.out.println("Thread " + id + " name: " + person.getName());
            System.out.println("Thread " + id + " static name: " + person.getStaticName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
