package game

import org.junit.Assert.assertEquals
import org.junit.Test

class BriscolaTeamTest {

    @Test
    fun testGetScore() {
        val team = BriscolaTeam();
        val score = team.score;
        assertEquals(0, score);
    }
}
