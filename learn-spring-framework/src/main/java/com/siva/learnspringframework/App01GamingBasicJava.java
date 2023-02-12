package com.siva.learnspringframework;

import com.siva.learnspringframework.game.GameRunner;
import com.siva.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();

    }

}
