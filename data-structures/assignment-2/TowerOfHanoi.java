import java.util.Stack;

public class TowerOfHanoi {

    private Stack<Integer>[] towers;
    private int numberOfDisks;



    public TowerOfHanoi(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        towers = new Stack[3];

        for(int i = 0; i < 3; i++) {
            towers[i] = new Stack<>();
        }
        for (int i = numberOfDisks; i > 0; i--) {
            towers[0].push(i);
        }
    }

    public void moveDisk(int fromTower, int toTower) {
        if(fromTower<1 || fromTower> 3 || toTower<1 || toTower> 3) {
            System.out.println("Invalid move");
            return;
        }
        if(fromTower == toTower) {
            System.out.println("Tower is the same");
            return;
        }
        if(towers[fromTower-1].isEmpty()) {
            System.out.println("The source tower is empty");
            return;
        }
        if(!towers[toTower-1].isEmpty() && towers[toTower - 1].peek() <towers[fromTower-1].peek()) {
            System.out.println("Cannot place larger disk on top of a smaller disk");
            return;
        }
        towers[toTower-1].push(towers[fromTower -1].pop());

    }

    public boolean isComplete(){
            if (towers[2].size() != numberOfDisks) {
                return true ;
            }
            return false;
    }

    public void printTowers() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Tower " + (i + 1) + ": ");
            for (int j = towers[i].toArray().length - 1; j >= 0; j--) {
                int disk = towers[i].get(j);
                System.out.println("*".repeat(disk) + " ");
            }
        }
    }




}
