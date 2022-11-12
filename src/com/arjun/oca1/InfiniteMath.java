package com.arjun.oca1;

/**Overriding not applicable for variables
 *
 */
class Math {
    public final double secret = 2;
}

class ComplexMath extends Math {
    public final double secret = 4;
}
public class InfiniteMath extends Math {
    public final double secret=8;
    public static void main(String[] args) {
        Math math= new InfiniteMath();
        System.out.println(math.secret);
    }
}
