public class Test
{
    public static void printForties(Student [] student){
        for(int i = 0; i < student.length; i++){
            int s = student[i].getMark();
            if(s > 39 && s < 50){
                System.out.println(s + " (" + student[i].getName() + ")");
            }
        }
    }
    // Add a static printHonours method to this class.
}