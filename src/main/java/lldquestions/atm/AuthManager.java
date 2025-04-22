package lldquestions.atm;

import lldquestions.atm.model.Card;

import java.util.HashMap;
import java.util.Map;

public class AuthManager {

    private Map<String, String> cardToPin;

    public AuthManager() {
        cardToPin = new HashMap<>();
        cardToPin.put("1", "6453");
        cardToPin.put("2", "7741");
        cardToPin.put("3", "0089");
    }

    public boolean authenticate(Card card, String pin) {
        return cardToPin.get(card.getId()).equals(pin);
    }
}
