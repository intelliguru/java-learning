package com.intelliguru.javastreams.util;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        //1. Convert List<String> to Map<String, Integer>, where key = string and value = length.
        findLengthOfEachStringAsMap();

        //2. Find the frequency of each character in a string.
        characterFrequency();

        //3. Find the frequency of each word in a list
        litWordFrequency();

        //4. Find duplicate elements in a list.
        findDuplicateElements();

        //5. Find the first non-repeating character in a string
        firstNonRepeatingCharacter();

        //6. Find the first repeating character in a string
        firstRepeatingCharacter();

        //7. Find the second-highest distinct number in a list.
        secondHightNumerInList();

        //8. Find the longest string in a list.
        longestStringInAList();

        //9. Group a list of strings by their length.
        groupStringByLength();

        //10. Convert a list of strings to uppercase.
        convertToLowerCase();

        //11. Filter even numbers from a list.
        filterEvenNumers();


        //12. Remove duplicates from a list
        removeDuplicateNum();

        //13. Sort numbers in ascending and descending order.
        sortListAscendingAndDescending();

        //14. Convert a List<Employee> into Map<id, Employee>
        mapEmployeeAsPerId();

        //15. Find the maximum and minimum number using Streams
        findMinMax();

        //16. Group employees by department.
        groupeEmployeeyDepartment();

        //17. Find the highest-paid employee in each department
        findGighestPaidEmployeeInDepartment();

        //18. Find the average salary of employees by department
        findAverageSalaryOfEmployeesInEachDepartment();

        //19. Count Employees in Each Department
        findEmployeeCountInEachDepartment();

        //20. Find the Second-Highest Distinct Salary
        secondHighestDistinctSalary();

        //21. Partition numbers into even and odd using partitioningBy()
        partitionIntoOddEven();

        //22. Convert a nested List<List<Integer>> into a single list
        convertNestedListsIntoOne();

        //23. Find common elements between two lists
        commonElementsFromBothList();

        //24. Join Strings into a Comma-Separated String
        joinStringInAList();

        //25. Find the Sum and Average Using Java Streams
        findSumAndAvg();

        //26. Convert a Map into a filtered Map based on its values
        //Keep only employees whose salary is greater than ₹70,000.
        Map<String, Integer> employeeSalaries = Map.of(
                "Ram", 50000,
                "Shyam", 75000,
                "Mohan", 90000,
                "Sita", 60000,
                "Ravi", 85000
        );
        Map<String, Integer> filteredMap = employeeSalaries.entrySet().stream()
                .filter(i-> i.getValue() > 70000)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println("Filtered Map: "+ filteredMap);
    }

    private static void findSumAndAvg() {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        Integer sum = numbers.stream().reduce(Integer::sum).orElse(null);
        Double avg = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average: "+avg + "  | Sum: "+sum);
    }

    private static void joinStringInAList() {
        List<String> names = List.of("Ram", "Shyam", "Mohan", "Sita");
        String str = names.stream().collect(Collectors.joining(", "));
        System.out.println("String :" +str);
    }

    private static void commonElementsFromBothList() {
        List<Integer> list1 = List.of(10, 20, 30, 40, 50);
        List<Integer> list2 = List.of(30, 40, 50, 60, 70);

        List<Integer> commonNumList = list1.stream()
                .filter(num-> list2.contains(num))
                .toList();
        System.out.println("Common Elements in both the Lists: "+ commonNumList);
    }

    private static void convertNestedListsIntoOne() {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        List<Integer> numList = numbers.stream().flatMap(Collection::stream).toList();
        System.out.println("Single List: "+ numList);
    }

    private static void partitionIntoOddEven() {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);
        Map<Boolean, List<Integer>> oddEvenMap = numbers.stream()
                .collect(Collectors.partitioningBy(
                        number -> number % 2 == 0
                ));
        System.out.println("oddEvenMap : "+oddEvenMap);
    }

    private static void secondHighestDistinctSalary() {
        record Employee(int id,String name,String department,double salary) {}

        List<Employee> employees = List.of(
                new Employee(101, "Ram", "IT", 80000),
                new Employee(102, "Shyam", "HR", 60000),
                new Employee(103, "Mohan", "IT", 95000),
                new Employee(104, "Sita", "Finance", 90000),
                new Employee(105, "Ravi", "HR", 75000)
        );
        Double salary = employees.stream()
                .map(employee -> employee.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(null);
        System.out.println("Second Highest Distinct Salary: " + salary);
    }

    private static void findEmployeeCountInEachDepartment() {
        record Employee(int id,String name,String department,double salary) {}

        List<Employee> employees = List.of(
                new Employee(101, "Ram", "IT", 80000),
                new Employee(102, "Shyam", "HR", 60000),
                new Employee(103, "Mohan", "IT", 95000),
                new Employee(104, "Sita", "Finance", 90000),
                new Employee(105, "Ravi", "HR", 75000)
        );
        Map<String, Long> employeeCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.counting()
                ));
        System.out.println("Employee count in each Department: "+ employeeCount);
    }

    private static void findAverageSalaryOfEmployeesInEachDepartment() {
        record Employee(int id,String name,String department,double salary) {}

        List<Employee> employees = List.of(
                new Employee(101, "Ram", "IT", 80000),
                new Employee(102, "Shyam", "HR", 60000),
                new Employee(103, "Mohan", "IT", 95000),
                new Employee(104, "Sita", "Finance", 90000),
                new Employee(105, "Ravi", "HR", 75000)
        );
        Map<String, Double> evgSalInEachDep = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.averagingDouble(Employee::salary)
                ));
        System.out.println("Avg Salary of Employees In Department: "+ evgSalInEachDep);
    }

    private static void findGighestPaidEmployeeInDepartment() {
        record Employee(int id,String name,String department,double salary) {}

        List<Employee> employees = List.of(
                new Employee(101, "Ram", "IT", 80000),
                new Employee(102, "Shyam", "HR", 60000),
                new Employee(103, "Mohan", "IT", 95000),
                new Employee(104, "Sita", "Finance", 90000),
                new Employee(105, "Ravi", "HR", 75000)
        );

        Map<String, Optional<Employee>> highestPaidEmployee = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.maxBy(Comparator.comparingDouble(employee -> employee.salary))
                ));
        System.out.println("Highest Employee in Department: "+ highestPaidEmployee);
    }

    private static void groupeEmployeeyDepartment() {
        record Employee(int id, String name, String department) {}

        List<Employee> employees = List.of(
                new Employee(101, "Ram", "IT"),
                new Employee(102, "Shyam", "HR"),
                new Employee(103, "Mohan", "IT"),
                new Employee(104, "Sita", "Finance"),
                new Employee(105, "Ravi", "HR")
        );
        Map<String, List<Employee>> employeeGroupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department
                ));
        System.out.println("Department grouped Employee: "+ employeeGroupedByDepartment);
    }

    private static void findMinMax() {
        List<Integer> numbers = List.of(15, 5, 30, 10, 20, 5, 25);

        Integer max = numbers.stream()
                .max(Comparator.comparingInt(num -> num)).orElse(null);
//        Integer max1 = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .orElseThrow();


//        Integer max2 = numbers.stream()
//                .max(Integer::compareTo)
//                .orElse(null);


        Integer min = numbers.stream()
                .min(Comparator.comparingInt(num-> num)).orElse(null);
        System.out.println("Max : "+ max + "  Min:  "+ min);
    }

    private static void mapEmployeeAsPerId() {
        record Employee(int id, String name) {}

        List<Employee> employees = List.of(
                new Employee(101, "Ram"),
                new Employee(102, "Shyam"),
                new Employee(103, "Mohan"),
                new Employee(103, "Radha")
        );
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(
                                Employee::id,
                                emp-> emp,
                        (existing, replacement) -> replacement

                ));
        System.out.println("Mapped Employee as per Id: "+ employeeMap);
    }

    private static void sortListAscendingAndDescending() {
        List<Integer> numbers = List.of(15, 5, 30, 10, 20, 5, 25);
        List<Integer> ascendingOrderNums = numbers.stream()
                .sorted().toList();
        List<Integer> descendingOrderNums = numbers.stream()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println("Ascending: " + ascendingOrderNums + " | Descending: "+ descendingOrderNums);
    }

    private static void removeDuplicateNum() {
        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40);
        List<Integer> uniqueNumbersList = numbers.stream().distinct().toList();
        System.out.println("unique Numbers List: " + uniqueNumbersList);
    }

    private static void convertToLowerCase() {
        List<String> names = List.of("Ram", "Shyam", "Mohan");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println("10. Uppercase converted String List: " + upperCaseNames);
    }

    private static void filterEvenNumers() {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .toList();
        System.out.println("11. Even Numbers in the List are: " + evenNumbers);
    }

    private static void groupStringByLength() {
        List<String> names = List.of(
                "Ram", "Sam", "Shyam", "Mohan", "Raj"
        );

        Map<Integer, List<String>> sameLengthGroupString = names.stream()
                .collect(Collectors.groupingBy(
                        String::length
                ));
        System.out.println("09. String Length Map: "+ sameLengthGroupString);
    }

    private static void longestStringInAList() {
        List<String> names = List.of(
                "Ram", "Shyam", "Vishwanath", "Mohan"
        );

        String result = names.stream()
                .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("longest string in a list : "+ result);
    }

    private static void secondHightNumerInList() {
        List<Integer> numList = List.of(13, 1, 7, 29, 13, 6, 10);
        Integer result = numList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second highest number: " + result);
    }

    private static void firstRepeatingCharacter() {
        String str = "Swisstht";
        Character repeatingChar = str
                .toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(k -> k.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First repeating char: " + repeatingChar);
    }

    private static void firstNonRepeatingCharacter() {
        String str = "Swiss";
        Character result = str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(k -> k.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First non repeating char: " + result);
    }

    private static void findDuplicateElements() {
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 5, 6, 1);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateElements = numList.stream()
                .filter(n -> !seen.add(n))
                .toList();
        System.out.println("Duplicate Elements are: " + duplicateElements);
    }

    private static void litWordFrequency() {
        List<String> duplicateWordList = List.of("Krishna", "Mayank", "Krishna", "Seeta");
        Map<String, Long> wordFrequencyMap = duplicateWordList.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("wordFrequencyMap: " + wordFrequencyMap);
    }


    private static void characterFrequency() {
        String str = "Balkrishna";
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        charr -> charr,
                        Collectors.counting()
                ));
        System.out.println("frequencyMap: " + frequencyMap);
    }

    private static void findLengthOfEachStringAsMap() {
        List<String> nameList = List.of("Ram", "Mohan", "Geeta");

        Map<String, Integer> stringLengthMap = nameList.stream()
                .collect(Collectors.toMap(key -> key, String::length));
        System.out.println("stringLengthMap: " + stringLengthMap);
    }


}
