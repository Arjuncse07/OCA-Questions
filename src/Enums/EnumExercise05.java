package Enums;

import java.sql.SQLOutput;/*
Days of the Week: Create an enum representing the days of the week.
Implement a method that takes a day and returns the next working day (skipping weekends).
 */

public class EnumExercise05 {

    public enum DAYS{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

        public DAYS getNextWorkingDay(){
            if (this.equals(DAYS.MONDAY)){
                return DAYS.TUESDAY;
            } else if (this.equals(DAYS.TUESDAY)) {
                return DAYS.WEDNESDAY;
            }else if(this.equals(DAYS.WEDNESDAY)){
                return DAYS.THURSDAY;
            } else if (this.equals(DAYS.THURSDAY)) {
                return DAYS.FRIDAY;
            } else if (this.equals(DAYS.FRIDAY)) {
                return DAYS.MONDAY;
            } else if (this.equals(DAYS.SATURDAY)) {
                System.out.println(this.toString()+" This is weekend!! Enjoy ");
                return null;
            } else if (this.equals(DAYS.SUNDAY)) {
                System.out.println(this.toString()+" This is weekend!! Enjoy ");
                return null;
            }
            throw new IllegalStateException("Unexpected value :" +this);
        }
    }

    public static DAYS getDays(DAYS days){
        return days.getNextWorkingDay();
    }

    public static void main(String[] args) {

        DAYS day1 = DAYS.MONDAY;
        DAYS day2 = DAYS.TUESDAY;
        DAYS day3 = DAYS.WEDNESDAY;
        DAYS day4 = DAYS.THURSDAY;
        DAYS day5 = DAYS.FRIDAY;
        DAYS day6 = DAYS.SATURDAY;
        DAYS day7 = DAYS.SUNDAY;
        System.out.println(day1 +" Next Working Day "+getDays(day1));
        System.out.println(day2 +" Next Working Day "+getDays(day2));
        System.out.println(day3 +" Next Working Day "+getDays(day3));
        System.out.println(day4 +" Next Working Day "+getDays(day4));
        System.out.println(day5 +" Next Working Day "+getDays(day5));
        System.out.println(day6 +" Next Working Day "+getDays(day6));
        System.out.println(day7 +" Next Working Day "+getDays(day7));
    }

}
