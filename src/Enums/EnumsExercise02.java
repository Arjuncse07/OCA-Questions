package Enums;
/*
Create an enum representing the colors of a traffic light.
Implement a method that takes a color and returns the next color in the
sequence (red -> yellow -> green -> red). solve it
 */
public class EnumsExercise02 {

    public enum TrafficLight{
        RED,YELLOW,GREEN;


        public TrafficLight getNextColor(){
            //values.length --> enum constant count in this case the count is 3;
            int nextIndex = (this.ordinal() + 1) % values().length;
            return values()[nextIndex];
        }
    }

   /* public TrafficLight getNextColor(){
        if (this.equals(TrafficLight.RED)) {
            return TrafficLight.YELLOW;
        } else if (this.equals(TrafficLight.YELLOW)) {
            return TrafficLight.GREEN;
        } else if (this.equals(TrafficLight.GREEN)) {
            return TrafficLight.RED;
        }
        throw new IllegalStateException("Unexcepted value:" + this);
    }*/

    /*
    Optimized Method of getNextColor()
     */



    public static void main(String[] args) {

        TrafficLight currentColor = TrafficLight.GREEN;
        for (int i=0; i<3; i++){
            System.out.println("Current Color ::" +currentColor);
            currentColor = currentColor.getNextColor();
        }
    }
}
