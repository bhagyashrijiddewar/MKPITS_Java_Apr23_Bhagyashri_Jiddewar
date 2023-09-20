import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Integer>list= Arrays.asList(20,10,50,30,13,55,9);
//-------------------------------------------------------
        System.out.println("ForEach : ");
        list.stream().map(c->c).forEach(System.out::println); //With the help of foreach loop(1st )
//------------------------------------------------------
        System.out.println("collect : ");
        List list1=list.stream().map(c->c).collect(Collectors.toList()); //With the hepl of coolect method(2nd)
        System.out.print(list1+" "+"\n");
//--------------------------------------------------------
        System.out.println("Filter : ");
        List list2= list.stream().filter(c->c%2==0).collect(Collectors.toList());
        System.out.print(list2+" "+"\n");
//       ------------------------------------------------
        System.out.println("Sorted : ");
       list.stream().sorted().forEach(System.out::println);
//       -----------------------------------------------
        System.out.println("Skip : ");
        List list3=list.stream().skip(2).collect(Collectors.toList());
        System.out.print(list3+" ");
//        -----------------------------------------------
        System.out.println("FindFirst : ");
        List list4=list.stream().findFirst().stream().toList();
        System.out.println(list4);
//        ---------------------------------------------------
        System.out.println("Reduce with sum: ");
        int sumOfNumbers=list.stream().reduce(0,(sum,n)->sum+n);
        System.out.println(sumOfNumbers);
//        ---------------------------------------------------
        System.out.println("Reduce (Filter then sum) : ");
        int sumOfEvenNumbers=list.stream().filter(integer -> integer%2==0).reduce(0,(sum,n)->sum+n);
        System.out.println(sumOfEvenNumbers);
    }
}