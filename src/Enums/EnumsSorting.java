package Enums;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EnumsSorting {


    //----------------- Sort Enum Without Affecting Original Sequence of Enum Constants ---------------------------//
    public static <T extends Enum<T>> void sortEnums(Class<T> enumClass,Comparator<T> comparator) {
       T[] enumConstantsArray = enumClass.getEnumConstants();
        Map<String,Integer> enumMap = new LinkedHashMap<>();
        Arrays.stream(enumConstantsArray)
                .sorted(comparator)
                .forEach(value -> enumMap.put(value.name(), value.ordinal()));
        System.out.println(enumMap);
        System.out.println(enumMap.keySet() +":::" +enumMap.values());
    }


    public static void main(String[] args) {
        //sorting by default order
        sortEnums(RoyalEnfield.class,Comparator.comparing(RoyalEnfield::ordinal));
        //sorting by name
        sortEnums(RoyalEnfield.class,Comparator.comparing(RoyalEnfield::name));
    }


}
