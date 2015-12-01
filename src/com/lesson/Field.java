package com.lesson;

public class Field {

    private static final int FIELD_SIZE = 3;
    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void showField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.println();
            this.ereseLine(i);
            this.showLine(i);
        }
        System.out.println();
    }

    public void ereseLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            field[i][lineNumber] = ' ';
            this.showCell(i,lineNumber);
        }
    }

    public void showLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            this.showCell(i,lineNumber);
        }
    }
    /**
     *
     * @param i
     */
    private void showCell(int i, int j) {
        System.out.print("[" + field[i][j] + "]");
    }
}
