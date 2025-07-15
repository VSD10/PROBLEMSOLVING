package Relationship.OnetoMany;

import java.util.ArrayList;

class EventType {
    private String name;
    private ArrayList<Event> list;

    public EventType() {
        this.list = new ArrayList<>();
    }

    public EventType(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Event> getList() {
        return list;
    }

    public void setList(ArrayList<Event> list) {
        this.list = list;
    }

    public void addEvent(Event event) {
        this.list.add(event);
    }
}
