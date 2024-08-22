package org.solid.principles.openclosedprinciple;

public class FileInvoiceDAO implements CorrectInvoiceDAO {
    @Override
    public void save(CorrectInvoice invoice) {
        //save to file
    }
}
