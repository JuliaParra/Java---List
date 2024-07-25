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

    public static void main(String[] args) {
        Week week = new Week();
        
        // Create the weekdays
        week.createWeekDays();
        System.out.println("Weekdays created:");
        printDays(week.getDays());
        
        
        System.out.println("Number of days: " + week.getSize());

        
        week.removeDay("Wednesday");
        System.out.println("After removing Wednesday:");
        printDays(week.getDays());

       
        System.out.println("Is Tuesday in the list? " + week.existsDay("Tuesday"));
        System.out.println("Is Wednesday in the list? " + week.existsDay("Wednesday"));

       
        System.out.println("Day at index 2: " + week.getDay(2));

        
        week.sortDays();
        System.out.println("Days sorted:");
        printDays(week.getDays());

        
        week.clearDays();
        System.out.println("Days cleared:");
        printDays(week.getDays());
    }

    private static void printDays(List<String> days) {
        for (String day : days) {
            System.out.println(day);
        }
    }
}

