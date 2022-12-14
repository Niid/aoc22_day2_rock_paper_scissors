package objects;

import java.util.Arrays;
import java.util.Optional;

public enum PlayMove {
	ROCK('A','X',1),
	PAPER('B','Y',2),
	SCISSORS('C','Z',3);
	
	private final char opponentMoveCode;
    private final char playerMoveCode;
    private final int moveScore;

	PlayMove(char c, char d, int i) {
		this.opponentMoveCode=c;
		this.playerMoveCode=d;
		this.moveScore=i;
	}

	public char getOpponentMoveCode() {
		return opponentMoveCode;
	}

	public char getPlayerMoveCode() {
		return playerMoveCode;
	}

	// rend un PlayMove en fonction du code d'un coup adverse
	public static Optional<PlayMove> getMoveByOpponentPlayCode(String value) {
        return Arrays.stream(PlayMove.values())
            .filter(playMove -> playMove.opponentMoveCode == value.charAt(0))
            .findFirst();
    }

	// rend un PlayMove en fonction du code d'un coup joueur
	public static Optional<PlayMove> getMoveByPlayerPlayCode(String value) {
        return Arrays.stream(PlayMove.values())
            .filter(playMove -> playMove.playerMoveCode == value.charAt(0))
            .findFirst();
    }

	//donne le score d'un coup joueur
	public int getMoveScore() {
		return moveScore;
	}
}
