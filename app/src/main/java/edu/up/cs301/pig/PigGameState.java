package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

/**
 * Created by lytle on 10/12/2017.
 */

public class PigGameState extends GameState {

    private int playerID;
    private int player0Score;
    private int player1Score;
    private int runningTotal;
    private int dieVal;

    public PigGameState() {

    }

    public int getPlayerID() {
        return playerID;
    }

    public int getPlayer0Score() {
        return player0Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public int getDieVal() {
        return dieVal;
    }

    public void setPlayerID(int id) {
        playerID = id;
    }

    public void getPlayer0Score(int score) {
        player0Score = score;
    }

    public void getPlayer1Score(int score) {
        player1Score = score;
    }

    public void getRunningTotal(int total) {
        runningTotal = total;
    }

    public void getDieVal(int val) {
        dieVal = val;
    }

    public PigGameState(PigGameState gs){
        playerID = gs.playerID;
        player0Score = gs.player0Score;
        player1Score = gs.player1Score;
        runningTotal = gs.runningTotal;
        dieVal = gs.dieVal;
    }
}