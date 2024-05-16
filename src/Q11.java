class Employees{
    int id;
    int salary;
    String name;
    void setSalary(int s){
        this.salary = s;
    }
    int getSalary(){
        return  salary;
    }
    void setName(String S1){
        this.name = S1;
    }
    String getName(){
        return  name;
    }
    void setId(int id){
        this.id = id;
    }
    int getId() {
        return id;
    }
}
public class Q11 {
    public static void main(String[] args) {
         Employees Keshav = new Employees();
         Keshav.setId(23);
         Keshav.setName("Wipro");
         Keshav.setSalary(25000);
         Employees Lalit = new Employees();
         Lalit.setId(12);
         Lalit.setSalary(45000);
         Lalit.setName("Wipro");
        System.out.println(Lalit.getSalary());
        System.out.println(Keshav.getSalary());
    }

}
