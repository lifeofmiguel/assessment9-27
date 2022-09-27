public class ShopApp {
    private Clothing clothes;
    private Customer customer;
    private Person person;
    private HourlyEmployee hrEmp;
    private Manager mgr;
    private Employee emp;

    public ShopApp(Clothing clothes, Customer customer, Person person, HourlyEmployee hrEmp, Manager mgr, Employee emp) {
        this.clothes = clothes;
        this.customer = customer;
        this.person = person;
        this.hrEmp = hrEmp;
        this.mgr = mgr;
        this.emp = emp;
    }

    public Clothing getClothes() {
        return clothes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Person getPerson() {
        return person;
    }

    public HourlyEmployee getHrEmp() {
        return hrEmp;
    }

    public Manager getMgr() {
        return mgr;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setClothes(Clothing clothes) {
        this.clothes = clothes;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setHrEmp(HourlyEmployee hrEmp) {
        this.hrEmp = hrEmp;
    }

    public void setMgr(Manager mgr) {
        this.mgr = mgr;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "ShopApp{" +
                "clothes=" + clothes +
                ", customer=" + customer +
                ", person=" + person +
                ", hrEmp=" + hrEmp +
                ", mgr=" + mgr +
                ", emp=" + emp +
                '}';
    }
}
