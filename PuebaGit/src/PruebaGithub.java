public class PruebaGithub {
	
	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JButton;
	import javax.swing.JTextField;
	import javax.swing.JLabel;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class calculadora extends JFrame {

		private JPanel contentPane;
		private JTextField Num1;
		private JTextField Num2;
		private JTextField Resultado;

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						calculadora frame = new calculadora();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public calculadora() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton Suma = new JButton("Sumar");
			Suma.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent sumar) {
					int Solucion = Integer.parseInt(Num1.getText())+ Integer.parseInt(Num2.getText());
					
					Resultado.setText(String.valueOf(Solucion));
				}
			});
			Suma.setBounds(98, 116, 89, 23);
			contentPane.add(Suma);
			
			JButton Resta = new JButton("Restar");
			Resta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						int Solucion = Integer.parseInt(Num1.getText())- Integer.parseInt(Num2.getText());
					
					Resultado.setText(String.valueOf(Solucion));
				}
			});
			Resta.setBounds(247, 116, 89, 23);
			contentPane.add(Resta);
			
			Num1 = new JTextField();
			Num1.setBounds(172, 30, 86, 20);
			contentPane.add(Num1);
			Num1.setColumns(10);
			
			Num2 = new JTextField();
			Num2.setBounds(172, 74, 86, 20);
			contentPane.add(Num2);
			Num2.setColumns(10);
			
			Resultado = new JTextField();
			Resultado.setBounds(172, 168, 86, 20);
			contentPane.add(Resultado);
			Resultado.setColumns(10);
			
			JLabel Numero1 = new JLabel("Primer Número");
			Numero1.setBounds(61, 33, 101, 14);
			contentPane.add(Numero1);
			
			JLabel Numero2 = new JLabel("Segundo Número");
			Numero2.setBounds(61, 77, 101, 14);
			contentPane.add(Numero2);
			
			JLabel ResultadoFinal = new JLabel("Resultado");
			ResultadoFinal.setBounds(87, 171, 75, 14);
			contentPane.add(ResultadoFinal);
		}
	}
}
