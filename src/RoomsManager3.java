import java.util.HashMap;
import java.util.Map;

/**
 * Created by lotem on 9/10/2014.
 */
public class RoomsManager3 {

    private static final Boolean AVAILABLE = true;
    private static final Boolean OCCUPIED = false;

    private static RoomsManager3 instance = null;
    private Map<Room, Boolean> classrooms;

    private RoomsManager3(){
        initClassrooms();
    }

    public static RoomsManager3 getInstance(){
        if (instance == null){
            instance = new RoomsManager3();
        }
        return instance;
    }

    private void initClassrooms(){
        classrooms = new HashMap<Room, Boolean>();

        classrooms.put(Room.RED_ROOM, AVAILABLE);
        classrooms.put(Room.BLUE_ROOM, AVAILABLE);
        classrooms.put(Room.GREEN_ROOM, AVAILABLE);
    }

    public boolean isAvailable(Room room){
        return classrooms.get(room);
    }

    public void scheduleRoom(Room room){
        classrooms.put(room, OCCUPIED);
    }

    public enum Room {
        RED_ROOM,
        BLUE_ROOM,
        GREEN_ROOM
    }
}
