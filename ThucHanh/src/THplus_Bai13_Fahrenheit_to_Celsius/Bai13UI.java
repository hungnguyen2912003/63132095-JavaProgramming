package THplus_Bai13_Fahrenheit_to_Celsius;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Bai13UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai13UI frame = new Bai13UI();
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
	public Bai13UI() {
		setTitle("Fahrenheit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Enter Fahrenheit temperature: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(30, 54, 277, 47);
		contentPane.add(lblNewLabel);
		
		txtF = new JTextField();
		txtF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtF.setBounds(309, 62, 90, 31);
		contentPane.add(txtF);
		txtF.setColumns(10);
		
		JLabel lblTemperatureInCelsius = new JLabel("Temperature in Celsius: ");
		lblTemperatureInCelsius.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTemperatureInCelsius.setBounds(60, 130, 339, 47);
		contentPane.add(lblTemperatureInCelsius);
		
		txtF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					String sfString = txtF.getText();
					int F = Integer.parseInt(sfString);
					int C = (F - 32) * 5 / 9;
					lblTemperatureInCelsius.setText("Temperature in Celsius: " + C);
				} catch (Exception e2) {
					// TODO: handle exception
					lblTemperatureInCelsius.setText("Temperature in Celsius: ERROR");
				}
			}
		});
	}
}
