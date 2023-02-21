public class EmployeeBook {
    private final Employee[] employees;
    private int size;



    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String firstName, String midleName, String lastName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, наш отдел не резиновый !!!");
        }
        Employee newEmployee = new Employee(firstName, midleName, lastName, department, salary);
        employees[size++] = newEmployee;
    }

    public String printFioEmployee() {
        String fio = null;
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println("Фамилия : " + empl.getLastName() + ", Имя : " + empl.getFirstName() + ", Отчество : " + empl.getMidleName());
            }
        }
        return fio;
    }

    public void printEmployeeList() {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
    }

    public void getAmountSalaryPerMonth() {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getSalary();
            }
        }
        System.out.println("Сумма зарплат всех сотрудников за месяц состовляет =  " + sum);
    }

    public void getAverageSalary() {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getSalary() / getSize();
            }
        }
        System.out.println("Средняя зарплата сотрудников за месяц состовляет =  " + sum);
    }

    private int getSize() {
        int size = 0;
        for (Employee epl : employees) {
            if (epl != null) {
                size++;
            }
        }
        return size;
    }

    public void getMaximumSalary() {
        String man = null;
        double maxSalary = -1;
        for (Employee empl : employees) {
            if (empl != null) {
                if (empl.getSalary() > maxSalary) {
                    maxSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Максимальная зарплата состовляет = " + maxSalary + " у сотрудника " + man);
    }

    public void getMinimumSalary() {
        String man = null;
        double minSalary = Long.MAX_VALUE;
        for (Employee empl : employees) {
            if (empl != null) {
                if (empl.getSalary() < minSalary) {
                    minSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Минимальная зарплата состовляет = " + minSalary + " у сотрудника " + man);
    }

    public void increaseSalaryByPercentage(double percent) {
        String man = null;
        double newSalary = 0;
        double newPercent = percent;
        for (Employee empl : employees) {
            if (empl != null) {
                newSalary = ((empl.getSalary() * newPercent) / 100) + empl.getSalary();
                empl.setSalary(newSalary);
                man = empl.getFirstName() + " " + empl.getLastName();
            }
            System.out.println("Новая зарплата сотрутника " + man + " состовляет = " + newSalary);
        }
    }

    public void getDepartmentInfoByMinimumSalary(int numDepartment) {
        String man = null;
        double minSalary = Long.MAX_VALUE;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == numDepartment) {
                if (empl.getSalary() < minSalary) {
                    minSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе № " + numDepartment + " состовляет = " + minSalary + " у сотрудника " + man);
    }

    public void getDepartmentInfoByMaximumSalary(int numDepartment) {
        String man = null;
        double maxSalary = -1;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == numDepartment) {
                if (empl.getSalary() > maxSalary) {
                    maxSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе № " + numDepartment + " состовляет = " + maxSalary + " у сотрудника " + man);
    }

    public void getDepartmentInfoByAmountSalaryPerMonth(int numDepartment) {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == numDepartment) {
                sum += empl.getSalary();
            }
        }
        System.out.println("Сумма зарплат всех сотрудников за месяц в отделе № " + numDepartment + " состовляет =  " + sum);
    }

    private int getSizeDepartment(int numDepartment) {
        int size = 0;
        for (Employee epl : employees) {
            if (epl != null && epl.getDepartment() == numDepartment) {
                size++;
            }
        }
        return size;
    }

    public void getAverageSalaryByDepartment(int numDepartment) {
        double sum = 0;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == numDepartment) {
                sum += empl.getSalary() / getSizeDepartment(numDepartment);
            }
        }
        System.out.println("Средняя зарплата сотрудников за месяц состовляет =  " + sum);
    }

    public void getDepartmentInfoAfterIncreaseSalaryByPercentage(int numDepartment, double percent) {
        String man = null;
        double newSalary = 0;
        double newPercent = percent;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == numDepartment) {
                newSalary = ((empl.getSalary() * newPercent) / 100) + empl.getSalary();
                empl.setSalary(newSalary);
                man = empl.getFirstName() + " " + empl.getLastName();
                System.out.println("Новая зарплата сотрутника " + man + " состовляет = " + newSalary);
            }
        }
    }

    public void printDepartmentInfoList(int numDepartment) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null && employees[i].getDepartment() == numDepartment) {
                System.out.println(
                        "ФИО сотрудника - " + employees[i].getFirstName() + " " + employees[i].getMidleName() + " " + employees[i].getLastName() +
                                ", зарплата - " + employees[i].getSalary() +
                                ", ID - " + employees[i].getId()
                );
            }
    }

    public void findAllEmployeesLessThanSalary(double salary) {
        String man = null;
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() < salary) {
                man = empl.getLastName() + " " + empl.getFirstName() + " " + empl.getMidleName();
                System.out.println("id " + empl.getId() + ", Ф.И.О. " + man + ", зарплата " + empl.getSalary());
            }
        }
    }

    public void findAllEmployeesGreaterThanSalary(double salary) {
        String man = null;
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() > salary) {
                man = empl.getLastName() + " " + empl.getFirstName() + " " + empl.getMidleName();
                System.out.println("id " + empl.getId() + ", Ф.И.О. " + man + ", зарплата " + empl.getSalary());
            }
        }
    }

    public void removeEmployee(String lastEmployee) {
        String man = null;
        for (int i = 0; i < employees.length; i++) {
            man = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMidleName();
            if (employees[i] != null && man.equals(lastEmployee)) {
                System.out.println(employees[i].getLastName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            } else {
                System.out.println("Сотрудник с таким ФИО не найден!");
            }
        }
    }

    public void getFioEmployee() {
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println(empl.getLastName() + " " + empl.getFirstName() + " " + empl.getMidleName());
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println(employees[i].getLastName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            } else {
                System.out.println("Сотрудник с таким id " + id + " не найден!");
            }
        }
    }

    public void changeEmployeeByFio(String fioEmployee, int setSalary, int setDepartment) {
        String man = null;
        for (int i = 0; i < employees.length; i++) {
            man = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMidleName();
            if (employees[i] != null && man.equals(fioEmployee)) {
                employees[i].setSalary(setSalary);
                employees[i].setDepartment(setDepartment);
                return;
            }
        }
    }

    public void getFioEmployeesByDepartment(int department) {
        String fio = null;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == department) {
                fio = empl.getLastName() + " " + empl.getFirstName() + " " + empl.getMidleName();
                System.out.println(fio);
            }
        }
    }

}
