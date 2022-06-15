package EmpoyeeWage;


class employee {

    // method
    void attendance() {
        int IsFullTime = 1;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        // Equation check is present or not
        if (empCheck == IsFullTime) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

public class uc1employeeis {
    public static void main(String[] args) {
        // creating an object
        employee attendance = new employee();

        // calling method attendance
        attendance.attendance();

    }
}
