package behavioraldesignpatterns.visitor;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Perform maintenance of Single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Perform maintenance of Double room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Perform maintenance of Deluxe room");
    }
}
