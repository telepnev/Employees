public class MainEmployee {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployee("Евгений", "Сергеевич", "Телепнев", 2, 167000);
        book.addEmployee("Петр", "Сергеевич", "Сидоров", 1, 10000);
        book.addEmployee("Сергей", "Петрович", "Петров", 3, 32000);
        book.addEmployee("Анна", "Константиович", "Иванов", 5, 43000);
        book.addEmployee("Ольга", "Иванович", "Попов", 4, 33000);
        book.addEmployee("Константин", "Петрович", "Синицын", 1, 13000);
        book.addEmployee("Татьяна", "Евгеньевич", "Голицын", 1, 38000);
        book.addEmployee("Афанасий", "Сергеевич", "Теплицин", 2, 31000);
        book.addEmployee("Дмитрий", "Дмитрьевич", "Афанасьев", 5, 14000);


        System.out.println(" Получить ФИО сотрудников");
        book.getFioEmployee();
        System.out.println("_______________________");

        System.out.println("Получить полный список всех сотрудников");
        book.printEmployeeList();
        System.out.println("_______________________");

        System.out.println("Получить сумму зарплат всех сотрудников за месяц");
        book.getAmountSalaryPerMonth();
        System.out.println("_______________________");

        System.out.println("Получить сумму средней зарплаты сотрудников за месяц");
        book.getAverageSalary();
        System.out.println("_______________________");

        System.out.println("Максимальная зарплата сотрудника");
        book.getMaximumSalary();
        System.out.println("_______________________");

        System.out.println("Минимальная зарплата сотрудника");
        book.getMinimumSalary();
        System.out.println("_______________________");

//         №1

        System.out.println("Увеличить зарпалту всех сотрудников на процент");
        book.increaseSalaryByPercentage(5);
        System.out.println("_______________________");

//        № 2

        System.out.println("Получить минимальную ЗП по отделу");
        book.getDepartmentInfoByMinimumSalary(1);
        System.out.println("_______________________");

        System.out.println("Получить максимальную ЗП по отделу");
        book.getDepartmentInfoByMaximumSalary(1);
        System.out.println("_______________________");

        System.out.println("Сумма затрат на зарплату по отделу");
        book.getDepartmentInfoByAmountSalaryPerMonth(5);
        System.out.println("_______________________");

        System.out.println("Сумма средней ЗП по отделу");
        book.getAverageSalaryByDepartment(1);
        System.out.println("_______________________");

        System.out.println("Индексация ЗП отдела на процент");
        book.getDepartmentInfoAfterIncreaseSalaryByPercentage(2, 10);
        System.out.println("_______________________");

        System.out.println("Печать всех сотрудников отдела");
        book.printDepartmentInfoList(2);
        System.out.println("_______________________");

//         № 3

        System.out.println("Все сотрудники с зарплатой меньше числа");
        book.findAllEmployeesLessThanSalary(20000);
        System.out.println("_______________________");

        System.out.println("Все сотрудники с зарплатой больше числа");
        book.findAllEmployeesGreaterThanSalary(20000);
        System.out.println("_______________________");

        System.out.println("Удаляем сотрудника по ФИО или ID");
        book.removeEmployee(3);
        System.out.println("_______________________");


        System.out.println("Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись)");
        book.changeEmployeeByFio("Телепнев Евгений Сергеевич", 1_000_000, 1);
        System.out.println("_______________________");

        System.out.println("Получить Ф. И. О. всех сотрудников по отделам");
        book.getFioEmployeesByDepartment(1);
        System.out.println("_______________________");
   }

}

