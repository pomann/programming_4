public class Test
{
    public static int [] reverse(int [] num)
    {
        for(int i = 0; i < num.length/2; i++){
            int t = num.length - 1 - i;
            int temp = num[i];
            num[i] = num[t];
            num[t] = temp;
        }
        
        return num;
    }
    // Create a static void method called reverse which takes an array of ints
}