public class Game {
    private static Game instance;
    public int points;
    private Game(){
        this.points = 0;
    }
    public static Game getInstance(){
        if(instance == null){
            instance = new Game();
        }
        return instance;
    }
}
