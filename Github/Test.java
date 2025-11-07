public class Test {
    public Test() {
    }

    private void createAndShowGUI() {
        javax.swing.JFrame frame = new javax.swing.JFrame("Formulario");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());

        javax.swing.JButton button = new javax.swing.JButton("Presionar");
        button.addActionListener(e -> javax.swing.JOptionPane.showMessageDialog(frame, "Botón pulsado"));

        frame.add(button);
        frame.setSize(300, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new Test().createAndShowGUI());
    }
}
