package behavioraldesignpatterns.visitor;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic of SingleRoom");
        singleRoom.roomPrice = 100;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic of DoubleRoom");
        doubleRoom.roomPrice = 200;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing computation logic of DeluxeRoom");
        deluxeRoom.roomPrice = 300;
    }
}
