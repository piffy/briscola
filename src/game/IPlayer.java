package game;

import java.util.ArrayList;

import java_card.Card;

public interface IPlayer
{
	public boolean getIsDealer();
	public Team getTeam();
	public void receive(Card card);
	public Card play(ArrayList<Card> played);
	public void seePlayedHand(ArrayList<Card> hand);
}
