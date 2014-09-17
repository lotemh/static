import java.util.Calendar;

/**
 * Created by lotem on 9/4/2014.
 */
public class NonJunitTests {

//    public static void main(String[] args){
        public static void main1(String[] args){
        Thread editor = new Editor();
        Thread tpa = new Tpa();
        editor.start();
        tpa.start();
    }


//    public static void main(String[] args){
        public static void main2(String[] args){
        new NumOfPeople(Calendar.THURSDAY).run();
        new NumOfPeople(Calendar.SUNDAY).run();
        new NumOfPeople(Calendar.MONDAY).run();
    }


    public static void main(String[] args){
//        public static void main3(String[] args){
        for (int i =0; i< 6; i++){
                new MyThread(i).start();
        }
    }

}
