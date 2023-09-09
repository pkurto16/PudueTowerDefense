package src.Interface;

public interface Tower {
  private final double speed;
  private double progress;
  private double health;
  private String type;
  public void changeHealth();
  public void die();
}
