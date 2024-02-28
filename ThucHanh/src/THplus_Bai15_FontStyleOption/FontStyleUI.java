package THplus_Bai15_FontStyleOption;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class FontStyleUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton rdbtnbold;
	private JRadioButton rdbtnItalic;
	private JLabel lbltxt;
	private Font font;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FontStyleUI frame = new FontStyleUI();
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
	public FontStyleUI() {
		setTitle("Style Options");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltxt = new JLabel("Say it with style!");
		lbltxt.setFont(new Font("Tahoma", Font.PLAIN, 40));
		font = lbltxt.getFont();
		lbltxt.setBounds(61, 56, 340, 100);
		contentPane.add(lbltxt);
		
		rdbtnbold = new JRadioButton("Bold");
		rdbtnbold.setBackground(new Color(128, 255, 255));
		rdbtnbold.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnbold.setBounds(122, 162, 103, 21);
		contentPane.add(rdbtnbold);
		
		rdbtnItalic = new JRadioButton("Italic");
		rdbtnItalic.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnItalic.setBackground(new Color(128, 255, 255));
		rdbtnItalic.setBounds(239, 162, 103, 21);
		contentPane.add(rdbtnItalic);
		
		rdbtnbold.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XuLyFont();
			}
		});
		
		rdbtnItalic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XuLyFont();
			}
		});
	}
	void XuLyFont() {
		int style = Font.PLAIN;
		if(rdbtnbold.isSelected()) {
			style += Font.BOLD;
		}
		
		if(rdbtnItalic.isSelected()) {
			style += Font.ITALIC;
		}
		
		Font styleFont = font.deriveFont(style);
		
		lbltxt.setFont(styleFont);
	}
}
