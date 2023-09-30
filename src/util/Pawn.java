package util;
import game.*;
public class Pawn extends Piece{
    public Pawn(boolean white) {
        super(white);
    }
    @Override
    public boolean isLegal(Move move, Game game) {
        if(!super.isLegal(move, game)) return false;

        //rules for pawn only!
        int rowDiff = move.getRow1() - move.getRow0();
        int colDiff = move.getCol1() - move.getCol0();
        if(rowDiff > 0 && white || rowDiff < 0 && !white)
            return false;//pawn doesn't move backward!
        //add more rules here
        if(game.getPiece(move.getRow0(), move.getCol0()) == null)
            if (colDiff != 0)
                return false;

        else game.move(move);
        return true;
    }
    @Override
    public String toString() {
        return white?"\u2659":"\u265F";
    }
}
