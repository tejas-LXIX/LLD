package lldquestions.atm.model;

public class Card {

    private String id;
    private CardType cardType;
    private Account account;

    public Card(String id, CardType cardType, Account account) {
        this.id = id;
        this.cardType = cardType;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
