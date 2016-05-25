package chess;

public class Chess {

    static String store = "♔♕♖♗♘♙♚♛♜♝♞♟";
    static char wking = '♔';
    static char wqueen = '♕';
    static char wrook = '♖';
    static char wbishop = '♗';
    static char wknight = '♘';
    static char wpawn = '♙';
    static char bking = '♚';
    static char bqueen = '♛';
    static char brook = '♜';
    static char bbishop = '♝';
    static char bknight = '♞';
    static char bpawn = '♟';
    static char space1 = '█';
    static char space2 = ' ';

    public static char[][] board = new char[8][8];

    public static void main(String[] args) {
        board[2][5] = wknight;
        draw();
    }// end of main

    public static void draw() {
        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != wking && board[i][j] != wqueen && board[i][j] != wrook && board[i][j] != wbishop && board[i][j] != wknight && board[i][j] != wpawn
                            && board[i][j] != bking && board[i][j] != bqueen && board[i][j] != brook && board[i][j] != bbishop && board[i][j] != bknight && board[i][j] != bpawn) {
//                        System.out.print("∶∶");
                        if (j % 2 == 0) {
                            if (i % 2 == 0) {
                                System.out.print(space1);
                                System.out.print(space1);
                            } else {
                                System.out.print(space2);
                                System.out.print(space2);
                            }
//                            System.out.print(space1);
                        } else {
                            if (i % 2 == 0) {
                                System.out.print(space2);
                                System.out.print(space2);
                            } else {
                                System.out.print(space1);
                                System.out.print(space1);
                            }

                        }
                    } else {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print(space1);
                                System.out.print(board[i][j]);
                                System.out.print('⃣');
                            } else {
                                System.out.print(space2);
                                System.out.print(board[i][j]);
                            }
                        } else {
                            if (j % 2 == 0) {
                                System.out.print(space2);
                                System.out.print(board[i][j]);
                            } else {
                                System.out.println(space1);
                                System.out.print(board[i][j]);
                                System.out.print('⃣');
                            }
                        }
                    }
                } else if (board[i][j] != wking && board[i][j] != wqueen && board[i][j] != wrook && board[i][j] != wbishop && board[i][j] != wknight && board[i][j] != wpawn
                        && board[i][j] != bking && board[i][j] != bqueen && board[i][j] != brook && board[i][j] != bbishop && board[i][j] != bknight && board[i][j] != bpawn) {
                    if (j % 2 == 0) {
                        if (i % 2 == 0) {
                            System.out.print(space1);
                            System.out.println(space1);
                        } else {
                            System.out.print(space2);
                            System.out.println(space2);
                        }
//                            System.out.print(space1);
                    } else {
                        if (i % 2 == 0) {
                            System.out.print(space2);
                            System.out.println(space2);
                        } else {
                            System.out.print(space1);
                            System.out.println(space1);
                        }

                    }
                } else {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print(space1);
                            System.out.print(board[i][j]);
                            System.out.println('⃣');
                        } else {
                            System.out.print(board[i][j]);
                            System.out.println(space2);
                        }
                    } else {
                        if (j % 2 == 0) {
                            System.out.print(board[i][j]);
                            System.out.println(space2);
                        } else {
                            System.out.print(space1);
                            System.out.print(board[i][j]);
                            System.out.println('⃣');
                        }
                    }
                }
            }
        }
    }
}
