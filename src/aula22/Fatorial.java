package aula22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fatorial {

	private JFrame frame;
	private JTextField tfNumero;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial window = new Fatorial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fatorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número:");
		lblNewLabel.setBounds(10, 25, 62, 20);
		frame.getContentPane().add(lblNewLabel);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(58, 25, 198, 20);
		frame.getContentPane().add(tfNumero);
		tfNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(10, 56, 52, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setBounds(68, 61, 188, 20);
		frame.getContentPane().add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Fatorial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  numero = Integer.parseInt( tfNumero.getText()),
				fatorial = 1;
				while (numero >1 ) {
					fatorial *= numero;
					numero --;
				}
				tfResultado.setText(String.valueOf(fatorial));
				
			}
		});
		btnNewButton.setBounds(35, 116, 221, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
