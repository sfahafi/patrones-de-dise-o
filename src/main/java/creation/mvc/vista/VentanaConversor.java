package creation.mvc.vista;

import creation.mvc.controlador.ControlConversor;

public class VentanaConversor extends javax.swing.JFrame implements InterfazVista {

    public VentanaConversor() {
        initComponents();
        btnAPesos.setActionCommand(APESOS);
        btnAEuros.setActionCommand(AEUROS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantidad = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnAEuros = new javax.swing.JButton();
        btnAPesos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Euro Pesos");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAEuros.setText("A Euros");

        btnAPesos.setText("A Pesos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnAPesos)
                        .addGap(110, 110, 110)
                        .addComponent(btnAEuros)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAPesos)
                    .addComponent(btnAEuros))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    @Override
    public void setControlador(ControlConversor c) {
        btnAPesos.addActionListener(c);
        btnAEuros.addActionListener(c);
    }

    @Override
    public void arranca() {
        pack(); // coloca los componentes
        setLocationRelativeTo(null); // centra la ventana  en la pantalla
        setVisible(true); // visualiza la ventana
    }

    @Override
    public double getCantidad() {
        try {
            return Double.parseDouble(txtCantidad.getText());
        } catch (NumberFormatException e) {
            return 0.0D;
        }
    }

    @Override
    public void escribeCambio(String s) {
        lblResultado.setText(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAEuros;
    private javax.swing.JButton btnAPesos;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
