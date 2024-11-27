public class Main {
    public static int counterID = 0;


    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[counterID] = new Employee("Иванов", "Иван", "Денисович", 4, 40_000);
        employees[counterID] = new Employee("Савельев", "Борис", "Владимирович", 1, 100_000);
        employees[counterID] = new Employee("Сергеев", "Денис", "Владимирович", 1, 80_000);
        employees[counterID] = new Employee("Турганова", "Елена", "Юрьевна", 2, 50_000);
        employees[counterID] = new Employee("Ульянова", "Тамара", "Сергеевна", 2, 50_000);
        employees[counterID] = new Employee("Тарасова", "Евгения", "Владиславовна", 3, 40_000);
        employees[counterID] = new Employee("Сиренин", "Сергей", "Сергеевич", 5, 60_000);
        employees[counterID] = new Employee("Камышов", "Иван", "Иванович", 5, 37_000);
        employees[counterID] = new Employee("Попов", "Николай", "Потапович", 3, 40_000);
        employees[counterID] = new Employee("Попов", "Виталий", "Артемьевич", 5, 45_000);

//        getList(employees);
//        System.out.println(calculateSalaries(employees));
//        System.out.println(minSalary(employees));
//        System.out.println(getAverageSalary(employees));
//        printNames(employees);
    }

    public static void getList(Employee[] employees) {
        for (Employee person : employees) {
            System.out.println(person.toString());
        }
    }

    public static int calculateSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee person : employees) {
            sum += person.getSalary();
        }
        return sum;
    }

    public static int minSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (Employee person : employees) {
            if (person.getSalary() < min) {
                min = person.getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (Employee person : employees) {
            if (person.getSalary() > max) {
                max = person.getSalary();
            }
        }
        return max;
    }

    public static int getAverageSalary(Employee[] employees) {
        return calculateSalaries(employees) / employees.length;
    }

    public static void printNames(Employee[] employees) {
        for (Employee person : employees) {
            System.out.printf("%s %s %s\n", person.getLastName(), person.getFirstName(), person.getMiddleName());

        }
    }


}