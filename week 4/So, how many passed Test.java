public class Test
{
    public static int numberPasses(Student [] student){
        int omo = 0;
        for(int i = 0; i < student.length;i++){
            int grade = student[i].getMark();
            if(grade > 39){
                omo++;
            }
        }
        return omo;
    }
    // Add a static getBestSTudent method to this class. It should return a Student object.
}