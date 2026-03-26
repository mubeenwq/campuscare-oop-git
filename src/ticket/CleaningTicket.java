package ticket;

public class CleaningTicket extends Ticket {

    public CleaningTicket(int id, String title, String desc, String loc) {
        super(id, title, desc, loc);
    }

    @Override
    public double priorityScore() {
        if(description.toLowerCase().contains("trash")) return 8.0;
        return 4.0;
    }
}