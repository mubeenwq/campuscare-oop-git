package ticket;

public abstract class Ticket {
    public int ticketId;
    protected String title;
    protected String description;
    protected String location;
    protected String status;

    public Ticket(int ticketId, String title, String description, String location) {
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.status = "New";
    }

    public abstract double priorityScore();

    public void setStatus(String status) {
        this.status = status;
    }

    public void show() {
        System.out.println(ticketId + " | " + title + " | " + status + " | Priority: " + priorityScore());
    }
}