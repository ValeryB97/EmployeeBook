public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Борисов Алексей Владимирович", 1, 136831);
        employees[1] = new Employee("Галицкий Иван Михайлович", 2, 98329);
        employees[2] = new Employee("Еременко Олег Владимирович", 2, 103210);
        employees[3] = new Employee("Петрова Дарья Павловна", 5, 76721);
        employees[4] = new Employee("Петухов Алексей Викторович", 3, 87321);
        employees[5] = new Employee("Букреева Ольга Андреевна", 2, 128092);
        employees[6] = new Employee("Ворошнина Наталья Сергеевна", 4, 82201);
        employees[7] = new Employee("Шахов Георгий Евгеньевич", 1, 140629);
        employees[8] = new Employee("Ярмольчик Юлия Андреевна", 3, 69878);
        employees[9] = new Employee("Бабарыко Валерий Владимирович", 5, 158393);

        allWorker();
        monthSalary();
        averageSalary();
        maxSalary();
        minSalary();
        fullName();
    }

    public static void allWorker() {
        // Получаем список всех сотрудников со всеми значениями
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void monthSalary() {
        // Затраты на ЗП в месяц
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary = sumSalary + employee.getSalary();
        }
        System.out.println("Затраты на ЗП в месяц - " + sumSalary + " рублей");
    }

    public static void averageSalary() {
        // Среднее значение зарплаты
        int averageSalary = 0;
        for (Employee employee : employees) {
            averageSalary = averageSalary + employee.getSalary();
        }
        System.out.println("Средние затраты ЗП за месяц - " + averageSalary / employees.length + " рублей");
    }

    public static void minSalary() {
        // Сотрудник с минимальной зарплатой
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет - " + minSalary + " рублей");
    }

    public static void maxSalary() {
        // Сотрудник с максимальной зарплатой
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет - " + maxSalary + " рублей");
    }

    public static void fullName() {
        // Распечатать ИФО всех сотрудников
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}