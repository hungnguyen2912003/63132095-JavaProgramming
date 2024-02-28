package THplus_Bai14_JButton_Fahrenheit;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Bai14UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblFahrenheit;
	private JLabel lblCelsius;
	private JButton btnPress;
	private double F = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai14UI frame = new Bai14UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bai14UI() {
		setTitle("Fahrenheit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblFahrenheit = new JLabel("Fahrenheit temperature: ");
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFahrenheit.setBounds(58, 54, 339, 47);
		contentPane.add(lblFahrenheit);
		
		lblCelsius = new JLabel("Temperature in Celsius: ");
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCelsius.setBounds(43, 168, 383, 47);
		contentPane.add(lblCelsius);
		
		btnPress = new JButton("Press");
		btnPress.setFont(new Font("Arial", Font.PLAIN, 20));
		btnPress.setBounds(165, 111, 102, 47);
		contentPane.add(btnPress);
		btnPress.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				F++;
				lblFahrenheit.setText("Fahrenheit temperature: " + F);
				double C = (F - 32) * 5 / 9;
				DecimalFormat decimalFormat = new DecimalFormat("#.##");
				lblCelsius.setText("Temperature in Celsius: " + decimalFormat.format(C));
			}
		});
	}
}
