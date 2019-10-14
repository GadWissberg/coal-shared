package elements.texture;

public class TextureDefinition {
    private String name;
    private float horizontalOffset;
    private float verticalOffset;
    private float opacity;

    public TextureDefinition() {
        this((TextureDefinition) null);
        opacity = 1;
    }

    public TextureDefinition(TextureDefinition toClone) {
        if (toClone == null) return;
        name = toClone.getName();
        horizontalOffset = toClone.getHorizontalOffset();
        verticalOffset = toClone.getVerticalOffset();
        opacity = toClone.getOpacity();
    }

    public TextureDefinition(String name) {
        this();
        this.name = name;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHorizontalOffset(float horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
    }

    public void setVerticalOffset(float verticalOffset) {
        this.verticalOffset = verticalOffset;
    }

    public String getName() {
        return name;
    }

    public float getHorizontalOffset() {
        return horizontalOffset;
    }

    public float getVerticalOffset() {
        return verticalOffset;
    }
}
