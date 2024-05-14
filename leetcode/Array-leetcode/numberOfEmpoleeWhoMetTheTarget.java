public class numberOfEmpoleeWhoMetTheTarget {
    
        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int count = 0;
            for (int i = 0; i < hours.length; i++) {
                if (hours[i] >= target) {
                    count++;
                }
            }
            return count;
        }
    
        public static void main(String[] args) {
            numberOfEmpoleeWhoMetTheTarget solution = new numberOfEmpoleeWhoMetTheTarget();
    
            // Example usage
            int[] hoursWorked = {35, 40, 30, 45, 50}; // Sample hours worked by employees
            int targetHours = 40; // Target hours
    
            int employeesMetTarget = solution.numberOfEmployeesWhoMetTarget(hoursWorked, targetHours);
    
            System.out.println("Number of employees who met or exceeded the target: " + employeesMetTarget);
        }
    }
    
