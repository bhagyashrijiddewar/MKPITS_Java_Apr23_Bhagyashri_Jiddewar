package JavaNewAdditionalConceptInInterface.DataDisplay;

import java.util.Scanner;

public class MainDisplay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the choice 1 or 2 : ");
        DisplayClass displayClass=new DisplayClass(scanner.nextInt());
        displayClass.display();
    }
}
