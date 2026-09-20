package ObjectOrientedProgramming.HowTakeUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldWayToTakeUserInput{
    public static void main(String args[]) throws IOException {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);

        int num=Integer.parseInt(bf.readLine());

        System.out.println(num);
    }
}
