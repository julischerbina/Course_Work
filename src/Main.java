public class Main {
    public static Employee[] employees = {
            new Employee("Сотрудник А", 1, 100),
            new Employee("Сотрудник Б", 1, 150),
            new Employee("Сотрудник В", 2, 200),
            new Employee("Сотрудник Г", 2, 250),
            new Employee("Сотрудник Д", 3, 300),
            new Employee("Сотрудник Е", 3, 350),
            new Employee("Сотрудник Ж", 4, 400),
            new Employee("Сотрудник З", 4, 450),
            new Employee("Сотрудник И", 5, 500),
            new Employee("Сотрудник Й", 5, 550),
    };
    public static void main(String[] args) {
        printEmployees();
        System.out.println("Общая сумма затрат на зарплату в месяц составляет: " + calculateSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary());
        System.out.println("Среднее значение зарплат составляет: " + averageSalary());
        ptintFullNames();
           }
    public static void printEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    public static double calculateSalary() {
        double sum = 0;
        for (Employee emp : employees) {
            sum += emp.getSalary();
        }
        return sum;
    }

    public static String minSalary() {
        String result = employees[0].getFullName();
        double minSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                result = emp.getFullName();
            }
        }
        return result;
    }
    public static String maxSalary() {
        String result = employees[0].getFullName();
        double maxSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                result = emp.getFullName();
            }
        }
        return result;
    }
    public static double averageSalary() {
        return calculateSalary() / (float) employees.length;
    }
    public static void ptintFullNames() {
        for (Employee emp : employees) {
            System.out.println(emp.getFullName());
        }
    }
  }

