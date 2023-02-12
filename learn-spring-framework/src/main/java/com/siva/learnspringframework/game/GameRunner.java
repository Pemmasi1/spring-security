package com.siva.learnspringframework.game;

import com.siva.learnspringframework.game.MarioGame;

public class GameRunner {

    MarioGame marioGame;

    SuperContraGame game2;
    public GameRunner(SuperContraGame game2) {
        this.game2 = game2;
    }

    public void run() {
        System.out.println("Running Game" +marioGame);
        game2.right();
        game2.up();
        game2.left();
        game2.down();
    }
}
