package lldquestions.onlineauctionsystem;

public interface AuctionMediator {

    void addBidder(Colleague colleague);
    void placeBid(Colleague colleague, int bidAmount);

}
