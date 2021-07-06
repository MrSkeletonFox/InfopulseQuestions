package thirdQuest.implementation;

public class Curator {

    private final String nameCurator;
    private final String surnameCurator;
    private static final int newStudentIndex = 30;

    public Curator(String nameCurator, String surnameCurator){

        this.nameCurator = nameCurator;
        this.surnameCurator = surnameCurator;
    }

    public String getNameCurator() {
        return nameCurator;
    }
    public String getSurnameCurator() {
        return surnameCurator;
    }
    public int getIndex() {
        return newStudentIndex;
    }


}
