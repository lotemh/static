import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by lotem on 9/4/2014.
 */
@RunWith(JUnit4.class)
public class Tests {

    //static usage: static variable
    @Test
    public void objectCounter(){
        for (int i = 0; i < 10; i++){
            new AutomationDeveloper();
        }
        System.out.println(AutomationDeveloper.getCounter());
    }

    @Test
    public void test(){
        Animal moshe = new Animal();
        Animal lasi = new Dog();
        Dog pluto = new Dog();

        moshe.sayHi();
        lasi.sayHi();
        pluto.sayHi();
    }

    @Test
    public void classrooms1(){
        Boolean isBlueRoomAvailable = RoomsManager.classrooms.get(RoomsManager.Room.BLUE_ROOM);
        System.out.println("isBlueRoomAvailable: " + isBlueRoomAvailable);
    }

    @Test
    public void classrooms2(){
        Boolean isBlueRoomAvailable = RoomsManager1.isAvailable(RoomsManager1.Room.BLUE_ROOM);
        System.out.println("isBlueRoomAvailable: " + isBlueRoomAvailable);
    }

    @Test
    public void classrooms3(){
        RoomsManager2 roomsManager = RoomsManager2.getInstance();
        Boolean isBlueRoomAvailable = roomsManager.isAvailable(RoomsManager2.Room.BLUE_ROOM);
        System.out.println("isBlueRoomAvailable: " + isBlueRoomAvailable);
    }

    @Test
    public void classrooms4(){
        RoomsManager2 roomsManager = RoomsManager2.getInstance();
        Boolean isBlueRoomAvailable = roomsManager.isAvailable(RoomsManager2.Room.BLUE_ROOM);
        System.out.println("isBlueRoomAvailable: " + isBlueRoomAvailable);
    }

    @Test
    public void classrooms5(){
        RoomsManager2 roomsManager = RoomsManager2.getInstance();
        RoomsManager2 roomsManager2 = RoomsManager2.getInstance();

        roomsManager2.scheduleRoom(RoomsManager2.Room.BLUE_ROOM);
        Boolean isBlueRoomAvailable = roomsManager.isAvailable(RoomsManager2.Room.BLUE_ROOM);
        System.out.println("isBlueRoomAvailable: " + isBlueRoomAvailable);
    }

    @Test
    public void classrooms6(){
        RoomsManager3 roomsManager = RoomsManager3.getInstance();
        RoomsManager3 roomsManager2 = RoomsManager3.getInstance();

        roomsManager2.scheduleRoom(RoomsManager3.Room.BLUE_ROOM);
        Boolean isBlueRoomAvailable = roomsManager.isAvailable(RoomsManager3.Room.BLUE_ROOM);
        System.out.println("isBlueRoomAvailable: " + isBlueRoomAvailable);
    }
}
