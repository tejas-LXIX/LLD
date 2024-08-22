package org.solid.principles.openclosedprinciple;

public class DatabaseInvoiceDAO implements CorrectInvoiceDAO {
    @Override
    public void save(CorrectInvoice invoice) {
        //save to DB
    }
}
