import org.example.Direction;
import org.example.Rover;
import org.junit.Assert;
import org.junit.Test;

public class RoverTest {
    @Test
    public void testRotateLeft() {
        Rover rover = new Rover(0, 0, Direction.N);
        rover.rotateLeft();
        Assert.assertEquals(Direction.W, rover.getDirection());
    }

    @Test
    public void testRotateRight() {
        Rover rover = new Rover(0, 0, Direction.N);
        rover.rotateRight();
        Assert.assertEquals(Direction.E, rover.getDirection());
    }

    @Test
    public void testMoveForwardNorth() {
        Rover rover = new Rover(0, 0, Direction.N);
        rover.moveForward();
        Assert.assertEquals(1, rover.getY());
        Assert.assertEquals(0, rover.getX());
    }

    @Test
    public void testMoveForwardEast() {
        Rover rover = new Rover(0, 0, Direction.E);
        rover.moveForward();
        Assert.assertEquals(0, rover.getY());
        Assert.assertEquals(1, rover.getX());
    }
}