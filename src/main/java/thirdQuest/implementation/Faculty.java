package thirdQuest.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Faculty  {
    private String nameFaculty;
    private boolean activity = false;
    private int index = 0 ;
    private final int facultyCode;
    private Map<Integer, String> DepartmentsOfFaculty = new HashMap<Integer, String>();

    public Faculty(String nameFaculty, int facultyCode){
        this.nameFaculty = nameFaculty;
        this.facultyCode = facultyCode;
    }


    public void addDepartmentToFaculty(int i, String nameDepartment) {

        DepartmentsOfFaculty.put(i, nameDepartment);

        this.index++;
        if (this.index >= 1) this.activity = true;
        //Negative activity means that Faculty can't function

    }


    public void deleteDepartmentFromFaculty(int i, String nameDepartment) {
        if(DepartmentsOfFaculty.get(i).equals(nameDepartment)) {
            DepartmentsOfFaculty.remove(i, nameDepartment);

            this.index--;
            if (this.index < 1) this.activity = false;
            //Negative activity means that Faculty can't function
        }
    }

    public void showDepartmentOfFaculty() {

        Collection<String> values = DepartmentsOfFaculty.values();
        System.out.println(values);
    }

    public int getFacultyCode() {
        return facultyCode;
    }

    public boolean isActivity() {
        return activity;
    }
}
