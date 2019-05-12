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
                "Office D", "Jon",  "Tare",
                "Office E", "Anna", "Marks"
        };


        Map<String, List<Person>> eMap = new TreeMap<>();

        for (int i = 0; i < employees.length; i += 3) {
            if (!eMap.containsKey(employees[i])) {
                eMap.put(employees[i], new ArrayList<>());
            }
            eMap.get(employees[i]).add(new Person(employees[i+1], employees[i+2]));
        }
        System.out.println(eMap);
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