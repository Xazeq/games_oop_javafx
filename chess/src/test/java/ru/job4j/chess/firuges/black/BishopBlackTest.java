package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenSamePosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertThat(bishopBlack.position(), is(Cell.A2));
    }

    @Test
    public void whenCorrectPositionAfterCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        bishopBlack = (BishopBlack) bishopBlack.copy(Cell.B3);
        assertThat(bishopBlack.position(), is(Cell.B3));
    }

    @Test
    public void whenCorrectWayFromC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell [] array = bishopBlack.way(Cell.G5);
        assertThat(array[0], is(Cell.D2));
        assertThat(array[1], is(Cell.E3));
        assertThat(array[2], is(Cell.F4));
        assertThat(array[3], is(Cell.G5));
    }

    @Test
    public void whenCorrectWayFromD4ToG1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell [] array = bishopBlack.way(Cell.G1);
        assertThat(array[0], is(Cell.E3));
        assertThat(array[1], is(Cell.F2));
        assertThat(array[2], is(Cell.G1));
    }

    @Test
    public void whenCorrectWayFromD4ToA1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell [] array = bishopBlack.way(Cell.A1);
        assertThat(array[0], is(Cell.C3));
        assertThat(array[1], is(Cell.B2));
        assertThat(array[2], is(Cell.A1));
    }

    @Test
    public void whenCorrectWayFromD4ToA7() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell [] array = bishopBlack.way(Cell.A7);
        assertThat(array[0], is(Cell.C5));
        assertThat(array[1], is(Cell.B6));
        assertThat(array[2], is(Cell.A7));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenIncorrectWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.C2);
    }
}