package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates_From_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,1,1,2,3,3,3,4,4,5,4,5,4,2,4,2,5,2,1,1,1,34,56,34,5,3,54,3,5,6,75,65,64));

        //1. Using Linked HashSet

        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>(numbers);
        ArrayList<Integer> numberOfListWithoutDuplicates= new ArrayList<>(linkedHashSet);
        System.out.println(numberOfListWithoutDuplicates);

        // using java 8

        ArrayList<Integer> marksList= new ArrayList<>(Arrays.asList(1,2,3,1,3,3,1,1,2,1,2,1,3,5,6,4,5,3,4,3,6,4,6,7,4,2,1,1,3,4,2,53));
        List<Integer> marksListUnique= marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnique);
    }
}
