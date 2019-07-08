package sg.edu.rp.c346.exercise1;

import java.util.Date;

public class ToDoItems {
    private String ListItem;
    private String ScheduleDate;

    public ToDoItems(String listItem, String scheduleDate) {
        ListItem = listItem;
        ScheduleDate = scheduleDate;
    }

    public String getListItem() {
        return ListItem;
    }

    public void setListItem(String listItem) {
        ListItem = listItem;
    }

    public String getScheduleDate() {
        return ScheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        ScheduleDate = scheduleDate;
    }

    @Override
    public String toString() {
        return ListItem + ScheduleDate;
    }
}