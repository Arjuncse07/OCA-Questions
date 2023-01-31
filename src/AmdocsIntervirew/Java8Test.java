package AmdocsIntervirew;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Test {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
      // filter is a intermediate operator is not loaded because it is lazy loaded,
        list.stream().filter( x ->{
            printMe();
            return true;
                }).collect(Collectors.toList());
    }

    public static void printMe(){
        System.out.println(" I am Printed");
    }
}
