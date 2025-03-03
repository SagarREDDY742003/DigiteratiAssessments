package Day1;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RoomScheduler {
    private Map<String, MeetingRoom> meetingRooms = new HashMap<>();

    public void addMeetingRoom(MeetingRoom room) {
        meetingRooms.put(room.getRoomId(), room);
        System.out.println("Room added: " + room.getRoomName() + ", ID: " + room.getRoomId());
    }

    public String bookRoom(String roomId, EnumSet<RoomFeature> requiredFeatures) {
        MeetingRoom room = meetingRooms.get(roomId);
        if (room != null && room.getFeatures().containsAll(requiredFeatures)) {
            return "Room " + roomId + " booked successfully.";
        }
        return "Room " + roomId + " does not meet the required features.";
    }

    public List<MeetingRoom> listAvailableRooms(EnumSet<RoomFeature> requiredFeatures) {
        return meetingRooms.values().stream()
            .filter(room -> room.getFeatures().containsAll(requiredFeatures))
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        RoomScheduler scheduler = new RoomScheduler();

        scheduler.addMeetingRoom(new MeetingRoom("001", "Boardroom", 20, EnumSet.of(RoomFeature.PROJECTOR, RoomFeature.CONFERENCE_PHONE, RoomFeature.AIR_CONDITIONING)));
        scheduler.addMeetingRoom(new MeetingRoom("002", "Strategy Room", 10, EnumSet.of(RoomFeature.WHITEBOARD, RoomFeature.AIR_CONDITIONING)));

        System.out.println(scheduler.bookRoom("001", EnumSet.of(RoomFeature.PROJECTOR, RoomFeature.CONFERENCE_PHONE)));
        
        List<MeetingRoom> availableRooms = scheduler.listAvailableRooms(EnumSet.of(RoomFeature.AIR_CONDITIONING));
        System.out.println("Available rooms with AIR_CONDITIONING: " + availableRooms);
    }
}
