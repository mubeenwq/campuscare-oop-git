import java.util.*;
import person.*;
import ticket.*;

public class Main {

    static List<Person> persons = new ArrayList<>();
    static List<Ticket> tickets = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("\n1.Add Person\n2.Create Ticket\n3.View Tickets\n4.Update Status\n5.Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: addPerson(); break;
                case 2: createTicket(); break;
                case 3: viewTickets(); break;
                case 4: updateStatus(); break;
                case 5: return;
            }
        }
    }

    static void addPerson() {
        System.out.println("1.Student 2.Staff");
        int type = sc.nextInt();

        System.out.print("ID: "); int id = sc.nextInt();
        System.out.print("Name: "); String name = sc.next();
        System.out.print("Email: "); String email = sc.next();

        if(type == 1) {
            System.out.print("Program: "); String program = sc.next();
            System.out.print("Semester: "); int sem = sc.nextInt();
            persons.add(new Student(id,name,email,program,sem));
        } else {
            System.out.print("Department: "); String dept = sc.next();
            persons.add(new Staff(id,name,email,dept));
        }
    }

    static void createTicket() {
        System.out.println("1.Maintenance 2.Cleaning");
        int type = sc.nextInt();

        System.out.print("Ticket ID: "); int id = sc.nextInt();
        System.out.print("Title: "); String title = sc.next();
        System.out.print("Desc: "); String desc = sc.next();
        System.out.print("Location: "); String loc = sc.next();

        if(type == 1)
            tickets.add(new MaintenanceTicket(id,title,desc,loc));
        else
            tickets.add(new CleaningTicket(id,title,desc,loc));
    }

    static void viewTickets() {
        for(Ticket t : tickets) {
            t.show();
        }
    }

    static void updateStatus() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();

        for(Ticket t : tickets) {
            if(t.ticketId == id) {
                System.out.print("Enter Status(New/Assigned/Resolved): ");
                t.setStatus(sc.next());
            }
        }
    }
}