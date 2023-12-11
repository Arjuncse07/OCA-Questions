package Enums;
/*
Create an enum representing the months of the year.
Implement a method that takes a month and returns the corresponding quarter of the year. SOLVE IT
 */
public class EnumExercise03 {

    public enum MONTHS{
        JANUARY,
        FEBRUARY,
        MARCH, APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;

        public int getQuarter(){
            return (this.ordinal() / 3) + 1;
        }
    }

    public static int findQuarter(MONTHS months){
        return months.getQuarter();
    }

    public static void main(String[] args) {
        MONTHS month1 = MONTHS.APRIL;
        MONTHS month2 = MONTHS.DECEMBER;
        MONTHS month3 = MONTHS.JUNE;

        System.out.println(findQuarter(month1));
        System.out.println("Month "+month2.toString()+" Quarter " +findQuarter(month2));
        System.out.println(findQuarter(month3));
    }
}
