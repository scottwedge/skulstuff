package Model;

public class Professor implements Participants {

    private String name;
    private String surname;
    private boolean hasPresentedSomething;

    public Professor(String name, String surname, boolean hasPresentedSomething){this.surname=surname; this.name=name; this.hasPresentedSomething=hasPresentedSomething;}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setHasPresentedSomething(boolean hasPresentedSomething) {
        this.hasPresentedSomething = hasPresentedSomething;
    }


    @Override
    public boolean HadPresentedSomething() {
        return this.hasPresentedSomething;
    }

    @Override
    public String StringToString()
    {
        String res="";
        res="Student Name: "+this.name+", Student surname: "+this.surname;
        if (hasPresentedSomething)
            res+=" And he has presented something!:)";
        else
            res+=" And he has not presented something!:/";
        return res;

    }
}
