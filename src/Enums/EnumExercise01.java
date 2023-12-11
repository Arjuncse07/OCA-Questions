package Enums;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
/*
Create an enum representing movie ratings (G, PG, PG-13, R, NC-17).
Implement a method that takes a rating and returns whether it's suitable for children (G or PG).

Note: I have created this question to show the dropdowns on the page according to user selection. If user select
Child then child enums are filtered out.
IF they select adult dropdown will filter out.
The Order Remains same for the enums using LinkedHashMap.
 */
public class EnumExercise01 {

    public enum MovieRating{
        G,PG,PG_13,R,NC_17, AC_11, GF_10,RO_101
    }

        public static boolean isSuitableForChildren(MovieRating movieRating){
        return movieRating == MovieRating.G ||   movieRating == MovieRating.PG || movieRating == MovieRating.NC_17;
        }

        public static boolean isSuitableForAdults(MovieRating movieRating){
        return movieRating == MovieRating.PG_13 || movieRating == MovieRating.R || movieRating == MovieRating.AC_11 ||
                movieRating == MovieRating.GF_10 || movieRating == MovieRating.RO_101;
        }


        /*
        REQUIREMENT : Filter Enums which are suitable for Children and Adults it is decided on Runtime
         */

    public static <T extends Enum<T>>  Map<String,Integer> filterEnums(Class<T> enums , Predicate<T> filterPredicate){
        T[] enumConstants = enums.getEnumConstants();
        Map<String,Integer> sortedEnumMap = new LinkedHashMap<>();
       Arrays.stream(enumConstants)
               .filter(filterPredicate)
               .forEach(enumConstant -> sortedEnumMap.put(enumConstant.name(),enumConstant.ordinal()));
       return sortedEnumMap;
    }

    public static void main(String[] args) {
        System.out.println("Children:::"+filterEnums(MovieRating.class ,EnumExercise01::isSuitableForChildren));
        System.out.println("For Adults ::: " +filterEnums(MovieRating.class ,EnumExercise01::isSuitableForAdults));
    }

}
