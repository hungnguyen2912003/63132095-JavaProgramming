import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;

public class Bai18UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtenter;
	private JTextField txtkq;
	private JButton btnExit;
	private JButton btndouble;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuBar menuBar;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenu mnNewMenu_3;
	private JCheckBoxMenuItem chckbxmntmNewCheckItem;
	private JCheckBoxMenuItem chckbxmntmNewCheckItem_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai18UI frame = new Bai18UI();
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
	public Bai18UI() {
		setTitle("Event handling");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setLocation(101, 145);
		addPopup(contentPane, popupMenu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Read Only");
		popupMenu.add(mntmNewMenuItem_5);
		
		mnNewMenu_3 = new JMenu("Format Text");
		popupMenu.add(mnNewMenu_3);
		
		chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Insert");
		mnNewMenu_3.add(chckbxmntmNewCheckItem);
		
		chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Overtype");
		mnNewMenu_3.add(chckbxmntmNewCheckItem_1);
		
		JLabel lblNewLabel = new JLabel("Enter a number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 83, 145, 22);
		contentPane.add(lblNewLabel);
		
		txtenter = new JTextField();
		txtenter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtenter.setBounds(169, 78, 108, 33);
		contentPane.add(txtenter);
		txtenter.setColumns(10);
		
		btndouble = new JButton("Double is");
		btndouble.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btndouble.setBounds(289, 78, 145, 33);
		contentPane.add(btndouble);
		btndouble.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					String st = txtenter.getText();
					int num = Integer.parseInt(st);
					txtkq.setText(String.valueOf((int) num * 2));
				} catch (Exception e2) {
					// TODO: handle exception
					txtkq.setText("ERROR");
				}
			}
		});
		
		txtkq = new JTextField();
		txtkq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtkq.setEditable(false);
		txtkq.setColumns(10);
		txtkq.setBounds(148, 143, 108, 33);
		contentPane.add(txtkq);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(266, 143, 78, 33);
		contentPane.add(btnExit);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 460, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Save as");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}