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


//        Получить ФИО сотрудников
        book.getFioEmployee();
//        Получить полный список всех сотрудников
        book.printEmployeeList();
//        Получить сумму зарплат всех сотрудников за месяц
        book.getAmountSalaryPerMonth();
//        Получить сумму средней зарплаты сотрудников за месяц
        book.getAverageSalary();
//        Максимальная зарплата сотрудника
        book.getMaximumSalary();
//        Минимальная зарплата сотрудника
        book.getMinimumSalary();

//         №1

//        Увеличить зарпалту всех сотрудников на процент
        book.increaseSalaryByPercentage(4.5);

//        № 2

//         Получить минимальную ЗП по отделу
        book.getDepartmentInfoByMinimumSalary(1);
//         Получить максимальную ЗП по отделу
        book.getDepartmentInfoByMaximumSalary(1);
//         Сумма затрат на зарплату по отделу
        book.getDepartmentInfoByAmountSalaryPerMonth(5);
//         Сумма средней ЗП по отделу
        book.getDepartmentInfoByAverageSalary(1);
//         Индексация ЗП отдела на процент
        book.getDepartmentInfoAfterIncreaseSalaryByPercentage(1, 10);
//         Печать всех сотрудников отдела
        book.printDepartmentInfoList(1);

//         № 3

//          Все сотрудники с зарплатой меньше числа
        book.findAllEmployeesLessThanSalary(20000);
//          Все сотрудники с зарплатой больше числа
        book.findAllEmployeesGreaterThanSalary(20000);

//        Удаляем сотрудника по ФИО или ID
        book.removeEmployee(3);
//        Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись)
        book.changeEmployeeByFio("Телепнев Евгений Сергеевич", 1_000_000, 1);
//        Получить Ф. И. О. всех сотрудников по отделам
        book.getFioEmployeesByDepartment(1);
    }

    // Добавлю тут ченить для отправки "длжлыажыалж
}

