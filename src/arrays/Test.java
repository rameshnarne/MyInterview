package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String a[]) {
        int i=2; int j=0;
        /*int temp = (i++ + i++);
        int temp1 = --i;*/
       j = (i++ + i++)*--i;
        System.out.println(j);
    }

}
