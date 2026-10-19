public class BookingDemo {
    public static void main(String[] args) {

        ProgrammingWorkshop course1 = new ProgrammingWorkshop("Java Basics",4 );
        RoboticsWorkshop course2 = new RoboticsWorkshop("Robotics Intro", 3);
        ProgrammingWorkshop course3 = new ProgrammingWorkshop("Java Practice", 2);

        Workshop[] courses = {
                course1,
                course2,
                course3
        };

        System.out.println("CAMPUS WORKSHOP BOOKING");

        int workshop_number = 1;
        int reserved_seats = 2;
        int workshop_number_index;
        for (int i = 1; i <= 8; i++) {
            switch (i) {
                case 1:
                    workshop_number = 1;
                    reserved_seats = 2;
                    break;
                case 2:
                    workshop_number = 1;
                    reserved_seats = 3;
                    break;
                case 3:
                    workshop_number = 1;
                    reserved_seats = 2;
                    break;
                case 4:
                    workshop_number = 2;
                    reserved_seats = 0;
                    break;
                case 5:
                    workshop_number = 2;
                    reserved_seats = -1;
                    break;
                case 6:
                    workshop_number = 2;
                    reserved_seats = 1;
                    break;
                case 7:
                    workshop_number = 3;
                    reserved_seats = 2;
                    break;
                case 8:
                    workshop_number = 4;
                    reserved_seats = 1;
                    break;
            }
            workshop_number_index = workshop_number - 1;

            System.out.println("\nRequest " + i);
            System.out.println("Workshop number: " + workshop_number);
            System.out.println("Seats requested: " + reserved_seats);

            if (workshop_number >= 1 && workshop_number <= courses.length) {

                if (courses[workshop_number_index].reserve(reserved_seats)) {
                    System.out.println("Reservation successful");
                } else {
                    System.out.println("Reservation unsuccessful");
                }

                System.out.println("Remaining seats: " +
                        courses[workshop_number_index].getRemainingSeats());

            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
        System.out.println("\nFINAL WORKSHOP REPORT");

        int total_fees = 0;

        for (int i = 0; i < courses.length; i++) {

            int fees = courses[i].getEnrolled() * courses[i].getFeePerSeat();

            System.out.println("\nWorkshop: " + courses[i].getTitle());
            System.out.println("Enrolled: " + courses[i].getEnrolled());
            System.out.println("Remaining seats: " + courses[i].getRemainingSeats());
            System.out.println("Fees: " + fees);

            total_fees += fees;
        }

        System.out.println("\nOverall Total Fee: " + total_fees);
    }
}
