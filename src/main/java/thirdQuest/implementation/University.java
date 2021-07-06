package thirdQuest.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class University {

    private final String nameUniversity;

    private Map<Integer, String> SubjectsOfUniversity = new HashMap<Integer, String>();
    private Map<Integer, String> FacultyOfUniversity = new HashMap<Integer, String>();

    public University(String nameUniversity){
        this.nameUniversity = nameUniversity;

    }


    public void addSubjectToUniversity(int i, String nameSubjects) {
        SubjectsOfUniversity.put(i, nameSubjects);


    }


    public void deleteSubjectFromUniversity(int i, String nameSubjects) {
        if(SubjectsOfUniversity.get(i).equals(nameSubjects)) {
            SubjectsOfUniversity.remove(i, nameSubjects);


        }
    }

    public void showSubjectsOfUniversity() {

        Collection<String> values = SubjectsOfUniversity.values();
        System.out.println(values);
    }


    public void addFacultyToUniversity(int i, String nameSubjects) {
        FacultyOfUniversity.put(i, nameSubjects);


    }


    public void deleteFacultyFromUniversity(int i, String nameSubjects) {
        if(FacultyOfUniversity.get(i).equals(nameSubjects)) {
            FacultyOfUniversity.remove(i, nameSubjects);


        }
    }


    public void showFacultysOfUniversity() {

        Collection<String> values = FacultyOfUniversity.values();
        System.out.println(values);
    }

}

