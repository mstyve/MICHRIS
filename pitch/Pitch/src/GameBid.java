import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class GameBid {

	private static int highBid = 3;
	private static int highestBidIdx = 3;
	private static Collection<Player> playerCollection = new ArrayList<Player>();
	private static int suitRep;

	public static void initializeBidSequence(Collection<Player> players) {
		playerCollection = players;
		for (int i = 0; i < 4; i++) {
			getPlayerBid(i);
		}

		suitRep = getTrumpSuit();

	}

	public static void getPlayerBid(int newHighIdx) {
		Scanner reader = new Scanner(System.in);
		int newBid;
		do{
		System.out.print("Enter your bid Player " + (newHighIdx + 1)
				+ ", the high is " + highBid + ":");
		System.out.println();
		// get user input for a
		newBid = reader.nextInt();
		}while(newBid <4 || newBid>10);
		if (newBid > highBid) {
			highBid = newBid;
			highestBidIdx = newHighIdx;
			// player.setBid(highBid);
		}
	}

	public static int getTrumpSuit() {
		int suitRep = -1;
		do {
			Scanner reader = new Scanner(System.in);
			System.out
					.println("Player " + (highestBidIdx + 1) + " enter suit:");
			// get user input for a
			String suit = reader.nextLine().toUpperCase();
			if (suit.equals("SPADES")) {
				suitRep = 0;
			} else if (suit.equals("HEARTS")) {
				suitRep = 1;
			} else if (suit.equals("CLUBS")) {
				suitRep = 2;
			} else if (suit.equals("DIAMONDS")) {
				suitRep = 3;
			} else {
				System.out
						.println("Invalid suit, please enter one of the following");
				System.out.println("'spades', 'diamonds', 'clubs' or 'hearts'");
			}
		} while (suitRep == -1);
		return suitRep;
	}

	public static int getHighBid() {
		return highBid;
	}

	public void setHighBid(int highBid) {
		this.highBid = highBid;
	}

	public static int getHighestBidIdx() {
		return highestBidIdx;
	}

	public void setHighestBidIdx(int highestBidIdx) {
		this.highestBidIdx = highestBidIdx;
	}

	public Collection<Player> getPlayerCollection() {
		return playerCollection;
	}

	public void setPlayerCollection(Collection<Player> playerCollection) {
		this.playerCollection = playerCollection;
	}

	public static int getSuitRep() {
		return suitRep;
	}

	public void setSuitRep(int suitRep) {
		this.suitRep = suitRep;
	}

}
