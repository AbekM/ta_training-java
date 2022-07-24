package com.epam.training.Asilbek_Makhmudov.compass;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private final int degrees;

    public static Direction ofDegrees(int degrees) {
        while (degrees < 0) {
            degrees += 360;
        }
        while (degrees > 360){
            degrees -= 360;
        }
        switch (degrees) {
            case 0: return N;
            case 45: return NE;
            case 90: return E;
            case 135: return SE;
            case 180: return S;
            case 225: return SW;
            case 270: return W;
            case 315: return NW;
            case 360: return N;
        }
        return null;

    }

    public static Direction closestToDegrees(int degrees) {
        Direction[] dirs = Direction.values();
        while (degrees < 0) {
            degrees += 360;
        }
        while (degrees > 360){
            degrees -= 360;
        }
        Direction result = N;
        for (Direction dir: dirs){
            if (Math.abs(dir.degrees - degrees) < Math.abs(result.degrees - degrees)){
                result = dir;
            }
            if (degrees == 360) return N;
        }
        return result;
    }

    public Direction opposite() {
        switch (this.degrees) {
            case 0: return S;
            case 45: return SW;
            case 90: return W;
            case 135: return NW;
            case 180: return N;
            case 225: return NE;
            case 270: return E;
            case 315: return SE;
            case 360: return S;
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        int answer =   Math.abs(this.degrees - direction.degrees);
        if (answer == 180) return answer;
        while (answer < 0) answer += 360;
        while (answer > 180) answer -= 360;
        return Math.abs(answer);
    }
}
