package util;

import game.*;

public class Knight extends Piece{
    public Knight(boolean white) {
        super(white);
    }
    @Override
    public boolean isLegal(Move move, Game game) {
        if(!super.isLegal(move, game))
            return false;
        //rules for knight only!
        if(Math.abs(move.getRow0()-move.getRow1()) * Math.abs(move.getCol0()) - move.getCol1() == 2)
            game.move(move);
        return true;
    }
    @Override
    public String toString() {
        return white?"\u2658":"\u265E";
    }
}
