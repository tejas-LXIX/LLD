package org.solid.principles.singleresponsibilityprinciple;

//this class also has one reason to change (when the print functionality needs to change or the invoice needs to be printed to different mediums)
public class InvoicePrinter {
    private CorrectInvoice invoice;

    public InvoicePrinter(CorrectInvoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println(this);
    }

    public void printInvoiceToLog() {
//        logger.info(this);
    }
}
