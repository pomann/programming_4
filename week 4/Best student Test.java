public class Test
{
    public static Student getBestStudent(Student [] student){
        int grade = 0;
        Student name = new Student("b",9);
        for(int i = 0; i< student.length;i++){
            int g = student[i].getMark();
            if(g > grade){
                grade = g;
                name = student[i];
            }
        }
        return name;
    }
    // Add a static getBestSTudent method to this class. It should return a Student object.
}