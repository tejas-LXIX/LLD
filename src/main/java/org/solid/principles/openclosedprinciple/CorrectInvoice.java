package org.solid.principles.openclosedprinciple;

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
