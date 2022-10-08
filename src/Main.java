public class Main {
    private static final Employee[] staff = new Employee[20];
    public static void main(String[] args) {
        staff[0] = new Employee("Трифонов Глеб Васильевич",1,63_118f);
        staff[1] = new Employee("Майорова Кристина Мироновна",1,44_199f);
        staff[2] = new Employee("Чернов Адам Андреевич",2,55_158f);
        staff[3] = new Employee("Агеева Ангелина Станиславовна",2,71_253f);
        staff[4] = new Employee("Новиков Лука Дмитриевич",3,70_344f);
        staff[5] = new Employee("Воронина Анна Арсентьевна",3,49_929f);
        staff[6] = new Employee("Федорова Анастасия Богдановна",4,60_080f);
        staff[7] = new Employee("Ушакова Вероника Богдановна",4,83_315f);
        staff[8] = new Employee("Александрова Вероника Филипповна",5,66_576f);
        staff[9] = new Employee("Ефимов Даниил Михайлович",5,56_895f);

        allStaff();
        System.out.println("Сумма затрат на зарплаты в месяц: " + allSalary());
        System.out.println("Сотрудник с минимальной зарплатой: "+ minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: "+ maxSalary());
        System.out.println("Среднее значение зарплат в месяц: " + averageSalary());
        allName();
    }

    public static void allStaff() {
        for (Employee staff : staff){
            if (staff != null) {
                System.out.println(staff);
            }
        }
    }
    public static float allSalary() {
        float sum = 0;
        for (Employee staff : staff) {
            if (staff != null) {
                sum += staff.getSalary();
            }
        }
        return sum;
    }
    public static Employee minSalary() {
        float minPayment = Integer.MAX_VALUE;
        Employee staffMinPayment = null;
        for (Employee staff : staff) {
            if (staff != null && staff.getSalary() < minPayment) {
                minPayment = staff.getSalary();
                staffMinPayment = staff;
            }
        }
        return staffMinPayment;
    }
    public static Employee maxSalary() {
        float maxPayment = Integer.MIN_VALUE;
        Employee staffMaxPayment = null;
        for (Employee staff : staff) {
            if (staff != null && staff.getSalary() > maxPayment) {
                maxPayment = staff.getSalary();
                staffMaxPayment = staff;
            }
        }
        return staffMaxPayment;
    }
    public static float averageSalary() {
        return allSalary() / 2;
    }
    public static void allName() {
        for (Employee staff : staff) {
            if (staff != null){
                System.out.println(staff.getName());
            }
        }
    }
}