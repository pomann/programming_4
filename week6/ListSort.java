import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        int n = sc.nextInt();
        while(n != -1){
            nums.add(n);
            n = sc.nextInt();
        }
        Collections.sort(nums);
        System.out.print("Sorted:");
        for(int i : nums){
            System.out.print(" " + i);
        }
    }
}