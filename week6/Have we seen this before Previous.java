import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Previous
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        int n = sc.nextInt();
        System.out.println("Enter some numbers (-1 to end)");
        System.out.println("Previous:");
        while(n != -1){
            for(int i : nums){
                if(i == n){
                    System.out.println(n);
                    break;
                }
            }
            nums.add(n);
            n = sc.nextInt();
        }
    }
}