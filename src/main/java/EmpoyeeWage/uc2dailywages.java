package EmpoyeeWage;

class wage{
        // method for calculating salary
        void emp1()
        {
            int isPresent = 1;
            int salary;
            int empRatePerHr = 20;
            int workinghr;
            double randomCheck = Math.floor(Math.random() * 10) % 2;

            if (isPresent == randomCheck)
            {
                System.out.println("Employee is present");
                workinghr = 8;
            }
            else
            {
                System.out.println("Employee is Absent");
                workinghr = 0;
            }

            salary = empRatePerHr * workinghr;
            System.out.println("Employee daily wage" + salary);
        }

    }
    public class uc2dailywages {

        public static void main(String[] args) {
            //creating an object
            wage salary = new wage();

            //calling method emp1
            salary.emp1();

        }
        }

