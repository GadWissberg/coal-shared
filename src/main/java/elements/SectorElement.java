package elements;

import elements.texture.TextureDefinition;

public interface SectorElement extends LevelElement {


    void setCeilingAltitude(float i);

    float getCeilingAltitude();

    void setFloorAltitude(float i);

    float getFloorAltitude();

    TextureDefinition getFloorTexture();

    void setFloorTexture(TextureDefinition texture);

    TextureDefinition getCeilingTexture();

    void setCeilingTexture(TextureDefinition texture);
}
