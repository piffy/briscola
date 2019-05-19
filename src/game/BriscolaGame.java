package game;

import java.util.ArrayList;
import java.util.List;

import deck.BriscolaPlayer;
import java_card.CardGame;
import java_card.CardTeamPlayer;
import java_card.ICardSuit;

public class BriscolaGame extends CardGame
{
	public static final int HAND_SIZE = 3;
	public static final int TEAM_PLAYERS = 2;
	public static final int NUM_PLAYERS = 4;

	private List<BriscolaTeam> teams;
	private List<CardTeamPlayer> players;
	
	protected ICardSuit briscola;
	
	public BriscolaGame() throws Exception
	{
		this.teams = new ArrayList<BriscolaTeam>(2);
		BriscolaTeam team1 = new BriscolaTeam(1, TEAM_PLAYERS);
		this.teams.add(team1);
		BriscolaTeam team2 = new BriscolaTeam(2, TEAM_PLAYERS);
		this.teams.add(team2);

		team1.addPlayer(new BriscolaPlayer());
		team1.addPlayer(new BriscolaPlayer());
		team2.addPlayer(new BriscolaPlayer());
		team2.addPlayer(new BriscolaPlayer());
	}

	public void deal()
	{
		for (BriscolaTeam team: this.teams)
		{
		}
	}
	
	public ICardSuit getBriscola()
	{
		return this.briscola;
	}

	public List<BriscolaTeam> getTeams()
	{
		return this.teams;
	}
}