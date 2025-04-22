package lldquestions.onlineauctionsystem;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int bidAmount) {
        colleagues.stream().filter(colleague1 -> !colleague1.getName().equals(colleague.getName())).forEach(colleague1 -> colleague1.receiveBidNotification(bidAmount));
    }
}
