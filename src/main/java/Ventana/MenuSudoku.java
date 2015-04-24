package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class MenuSudoku extends JFrame {
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
MenuSudoku frame = new MenuSudoku();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public MenuSudoku() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
PanelImagen p = new PanelImagen();
p.setBorder(new EmptyBorder(5, 5, 5, 5));
p.setLayout(new BorderLayout(0, 0));
setContentPane(p);
}
}