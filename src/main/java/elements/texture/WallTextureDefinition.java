package elements.texture;

public class WallTextureDefinition {
    private TextureDefinition top = new TextureDefinition();
    private TextureDefinition middle = new TextureDefinition();
    private TextureDefinition bottom = new TextureDefinition();

    public WallTextureDefinition() {
    }

    public WallTextureDefinition(String topName, String middleName, String bottomName) {
        top.setName(topName);
        middle.setName(middleName);
        bottom.setName(bottomName);
    }

    public void setTop(TextureDefinition top) {
        this.top = top;
    }

    public void setMiddle(TextureDefinition middle) {
        this.middle = middle;
    }

    public void setBottom(TextureDefinition bottom) {
        this.bottom = bottom;
    }

    public TextureDefinition getTop() {
        return top;
    }

    public TextureDefinition getMiddle() {
        return middle;
    }

    public TextureDefinition getBottom() {
        return bottom;
    }
}
