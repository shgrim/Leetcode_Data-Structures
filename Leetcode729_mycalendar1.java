package Leetcode;

import java.util.TreeMap;

public class Leetcode729_mycalendar1 {
    public static void main(String[] args) {
        Leetcode729_mycalendar1  obj = new Leetcode729_mycalendar1();
        boolean param_1 = obj.book(10,20);
    }
    static TreeMap<Integer, Integer> calendar;

    Leetcode729_mycalendar1() {
        calendar = new TreeMap();
    }

    public static boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}
