package thirdQuest.implementation;

public class Subject{

    private final String nameSubject;
    private final int index;
    private static int newSubjectIndex;



    public Subject(String nameSubject){
        this.nameSubject = nameSubject;

        this.index = newSubjectIndex;
        newSubjectIndex++;


    }
    public String getNameSubject() {
        return nameSubject;
    }
    public int getIndex() {
        return index;
    }

}
