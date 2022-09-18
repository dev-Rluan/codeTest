package src;

interface Moveable{
    int move();
    int stop();
}
class Ball implements Moveable{

    public int move() {
        return 0;
    }

    public int stop() {
        return 0;
    }
}
