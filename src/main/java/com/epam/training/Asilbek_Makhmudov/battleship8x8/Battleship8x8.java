package com.epam.training.Asilbek_Makhmudov.battleship8x8;

public class Battleship8x8 {
    private long shots = 0L;
    private final long ships;


    public Battleship8x8(final long ships) {
        this.ships = ships;
 /*       StringBuilder field = new StringBuilder(64);

        this.ships = ships;
        String sheps = Long.toBinaryString(ships);
        //System.out.println(sheps);

        for (int i = 0; i < sheps.length(); i++){

            if (sheps.charAt(i) == '0') {
                field.insert(i , ".");
            }
            if (sheps.charAt(i) == '1') field.insert(i , "☐");
        }
        if (field.length() == 63) {
            field.insert(0 , ".");
        }
        String shipField = field.toString();*/
    }

    public boolean shoot(String shot) {
        String map = Long.toBinaryString(ships);

        String bomb = Long.toBinaryString(shots);
        StringBuilder bombS = new StringBuilder(bomb);
        bombS.setLength(64);
        for (int i = 0; i < 64; i++) {
            if (bombS.charAt(i) != 0 || bombS.charAt(i) != 1) {
                bombS.setCharAt(i, '0');
            }
        }
        int realShot;
        int letter = 0;
        int number;

        switch (shot.charAt(0)){
            case 'A': letter = 1; break;
            case 'B': letter = 2; break;
            case 'C': letter = 3; break;
            case 'D': letter = 4; break;
            case 'E': letter = 5; break;
            case 'F': letter = 6; break;
            case 'G': letter = 7; break;
            case 'H': letter = 8;
        }

        number = Character.getNumericValue(shot.charAt(1));
        realShot = (number - 1) * 8 + letter - 1;
        bombS.setCharAt(realShot, '1');

        //shots += new BigInteger(bombS.toString(), 10).longValue();
        System.out.println(realShot);
        shots += Math.pow(2, 64 - realShot);
        System.out.println(shots);
        System.out.println();
        return map.charAt(realShot) == bombS.charAt(realShot);

        /*if (field.charAt(realShot) == '☐'){
            field.setCharAt(realShot, '☒');
            return true;
        }
        if (field.charAt(realShot) == '.'){
            field.setCharAt(realShot, '×');
            return false;
        }
        return false;*/
    }

    public String state() {
        String map = Long.toBinaryString(ships);
        StringBuilder shipLayout = new StringBuilder(map);
        //shots += 1;
        String bomb = Long.toBinaryString(shots);
        StringBuilder bombLayout = new StringBuilder(bomb);
        bombLayout.setLength(64);



        System.out.println(map);
        System.out.println(bombLayout);
        /*for (int i = 8; i <= 64; i+=9){
            field.insert(i, '\n');
        }
        return field.toString();*/
        return null;
    }
}
