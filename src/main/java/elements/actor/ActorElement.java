package elements.actor;

import elements.LevelElement;

public interface ActorElement extends LevelElement {

    void setX(float x);

    void setY(float y);

    boolean compareTo(ActorElement other);

    void setDirection(float v);

    float getDirection();
}
