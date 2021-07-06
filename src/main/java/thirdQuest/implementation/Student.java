package thirdQuest.implementation;

public class Student{
    private final String nameStudent;
    private final String surnameStudent;
    private final int index;
    private static int newStudentIndex;

    public Student(String nameStudent, String surnameStudent){
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;

        this.index = newStudentIndex;
        newStudentIndex++;
    }

    public String getNameStudent() {
        return nameStudent;
    }
    public String getSurnameStudent() {
        return surnameStudent;
    }
    public int getIndex() {
        return index;
    }
}
