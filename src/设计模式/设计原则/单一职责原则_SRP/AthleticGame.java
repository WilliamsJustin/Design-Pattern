package 设计模式.设计原则.单一职责原则_SRP;// AthleticGame类（体育比赛）的代码如下：

import java.util.List;

public class AthleticGame {
    private List<Athlete> athletes;

    public AthleticGame(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public void startGame() {
        for (Athlete athlete : athletes) {
            System.out.println("Athlete" + athlete.getName() + "from" + athlete.getNationality() + "is participipationg in the game");
        }
    }
}