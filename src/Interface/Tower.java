package src.Interface;

public interface Tower {
    private String[] upgrades;
    private int[][] position;
    private int[][] upgradePath;
    private String imgPath;
    
    public void setPosition();
    public void upgrade();
    public void animate();
}
