package feuchtwanger.presidents;

public class Presidents {

    private int number;
    private String president;
    private int birthYear; //A bad way to solve this is @ SerializableName("birth_year"), which goes
    //before it.
    private Integer deathYear; //Because the death year can be null, and a primitive type cannot
                                //be null
    private String tookOffice;
    private String leftOffice;
    private String party;

    public String getPresident(){
        return president;
    }
    public int getNumber() {
        return number;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public String getTookOffice() {
        return tookOffice;
    }

    public String getLeftOffice() {
        return leftOffice;
    }

    public String getParty() {
        return party;
    }
}
