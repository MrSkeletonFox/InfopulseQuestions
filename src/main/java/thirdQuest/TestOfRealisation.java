package thirdQuest;

import thirdQuest.implementation.*;

public class TestOfRealisation {

    public static void main(String[] args) {
        University DIIT = new University("DIIT");


        Group Group933 = new Group("KC1711", 111);

        Student Georg = new Student("Georg", "Georg");
        Student Gorg   = new Student("Gorg", "Gorg");
        Student Gerg  = new Student("Gerg", "Gerg");
        Student Geor  = new Student("Geor", "Geor");
        Student Geog  = new Student("Geog", "Geog");
        Student Georrg = new Student("Georrg", "Georrg");
        Student Georgg = new Student("Georgg", "Georgg");


        Curator Curator = new Curator("Curator", "Curator");
        Curator CuratorFake = new Curator("CuratorFake", "CuratorFake");


        Group933.addStudentToGroup(Georg.getIndex(), Georg.getNameStudent());
        Group933.addStudentToGroup(Gorg.getIndex(), Gorg.getNameStudent());
        Group933.addStudentToGroup(Gerg.getIndex(), Gerg.getNameStudent());
        Group933.addStudentToGroup(Geor.getIndex(), Geor.getNameStudent());
        Group933.addStudentToGroup(Geog.getIndex(), Geog.getNameStudent());
        Group933.addStudentToGroup(Georrg.getIndex(), Georrg.getNameStudent());
        Group933.addStudentToGroup(Georgg.getIndex(), Georgg.getNameStudent());


        Group933.addCuratorToGroup(Curator.getIndex(), Curator.getNameCurator());
        Group933.addCuratorToGroup(CuratorFake.getIndex(), CuratorFake.getNameCurator());



        Group933.showStudentOfGroup();

        Group933.deleteCuratorFromGroup(Curator.getIndex(), Curator.getNameCurator());
        Group933.deleteStudentFromGroup(Geog.getIndex(), Geog.getNameStudent());
        Group933.showStudentOfGroup();



        Subject Subject = new Subject("Subject");
        Subject Subject1 = new Subject("Subject1");
        Subject Subject2 = new Subject("Subject2");
        Subject Subject3 = new Subject("Subject3");
        Subject Subject4 = new Subject("Subject4");


        Group933.addSubjectToGroup(Subject.getIndex(), Subject.getNameSubject());
        Group933.addSubjectToGroup(Subject1.getIndex(), Subject1.getNameSubject());
        Group933.addSubjectToGroup(Subject2.getIndex(), Subject2.getNameSubject());
        Group933.addSubjectToGroup(Subject3.getIndex(), Subject3.getNameSubject());
        Group933.addSubjectToGroup(Subject4.getIndex(), Subject4.getNameSubject());

        Group933.showSubjectOfGroup();

        Group933.deleteSubjectFromGroup(Subject2.getIndex(), Subject2.getNameSubject());
        Group933.showSubjectOfGroup();

        Department DepartmentKIT = new Department("KIT", 10001);
        DepartmentKIT.addGroupToDepartment(Group933.getSpecialtyCode(), Group933.getNameGroup());


        Teacher Teacher = new Teacher("Teacher", "Teacher");
        Teacher Teacher1 = new Teacher("Teacher1", "Teacher1");
        Teacher Teacher2 = new Teacher("Teacher2", "Teacher2");
        Teacher Teacher3 = new Teacher("Teacher3", "Teacher3");

        DepartmentKIT.addTecherToDepartment(Teacher.getIndex(), Teacher.getNameTeacher());
        DepartmentKIT.addTecherToDepartment(Teacher1.getIndex(), Teacher1.getNameTeacher());
        DepartmentKIT.addTecherToDepartment(Teacher2.getIndex(), Teacher2.getNameTeacher());
        DepartmentKIT.addTecherToDepartment(Teacher3.getIndex(), Teacher3.getNameTeacher());

        Faculty FacuktyIT = new Faculty("IT", 22001);
        FacuktyIT.addDepartmentToFaculty(DepartmentKIT.getDepartmentCode(), DepartmentKIT.getNameDepartment());
        System.out.println("Activity is " + FacuktyIT.isActivity());
    }


}
