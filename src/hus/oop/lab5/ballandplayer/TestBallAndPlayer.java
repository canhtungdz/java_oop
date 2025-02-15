package hus.oop.lab5.ballandplayer;

public class TestBallAndPlayer {
    public static void main(String[] args) {

        Ball ball = new Ball(50, 50, 10);
        Player player = new Player(10, 20, 20, 0);

        player.move(5, 5);

        player.jump(2);

        if (player.near(ball)) {
            System.out.println("Player is near the ball");
        } else {
            System.out.println("Player is not near the ball");
        }
        player.kick(ball);

        System.out.println("New position of the ball: (" + ball.getX() + ", " + ball.getY() + ", " + ball.getZ() + ")");
    }
}
