package elements.actor;

public enum Type {
    PLAYER("Player", true),
    ENEMY("Enemy"),
    PICKUP("Gun", false, false),
    BULLET("Bullet", false, true, false);

    private boolean hasDirection;
    private boolean unique;
    private String displayName;
    private boolean placeAble;

    Type(String displayName, boolean isUnique) {
        this(displayName, isUnique, true, true);
    }

    Type(String displayName, boolean isUnique, boolean hasDirection) {
        this(displayName, isUnique, hasDirection, true);
    }

    Type(String displayName, boolean isUnique, boolean hasDirection, boolean placeAble) {
        this.displayName = displayName;
        this.hasDirection = hasDirection;
        this.placeAble = placeAble;
        unique = isUnique;
    }

    Type(String displayName) {
        this(displayName, false, true, true);
    }

    public boolean hasDirection() {
        return hasDirection;
    }

    public boolean isPlaceAble() {
        return placeAble;
    }

    public boolean isUnique() {
        return unique;
    }

    public String getDisplayName() {
        return displayName;
    }
}
