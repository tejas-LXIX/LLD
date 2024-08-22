package org.solid.principles.singleresponsibilityprinciple;

//this class also has one reason to change (when the save functionality needs to change or new saving methods need to be added).
public class InvoiceDAO {
    private CorrectInvoice invoice;

    public InvoiceDAO(CorrectInvoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        //save the data into DB
    }

    public void saveToFile() {
        //save the data to file
    }
}
