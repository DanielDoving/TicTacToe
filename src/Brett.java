import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Brett extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static boolean[][] pressedAi = new boolean[3][3];
    static boolean[][] pressed = new boolean[3][3];
    Ai ai = new Ai();
    private JPanel contentPane;

    // Konstruktor
    public Brett() {

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 905, 930);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton buttonA1 = new JButton("");
        buttonA1.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonA1.setBounds(0, 0, 300, 300);
        contentPane.add(buttonA1);

        JButton buttonA2 = new JButton("");
        buttonA2.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonA2.setBounds(300, 0, 300, 300);
        contentPane.add(buttonA2);

        JButton buttonA3 = new JButton("");
        buttonA3.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonA3.setBounds(600, 0, 300, 300);
        contentPane.add(buttonA3);

        JButton buttonB1 = new JButton("");
        buttonB1.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonB1.setBounds(0, 300, 300, 300);
        contentPane.add(buttonB1);

        JButton buttonB2 = new JButton("");
        buttonB2.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonB2.setBounds(300, 300, 300, 300);
        contentPane.add(buttonB2);

        JButton buttonB3 = new JButton("");
        buttonB3.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonB3.setBounds(600, 300, 300, 300);
        contentPane.add(buttonB3);

        JButton buttonC1 = new JButton("");
        buttonC1.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonC1.setBounds(0, 600, 300, 300);
        contentPane.add(buttonC1);

        JButton buttonC2 = new JButton("");
        buttonC2.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonC2.setBounds(300, 600, 300, 300);
        contentPane.add(buttonC2);

        JButton buttonC3 = new JButton("");
        buttonC3.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
        buttonC3.setBounds(600, 600, 300, 300);
        contentPane.add(buttonC3);

        // Methoden B?ttens

        buttonA1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if(press(buttonA1, 0, 0)) {

                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);
                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }

        });

        buttonA2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonA2, 0, 1)) {

                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);
                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonA3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonA3, 0, 2)) {

                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);

                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonB1, 1, 0)) {

                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);

                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if(press(buttonB2, 1, 1)) {


                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);

                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonB3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonB3, 1, 2)) {

                    int[] y;
                    y = ai.getRandom();

                    ai.setPressed(y[0], y[1]);

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonC1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonC1, 2, 0)) {

                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);

                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonC2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonC2, 2, 1)) {

                    int[] y;
                    y = ai.getRandom();

                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }
                    ai.setPressed(y[0], y[1]);

                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    if (ai.checkWinAi() == true) {
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

        buttonC3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(press(buttonC3, 2, 2)) {
                    int[] y;
                    //Die Ki holt zufällig ein feld
                    y = ai.getRandom();

                    //Wir haben festgelegt das wir die Koordinate 4,4 zurückgeben wenn es ein unentschieden ist
                    if(y[0]==4 && y[1]==4){
                        JOptionPane.showMessageDialog(null, "It's a draw!");
                        System.exit(NORMAL);
                    }

                    //Hier wird relativ umständlich das das "O" für das Zufallsfeld gesetzt
                    ai.setPressed(y[0], y[1]);
                    if (y[0] == 0 && y[1] == 0) {
                        buttonA1.setText("O");
                    } else if (y[0] == 0 && y[1] == 1) {
                        buttonA2.setText("O");
                    } else if (y[0] == 0 && y[1] == 2) {
                        buttonA3.setText("O");
                    } else if (y[0] == 1 && y[1] == 0) {
                        buttonB1.setText("O");
                    } else if (y[0] == 1 && y[1] == 1) {
                        buttonB2.setText("O");
                    } else if (y[0] == 1 && y[1] == 2) {
                        buttonB3.setText("O");
                    } else if (y[0] == 2 && y[1] == 0) {
                        buttonC1.setText("O");
                    } else if (y[0] == 2 && y[1] == 1) {
                        buttonC2.setText("O");
                    } else if (y[0] == 2 && y[1] == 2) {
                        buttonC3.setText("O");
                    }

                    //Nun wird geprüft ob der Computer gewonnen hat
                    if (ai.checkWinAi()) {
                        //Falls der Computer gewonnen hat wird dem User angezeigt, dass er verloren hat
                        JOptionPane.showMessageDialog(null, "You Lost!");
                        System.exit(NORMAL);
                    }
                }
            }
        });

    }

    /**
     * Returns the button which has been pressed
     * @return the button which has been pressed
     */
    public static boolean[][] getPressed() {
        return pressed;
    }

    /**
     * Returns the button which has been selected by the AI
     * @return the button which has ben selected by the AI
     */
    public static boolean[][] getPressedAi() {
        return pressedAi;
    }

    /**
     * Presses a button and sets the Users character "X" in said button
     * @param button the Button which has been selected
     * @param zeile the column of the button
     * @param reihe the row of the button
     * @return
     */
    public boolean press(JButton button, int zeile, int reihe) {
        //Hier wird geprüft ob das Feld schon gewählt wurde
        if (!pressed[zeile][reihe] && !ai.getAiPressed()[zeile][reihe]) {
            //Falls das Feld verfügbar ist wird das Feld im array auf true geschalten
            pressed[zeile][reihe] = true;
            //Für den user wird im feld nun ein X gesetzt
            button.setText("X");

            //Falls das feld nicht mehr verfügbar ist...
        } else {
            //...erscheint ein Popup
            JOptionPane.showMessageDialog(null, "This field is already occupied!");
            return false;
        }

        //Nun wird geprüft ob der User gewonnen hat
        if (Ai.checkWinPlayer()) {
            //Falls der User gewonnen hat erscheint ein Popup und nachdem er den Popup schliesst, schliesst das Programm
            JOptionPane.showMessageDialog(null, "You win!");
            System.exit(NORMAL);
        }

        //Nun werden die noch offenen Felder an die KI geschickt, somit er eins auswählen kann
        ai.getAvailableMoves();

        return true;
    }
}
