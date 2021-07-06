package thirdQuest.implementation;

public class Teacher{
    private final String nameTeacher;
    private final String surnameTeacher;
    private final int index;
    private static int newStudentIndex;


    public Teacher(String nameTeacher, String surnameTeacher){
        this.nameTeacher = nameTeacher;
        this.surnameTeacher = surnameTeacher;

        index = newStudentIndex;
        newStudentIndex++;
    }


    public String getNameTeacher() {
        return nameTeacher;
    }
    public String getSurnameTeacher() {
        return surnameTeacher;
    }

    public int getIndex() {
        return index;
    }
}
