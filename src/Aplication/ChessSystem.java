package Aplication;

import BoardGame.Board;
import Chess.ChessMatch;

public class ChessSystem {

    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
