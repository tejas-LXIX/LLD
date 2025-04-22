package lldquestions.onlineauctionsystem;

public interface Colleague {

    void placeBid(int bidAmount);
    void receiveBidNotification(int bidAmount);
    String getName();

}
