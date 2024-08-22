package org.solid.principles.singleresponsibilityprinciple;

//this class follows Single Responsibility Principle because it has only one reason to change (when the total calculation logic changes).
public class CorrectInvoice {
    private Marker marker;
    private int quantity;

    public CorrectInvoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = marker.price * this.quantity;
        return price;
    }
}
