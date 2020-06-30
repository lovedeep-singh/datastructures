public class Record {
    Employee emp;  // employee class has name, title and age and tostring method overidden
    boolean active;
    public static void main(String args[])

    {

        Record r=new Record();
        r.emp=new Employee();


      r.active=true;
      r.emp.name= "Arun";
      r.emp.title="Manager";
      r.emp.age=28;
      System.out.println(r);
    }
    @Override
    public String toString() {
        return "Record{"+"active= "+ active + emp +" }";
    }
}
