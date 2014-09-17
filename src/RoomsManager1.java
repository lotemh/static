import java.util.HashMap;
import java.util.Map;

/**
 * Created by lotem on 9/10/2014.
 */
public class RoomsManager1 {

    private static final Boolean AVAILABLE = true;
    private static final Boolean OCCUPIED = false;

    private static RoomsManager1 instance = null;
    private static Map<Room, Boolean> classrooms;

    private RoomsManager1(){}

    public static RoomsManager1 getInstance(){
        if (instance == null){
            instance = new RoomsManager1();
        }
        return instance;
    }

    private void initClassrooms(){
        classrooms = new HashMap<Room, Boolean>();

        classrooms.put(Room.RED_ROOM, AVAILABLE);
        classrooms.put(Room.BLUE_ROOM, AVAILABLE);
        classrooms.put(Room.GREEN_ROOM, AVAILABLE);
    }

    public static boolean isAvailable(Room room){
        return classrooms.get(room);
    }

    public static void scheduleRoom(Room room){
        classrooms.put(room, OCCUPIED);
    }

    public enum Room {
        RED_ROOM,
        BLUE_ROOM,
        GREEN_ROOM
    }
}
