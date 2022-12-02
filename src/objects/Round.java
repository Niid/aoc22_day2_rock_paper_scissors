package objects;

public class Round {
	
	private PlayMove opponentMove;
	private PlayMove playerMove;
	
	public Round(PlayMove opponentMove, PlayMove playerMove) {
		super();
		this.opponentMove = opponentMove;
		this.playerMove = playerMove;
	}

	// donne le coup joué par l'adversaire pour ce round
	public PlayMove getOpponentMove() {
		return opponentMove;
	}

	public void setOpponentMove(PlayMove opponentMove) {
		this.opponentMove = opponentMove;
	}

	// donne le coup joué par le joueur pour ce round
	public PlayMove getPlayerMove() {
		return playerMove;
	}

	public void setPlayerMove(PlayMove playerMove) {
		this.playerMove = playerMove;
	}

	
}
