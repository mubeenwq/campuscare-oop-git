package ticket;

public class MaintenanceTicket extends Ticket {

    public MaintenanceTicket(int id, String title, String desc, String loc) {
        super(id, title, desc, loc);
    }

    @Override
    public double priorityScore() {
        if(location.toLowerCase().contains("lab")) return 9.0;
        return 5.0;
    }
}