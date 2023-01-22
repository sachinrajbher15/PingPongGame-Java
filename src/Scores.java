import java.awt.*;

public class Scores extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    Scores(int GAME_WIDTH,int GAME_HEIGHT)
    {
        Scores.GAME_HEIGHT=GAME_HEIGHT;
        Scores.GAME_WIDTH=GAME_WIDTH;
    }
    public void draw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke1 = new BasicStroke(3f);
        g2d.setColor(Color.yellow);
        g2d.setStroke(stroke1);
        g2d.drawRect(400, 10, 188, 60);
        g.setColor(Color.yellow);
        g.setFont(new Font("Consolas",Font.PLAIN,50));
        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10),GAME_WIDTH/2-80,55);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10),GAME_WIDTH/2+20,55);
    }
}
