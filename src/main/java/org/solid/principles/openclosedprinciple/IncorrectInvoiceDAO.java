package org.solid.principles.openclosedprinciple;

//this class violates the Open-Closed principle. This is because the class only had the saveToDB() method which was tested thoroughly and in production.
//Now, adding the new saveToFile() method can cause regression in this class and increase the testing effort.
//Therefore, instead of adding this new method here, we should try to abstract this DAO into an interface and have classes for each specific functionality.
public class IncorrectInvoiceDAO {
    private CorrectInvoice invoice;

    public IncorrectInvoiceDAO(CorrectInvoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        //save the data into DB
    }

    public void saveToFile() {
        //save the data to file
    }
}
