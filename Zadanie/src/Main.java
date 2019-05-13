import java.util.*;

public class Main {
    public static void main (String[] args) {

        String[] employees = {
                "Office A", "John", "Doe",
                "Office B", "John", "Brown",
                "Office C", "Mary", "Jones",
                "Office B", "Adam", "Rust",
                "Office C", "Cindy", "Frost",
                "Office A", "Kate", "Coe",
                "Office A", "Bill", "Brown",
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

        biggestOffice(eMap);
    }

    public static void biggestOffice (Map<String, List<Person>> eMap) {
        int mostEmployees = 0;
        String officeName = "";
        for (String e : eMap.keySet()) {
            if (eMap.get(e).size() > mostEmployees){
                mostEmployees = eMap.get(e).size();
                officeName = e;
            }
        }

        System.out.println(officeName + " has the biggest amount (" + mostEmployees + ") of employees");
    }

}