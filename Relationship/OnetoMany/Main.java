package Relationship.OnetoMany;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EventType> eventTypeList = new ArrayList<>();

        System.out.println("Enter the type of events in CSV format");
        String eventTypesCsv = sc.nextLine();
        String[] eventTypesArray = eventTypesCsv.split(",");
        for (String type : eventTypesArray) {
            eventTypeList.add(new EventType(type.trim()));
        }

        System.out.println("Enter the number of Events");
        int numberOfEvents = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfEvents; i++) {
            System.out.println("Enter the Event " + (i + 1) + " Details");
            String eventDetailsCsv = sc.nextLine();
            String[] eventDetailsArray = eventDetailsCsv.split(",");
            String name = eventDetailsArray[0].trim();
            String detail = eventDetailsArray[1].trim();
            String type = eventDetailsArray[2].trim();
            String organiserName = eventDetailsArray[3].trim();

            Event event = new Event(name, detail, type, organiserName);

            for (EventType eventType : eventTypeList) {
                if (eventType.getName().equalsIgnoreCase(type)) {
                    eventType.addEvent(event);
                    break;
                }
            }
        }

        EventTypeBO eventTypeBO = new EventTypeBO();
        eventTypeBO.display(eventTypeList);

        sc.close();
    }
}