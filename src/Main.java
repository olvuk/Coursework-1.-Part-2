public class Main {
    public static void findEmployeeWithSalaryMoreThan(Employee[] employees, int amount) {
        for (Employee e : employees) {
            if (e.getSalary() >= amount) {
                System.out.println("id = " + e.getId() + " ФИО: " + e.getName() + " Зарплата: " + e.getSalary() + " рублей.");
            }
        }
    }
    public static void findEmployeeWithSalaryLessThan(Employee[] employees, int amount) {
        for (Employee e : employees) {
            if (e.getSalary() < amount) {
                System.out.println("id = " + e.getId() + " ФИО: " + e.getName() + " Зарплата: " + e.getSalary() + " рублей.");
            }
        }
    }
    public static void printEmployeesInDepartment(Employee[] employees, int department) {
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                System.out.println("id = " + e.getId() + " ФИО: " + e.getName() + " Зарплата: " + e.getSalary() + " рублей.");
            }
        }
    }
    public static void increaseSalaryInDepartment(Employee[] employees, int index, int department) {
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                e.setSalary(e.getSalary() + e.getSalary() * index / 100);
            }
        }
    }
    public static double getAverageSalaryInDepartment(Employee[] employees, int department) {
        int count = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                count = count + 1;
            }
        }
        return calculateTotalSalaryInDepartment(employees, department) / count;
    }

    public static int calculateTotalSalaryInDepartment(Employee[] employees, int department) {
        int total = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                total = total + e.getSalary();
            }
        }
        return total;
    }
    public static Employee findEmployeeWithMaxSalaryInDepartment(Employee[] employees, int department) {
        Employee employeeWithMaxSalaryInDepartment = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && (employeeWithMaxSalaryInDepartment == null || employees[i].getSalary() > employeeWithMaxSalaryInDepartment.getSalary())) {
                employeeWithMaxSalaryInDepartment = employees[i];
            }
        }
        return employeeWithMaxSalaryInDepartment;
    }
    public static Employee findEmployeeWithMinSalaryInDepartment(Employee[] employees, int department) {
        Employee employeeWithMinSalaryInDepartment = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && (employeeWithMinSalaryInDepartment == null || employees[i].getSalary() < employeeWithMinSalaryInDepartment.getSalary())) {
                employeeWithMinSalaryInDepartment = employees[i];
            }
        }
        return employeeWithMinSalaryInDepartment;
    }
    public static void increaseSalary(Employee[] employees, int index) {
        for (Employee e : employees) {
            e.setSalary(e.getSalary() + e.getSalary() * index/100);
        }
    }
    public static void printNames(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
    public static double getAverageSalary(Employee[] employees) {
        return calculateTotalSalary(employees) / employees.length;
    }
    public static Employee getEmployeeWithMaxSalary (Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }
    public static Employee getEmployeeWithMinSalary (Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static int calculateTotalSalary(Employee[] employees) {
        int total = 0;
        for (Employee e : employees) {
            total = total + e.getSalary();
        }
        return total;
    }

    public static void main (String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Николева Наталья Сергеевна", 1, 36000);
        employees[1] = new Employee("Фёдорова Анна Петровна", 2, 45000);
        employees[2] = new Employee("Лецко Нина Александровна", 1, 40000);
        employees[3] = new Employee("Прус Алла Борисовна", 1, 56000);
        employees[4] = new Employee("Васильева Мария Александровна", 3, 55000);
        employees[5] = new Employee("Васильев Иван Николаевич", 4, 51000);
        employees[6] = new Employee("Ведлер Татьяна Николаевна", 5, 47000);
        employees[7] = new Employee("Ведлер Марина Николаевна", 5, 65000);
        employees[8] = new Employee("Петров Игорь Сергеевич", 1, 74000);
        employees[9] = new Employee("Найданов Сергей Васильевич", 3, 85000);

        printEmployees(employees);
        System.out.println();
        System.out.println("Сумма затрат на зарплату в месяц: " + calculateTotalSalary(employees) + " рублей.");
        System.out.println();
        System.out.println("Минимальная зарплата у сотрудника: " + getEmployeeWithMinSalary(employees));
        System.out.println();
        System.out.println("Максимальная зарплата у сотрудника: " + getEmployeeWithMaxSalary(employees));
        System.out.println();
        System.out.println("Средняя зарплата: " + getAverageSalary(employees) + " рублей.");
        System.out.println();
        printNames(employees);
        System.out.println();
        employees[5].setDepartment(2);
        employees[5].setSalary(63000);
        System.out.println(employees[5]);
        increaseSalary(employees, 10);
        printEmployees(employees);
        System.out.println("В отделе 2 минимальная зарплата у сотрудника: " + findEmployeeWithMinSalaryInDepartment(employees, 2));
        System.out.println("В отделе 5 максимальная зарплата у сотрудника: " + findEmployeeWithMaxSalaryInDepartment(employees, 5));
        System.out.println("В отделе 3 расходы на зарплату составляют: " + calculateTotalSalaryInDepartment(employees, 3) + " рублей.");
        System.out.println("В отделе 3 средняя зарплата составляет: " + getAverageSalaryInDepartment(employees, 3) + " рублей.");
        increaseSalaryInDepartment(employees,20, 3);
        System.out.println("В отделе 3 расходы на зарплату составляют: " + calculateTotalSalaryInDepartment(employees, 3) + " рублей.");
        System.out.println("Сотрудники отдела 1:");
        printEmployeesInDepartment(employees, 1);
        System.out.println("Сотрудники отдела 2:");
        printEmployeesInDepartment(employees, 2);
        System.out.println("Сотрудники отдела 3:");
        printEmployeesInDepartment(employees, 3);
        System.out.println("Сотрудники отдела 4:");
        printEmployeesInDepartment(employees, 4);
        System.out.println("Сотрудники отдела 5:");
        printEmployeesInDepartment(employees, 5);
        System.out.println("Сотрудники с зарплатой меньше 60000 рублей:");
        findEmployeeWithSalaryLessThan(employees,60000);
        System.out.println("Сотрудники с зарплатой больше 70000 рублей:");
        findEmployeeWithSalaryMoreThan(employees, 70000);
    }
}