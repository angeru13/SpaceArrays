package ru.samsung.itschool.spacearrays;

public class ControlledRocket extends Rocket {
   private float targetX, targetY;
    public void setTarget(float targetX, float targetY){
        this.targetX = targetX;
        this.targetY = targetY;
        setVX(targetX - getX());
        setVY(targetY-getY());
        float d = getVel();
        setVX(getVX()/d*5);
        setVY(getVY()/d*5);
    }
}
