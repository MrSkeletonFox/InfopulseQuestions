package thirdQuest.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Group  {
    private final String nameGroup;
    private boolean activity = false;
    private int index = 0;
    private final int specialtyCode;
    private Map<Integer, String> StudentsAndCurator = new HashMap<Integer, String>();
    private Map<Integer, String> Subjects = new HashMap<Integer, String>();


    public Group(String nameGroup, int specialtyCode) {
        this.nameGroup = nameGroup;
        this.specialtyCode = specialtyCode;

    }


    public void addStudentToGroup(int i, String nameStudent) {

        if(this.index < 30) {
            StudentsAndCurator.put(i, nameStudent);

            this.index++;
            if (this.index > 5) this.activity = true;
            //Negative activity means that Group can't function
        }
    }

    public void deleteStudentFromGroup(int i, String nameStudent) {
        if(StudentsAndCurator.get(i).equals(nameStudent)) {
            StudentsAndCurator.remove(i, nameStudent);

            this.index--;
            if (this.index < 6) this.activity = false;
            //Negative activity means that Group can't function

        }
    }
    public void addCuratorToGroup(int i, String nameCurator) {

        try {
            StudentsAndCurator.get(30).equals("NullPointerException");
        } catch (NullPointerException e) {
            if(i == 30){
                StudentsAndCurator.put(i, nameCurator);
            }
        }

    }

    public void deleteCuratorFromGroup(int i, String nameCurator) {
        if(StudentsAndCurator.get(i).equals(nameCurator)) {
            StudentsAndCurator.remove(i, nameCurator);
        }
    }

    public void showStudentOfGroup() {

        Collection<String> values = StudentsAndCurator.values();
        System.out.println(values);
    }

    public void addSubjectToGroup(int i, String nameSubject) {
            Subjects.put(i, nameSubject);
    }

    public void deleteSubjectFromGroup(int i, String nameSubject) {
        if(Subjects.get(i).equals(nameSubject)) {
            Subjects.remove(i, nameSubject);
        }
    }

    public void showSubjectOfGroup() {

        Collection<String> values = Subjects.values();
        System.out.println(values);
    }

    public int getSpecialtyCode() {
        return specialtyCode;
    }

    public String getNameGroup() {
        return nameGroup;
    }
}
