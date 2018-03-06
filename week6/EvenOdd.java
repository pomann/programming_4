import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd{
    public static void main(String [] args){
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != -1){
            if(n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
            n = sc.nextInt();
        }
        System.out.print("Odd:");
        for(int k : odd){
            System.out.print(" " + k);
        }
        System.out.println();
        System.out.println("Even");
        for(int k : even){
            System.out.print(" " + k);
        }
    }
}