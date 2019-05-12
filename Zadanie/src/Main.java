import java.util.*;

public class Main {
    public static void main (String[] args) {

        String[] employees = {
                "office A", "John", "Doe",
                "office B", "John", "Brown",
                "office C", "Mary", "Jones",
                "office B", "Adam", "Rust",
                "office C", "Cindy", "Frost",
                "office A", "Kate", "Coe",
                "office A", "Bill", "Brown",
        };

        List<Person> officeAEmployees = new ArrayList();
        List<Person> officeBEmployees = new ArrayList();
        List<Person> officeCEmployees = new ArrayList();

        for (int i = 0; i < employees.length; i += 3) {
            if (employees[i].contains("office A")) {
                officeAEmployees.add(new Person (employees[i+1], employees[i+2]));
            }
            if (employees[i].contains("office B")) {
                officeBEmployees.add(new Person (employees[i+1], employees[i+2]));
            }
            if (employees[i].contains("office C")) {
                officeCEmployees.add(new Person (employees[i+1], employees[i+2]));
            }
        }

        Map<String, List<Person>> employeesMap = new TreeMap<>();
        for (int i = 0; i < employeesMap.size(); )
        employeesMap.put("office A", officeAEmployees);
        employeesMap.put("office B", officeBEmployees);
        employeesMap.put("office C", officeCEmployees);

        System.out.println(employeesMap);

        biggestOffice(officeAEmployees, officeBEmployees, officeCEmployees);
    }

    public static void biggestOffice (
            List<Person> officeAEmployees,
            List<Person> officeBEmployees,
            List<Person> officeCEmployees) {
        if (officeAEmployees.size() > officeBEmployees.size() && officeAEmployees.size() > officeCEmployees.size()) {
            System.out.println("office A: " + officeAEmployees.size() + " users");
        } else if (officeBEmployees.size() > officeCEmployees.size()) {
            System.out.println("office B: " + officeBEmployees.size() + " users");
        } else {
            System.out.println("office C: " + officeCEmployees.size() + " users");
        }
    }
}