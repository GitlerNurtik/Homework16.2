public class Programmer extends Person{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setDesignation(String designation) {
        super.setDesignation(designation);
    }
    private String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
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

    public Programmer(String companyName) {
        CompanyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer" +
                "Name: " + getName() + "\n"+
                "Designation: "+ getDesignation() + "\n"+
                "Name Company : "+ getCompanyName()+ "\n";
    }

    public void coding(){

    }
}
