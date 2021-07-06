package thirdQuest.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Department {

    private final String nameDepartment;
    private boolean activity = false;
    private int[] index = {0, 0};
    private final int departmentCode;
    private Map<Integer, String> GroupsOfDepartment = new HashMap<Integer, String>();
    private Map<Integer, String> Techers = new HashMap<Integer, String>();


    public Department(String nameDepartment, int departmentCode) {
        this.nameDepartment = nameDepartment;
        this.departmentCode = departmentCode;

    }


    public void addGroupToDepartment(int i, String nameGroup) {

        GroupsOfDepartment.put(i, nameGroup);

        this.index[0]++;
        if (this.index[0] >= 1 & this.index[1] >= 2) this.activity = true;
        //Negative activity means that Department can't function

    }


    public void deleteGroupFromDepartment(int i, String nameGroup) {
        if(GroupsOfDepartment.get(i).equals(nameGroup)) {
            GroupsOfDepartment.remove(i, nameGroup);

            this.index[0]--;
            if (this.index[0] < 1 & this.index[1] < 3) this.activity = false;
            //Negative activity means that Department can't function
        }
    }


    public void showGroupsOfDepartment() {

        Collection<String> values = GroupsOfDepartment.values();
        System.out.println(values);
    }

    public void addTecherToDepartment(int i, String nameStudent) {


        Techers.put(i, nameStudent);
        this.index[1]++;
        if (this.index[0] >= 1 & this.index[1] >= 3) this.activity = true;

    }

    public void deleteTecherFromDepartment(int i, String nameStudent) {
        if(Techers.get(i).equals(nameStudent)) {
            Techers.remove(i, nameStudent);
            this.index[1]--;
        }
    }

    public void showTecherOfDepartment() {

        Collection<String> values = Techers.values();

        if (this.index[0] < 1 & this.index[1] < 3) this.activity = false;
        System.out.println(values);
    }


    public int getDepartmentCode() {
        return departmentCode;
    }

    public boolean isActivity() {
        return activity;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }
}
