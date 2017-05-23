package game

import org.junit.Test

import org.junit.Assert.*

class BriscolaGameTest {

    @Test
    fun testGetTeams() {
        val game = BriscolaGame();
        val teams = game.teams;
        assertEquals(2, teams.size);
    }
}