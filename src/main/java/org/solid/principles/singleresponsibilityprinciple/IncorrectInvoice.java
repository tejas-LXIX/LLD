package org.solid.principles.singleresponsibilityprinciple;

//this class violates the single responsibility principle.
//Because, this class has multiple responsibilities (calculateTotal, print invoice, save invoice to DB). Therefore, this class also has multiple reasons to change.
//reason 1: this class will require a change if some new fields are to be added for calculating total
//reason 2: this class will require a change if the printing logic needs to be changed.
//reason 3: this class will require a change if the save to DB logic needs to be changed OR if you we need to save the invoice somewhere else (like saving to a file).
public class IncorrectInvoice {
    private Marker marker;
    private int quantity;

    public IncorrectInvoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = marker.price * this.quantity;
        return price;
    }

    public void printInvoice() {
        System.out.println(this);
    }

    public void saveToDB() {
        //save the data into DB
    }
}
