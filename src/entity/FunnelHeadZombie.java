package entity;


import javafx.scene.layout.Pane;

public class FunnelHeadZombie extends Zombie{

    public FunnelHeadZombie(int x, int y, int lane) {
        super(12, 2, x, y, 134, 124, lane,"/assets/coneheadzombie.gif");
        this.path = "/assets/coneheadzombie.gif";
    }

    @Override
    public void attacking(Pane pane) {
    }

    @Override
    public void attacking() {
        super.attacking();
    }
}
