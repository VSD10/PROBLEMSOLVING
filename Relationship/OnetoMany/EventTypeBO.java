package Relationship.OnetoMany;

import java.util.ArrayList;

class EventTypeBO {
    public void display(ArrayList<EventType> eventTypeList) {
        for (EventType eventType : eventTypeList) {
            System.out.println("Event Type: " + eventType.getName());
            if (!eventType.getList().isEmpty()) {
                System.out.format("%-20s%-20s%-20s\n", "Name", "Detail", "Organiser Name");
                for (Event event : eventType.getList()) {
                    System.out.format("%-20s%-20s%-20s\n", event.getName(), event.getDetail(), event.getOrganiserName());
                }
            } else {
                System.out.println("No events for this type.");
            }
        }
    }
}
