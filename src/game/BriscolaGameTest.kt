package game

import org.junit.Assert.assertEquals
import org.junit.Test

class BriscolaGameTest {

    @Test
    fun testGetTeams() {
        val game = BriscolaGame();
        val teams = game.teams;
        assertEquals(2, teams.size);
    }
}
