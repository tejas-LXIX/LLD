package org.solid.principles.openclosedprinciple;

//common interface for all save functionalities. Will be implemented by DB DAO, and File DAO.
//Can easily be implemented by some third functionality in the future, without requiring any changes in existing classes. Therefore, no regression. Safe.
public interface CorrectInvoiceDAO {
    public void save(CorrectInvoice invoice);
}
