package elements;

import elements.texture.WallTextureDefinition;

public interface LineElement extends LevelElement {
    boolean equals(LineElement other);

    VertexElement getSrc();

    VertexElement getDst();

    boolean isSolid();

    void setSolid(boolean v);

    long getFrontSectorId();

    long getBackSectorId();

    void setFrontSectorId(long id);

    void setBackSectorId(long id);

    float getNormalDirection();

    WallTextureDefinition getFrontTexture();

    void setFrontTexture(WallTextureDefinition texture);

    WallTextureDefinition getBackTexture();

    void setBackTexture(WallTextureDefinition texture);

}
