public class ProgMainArrays
{
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("S1", new short[]
                {3, 5, 8, 10});
        students[1] = new Student("S2", new short[]
                {3, 5, 8, 1});
        students[2] = new Student("S3", new short[]
                {3, 2, 4, 4});
        students[3] = new Student("S3", new short[]
                {3, 2, 4, 4});
        students[4] = students[3].clone();
        students[4].setStudentName("55");
        students[4].setMarks(new short[]{10, 10, 10});

        System.out.println(students[3]);
        System.out.println(students[4]);
        //for(int i = 0; i < student.length; i++)
//        for(Student s: students){
//            System.out.println(s);
//        }
//
//        float sum = 0;
//        for(Student s : students){
//            sum =+ s.getAverageMark();
//        }
//
//        System.out.println("Student at index 2 equals" +
//                "student at index 3: " +(students[2] == students[3]) );
//
//        System.out.println("Student at index 2 equals" +
//                "student at index 3: " + students[2].equals(students[3]));
//

    }

}
