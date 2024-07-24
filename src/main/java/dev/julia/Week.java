package dev.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week {

    private final List<String> days;

    public Week() {
        days = new ArrayList<>();
    }

    
    public void createWeekDays() {
        days.clear();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

    
    public List<String> getDays() {
        return new ArrayList<>(days); 
    }

    
    public int getSize() {
        return days.size();
    }

    
    public boolean removeDay(String day) {
        return days.remove(day);
    }

    
    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return days.get(index);
        }
        return null;
    }

    
    public boolean existsDay(String day) {
        return days.contains(day);
    }

    
    public void sortDays() {
        Collections.sort(days);
    }

   
    public void clearDays() {
        days.clear();
    }
}
    

