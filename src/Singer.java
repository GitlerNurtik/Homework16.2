public class Singer extends Person{
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    private String BandName;

    public String getBandName() {
        return BandName;
    }

    public void setBandName(String bandName) {
        BandName = bandName;
    }

    @Override
    public void setDesignation(String designation) {
        super.setDesignation(designation);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesignation() {
        return super.getDesignation();
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void singing(){}

    public Singer(String bandName) {
        BandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer" +
                "Name: " + getName() + "\n"+
                "Designation: "+ getDesignation() + "\n"+
                "Band Name : "+ getBandName()+ "\n";
    }

    public void playGuitar(){}
}
