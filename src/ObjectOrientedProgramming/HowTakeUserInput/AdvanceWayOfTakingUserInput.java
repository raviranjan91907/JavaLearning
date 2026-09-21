package ObjectOrientedProgramming.HowTakeUserInput;

import java.util.Scanner;

public class AdvanceWayOfTakingUserInput {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(num);
        String str=sc.nextLine();
        System.out.println(str);
    }
}
