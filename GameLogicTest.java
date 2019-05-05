package edu.dmacc.codedsm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test

    public void isVictorious() {

        StubGameRunner stubGameRunner = new StubGameRunner() {

            @Override

            public boolean isVictorious() {

                return true;

            }

        };

        GameLogic gameLogic = new GameLogic(stubGameRunner);

        GameResult gameResult = gameLogic.runGame("david");

        assertEquals(10000, gameResult.getScore().intValue());

    }



    @Test

    public void buildResult() {



    }



    @Test

    public void isDefeated() {

        StubGameRunner stubGameRunner = new StubGameRunner() {

            @Override

            public boolean isDefeated() {

                return true;

            }

        };

        GameLogic gameLogic = new GameLogic(stubGameRunner);

        GameResult gameResult = gameLogic.runGame("John");

        assertEquals(100, gameResult.getScore().intValue());

    }



    @Test

    public void playerName() {

        StubGameRunner stubGameRunner = new StubGameRunner() {

            @Override

            public boolean isDefeated() {

                return true;

            }

        };

        GameLogic gameLogic = new GameLogic(stubGameRunner);

        GameResult gameResult = gameLogic.runGame("David");

        assertEquals("David", gameResult.getPlayer());

    }



    private class StubGameRunner implements GameRunner {



        public boolean isVictorious() {

            return false;

        }



        public boolean isDefeated() {

            return false;

        }

    }

}

