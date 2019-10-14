package utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public final class SharedUtils {
    public static boolean compareApprox(float a, float b, float epsilon) {
        return Math.abs(a - (b)) < epsilon;
    }

    public static float clampAngle(float degrees) {
        if (degrees >= 0 && degrees < 360) return degrees;
        if (degrees <= -360) degrees = (degrees % 360) * 360;
        return degrees >= 0 ? degrees : degrees + 360;
    }

    public static int roundToClosestSide(double num, int segmentSize) {
        int integer = (int) num;
        int leftSide = (integer / segmentSize) * segmentSize;
        int rightSide = leftSide + segmentSize;
        int leftDiff = integer - leftSide;
        return (Math.min(leftDiff, rightSide - integer)) == leftDiff ? leftSide : rightSide;
    }

    public static String getStringFromJson(JsonObject jsonObject, String key, String fallback) {
        JsonElement jsonElement = jsonObject.get(key);
        String result;
        if (jsonElement == null) {
            result = fallback;
        } else {
            result = jsonElement.getAsString();
        }
        return result;
    }

    public static boolean getBooleanFromJson(JsonObject jsonObject, String key, boolean fallback) {
        JsonElement jsonElement = jsonObject.get(key);
        boolean result;
        if (jsonElement == null) {
            result = fallback;
        } else {
            result = jsonElement.getAsBoolean();
        }
        return result;
    }

    public static float getFloatFromJson(JsonObject jsonObject, String key, float fallback) {
        JsonElement jsonElement = jsonObject.get(key);
        float result;
        if (jsonElement == null) {
            result = fallback;
        } else {
            result = jsonElement.getAsFloat();
        }
        return result;
    }

}
