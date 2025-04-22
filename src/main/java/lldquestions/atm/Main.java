package lldquestions.atm;

import lldquestions.atm.model.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        ATM atm = ATM.getInstance();
        User user = initialize();
        Card card = user.getCard();

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "6453");
        atm.getAtmState().selectOperation(atm, OperationType.WITHDRAWAL);
        atm.getAtmState().withdraw(atm, card, 2700);

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "0000");
        atm.getAtmState().selectOperation(atm, OperationType.WITHDRAWAL);
        atm.getAtmState().withdraw(atm, card, 2700);

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "6453");
        atm.getAtmState().selectOperation(atm, OperationType.DEPOSIT);
        atm.getAtmState().deposit(atm, card, Arrays.asList(new Notes(NoteType.FIVE_HUNDRED, 1), new Notes(NoteType.ONE_HUNDRED, 3)));

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "0000");
        atm.getAtmState().selectOperation(atm, OperationType.CHECK_BALANCE);
        atm.getAtmState().checkBalance(atm, card);

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "6453");
        atm.getAtmState().selectOperation(atm, OperationType.CHECK_BALANCE);
        atm.getAtmState().checkBalance(atm, card);

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "6453");
        atm.getAtmState().selectOperation(atm, OperationType.WITHDRAWAL);
        atm.getAtmState().withdraw(atm, card, 205);

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticate(atm, card, "6453");
        atm.getAtmState().selectOperation(atm, OperationType.CHECK_BALANCE);
        atm.getAtmState().checkBalance(atm, card);
    }

    private static User initialize() {
        return createUser();
    }

    private static Card createCard() {
        Card card = new Card("1", CardType.DEBIT, createAccount());
        card.getAccount().setCard(card);
        return card;
    }

    private static User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private static Account createAccount() {
        Account bankAccount = new Account("1");
        bankAccount.addBalance(3000);
        return bankAccount;
    }
}
