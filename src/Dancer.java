public class Dancer extends Person {
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    private String GroupName;

    @Override
    public void setDesignation(String designation) {
        super.setDesignation(designation);
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
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

    public Dancer(String groupName) {
        GroupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer" +
                "Name: " + getName() + "\n"+
                "Designation: "+ getDesignation() + "\n"+
                "Group Name : "+ getGroupName()+ "\n";
    }

    public void dancing(){

    }
}
