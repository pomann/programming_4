public class Test
{
    public static void printHonours(Student [] student){
        for(int i = 0; i < student.length; i++){
            int s = student[i].getMark();
            if(s > 54){
                System.out.println(s + " (" + student[i].getName() + ")");
            }
        }
    }
    // Add a static printHonours method to this class.
}