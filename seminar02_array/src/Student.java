import java.util.Arrays;
import java.util.Objects;

public class Student implements Cloneable {
    private String studentName;
    private short[] marks;
    private float averageMark;

    public Student(String studentName, short[] marks) {
        this.studentName = studentName;
        this.marks = marks;
        this.getAverageMark();
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public short[] getMarks() {
        return this.marks;
    }

    public void setMarks(short[] marks) {
        this.marks = marks;
        this.getAverageMark();
    }

    public float getAverageMark() {
        float result = 0.0F;

        for(int i = 0; i < this.marks.length; ++i) {
            result += (float)this.marks[i];
        }

        result /= (float)this.marks.length;
        this.averageMark = result;
        return this.averageMark;
    }

    public String toString() {
        String var10000 = this.studentName;
        return "Student{studentName='" + var10000 + "', marks=" + Arrays.toString(this.marks) + ", averageMark=" + this.averageMark + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        } else {
            Student other = (Student)o;
            if (!this.studentName.equals(other.getStudentName())) {
                return false;
            } else if (!Arrays.equals(this.marks, other.marks)) {
                return false;
            } else {
                return Float.floatToIntBits(this.averageMark) == Float.floatToIntBits(other.averageMark);
            }
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.studentName, Arrays.hashCode(this.marks), this.averageMark});
    }

    public Student clone() {
        try {
            Student clone = (Student)super.clone();
            clone.setMarks((short[])this.marks.clone());
            return clone;
        } catch (CloneNotSupportedException var2) {
            throw new AssertionError();
        }
    }
}