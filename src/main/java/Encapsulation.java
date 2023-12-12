public class Encapsulation {
    
    private String name;
    private long empID;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public long getEmpID() {
        return empID;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("X");
        obj.setEmpID(007);
        System.out.println("Name is: " + obj.getName());
        System.out.println("Emp ID is: " + obj.getEmpID());
    }
}
