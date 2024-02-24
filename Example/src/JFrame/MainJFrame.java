package JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();	// Tao mot the hien (đoi tượng) của lop
		f.setTitle("Ví dụ Frame");	//Tieu de cửa so
		f.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
		f.setSize (300, 200); // kich thuớc cửa so
		//Quy định loại bố cục (Layout)
		f.setLayout(new FlowLayout());
		
		//Tao nut bam
		JButton okButton = new JButton("Nhấn tôi đi");

		//Tạo tai nghe
		okButton.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Mã xử lý khi user click chuột
				JDialog dialog = new JDialog();
				dialog.setTitle("Thông báo");
				dialog.setSize(220,120);
				dialog.show();
			}
		});
		
		JButton btnkhac = new JButton("Nhấn em đi");
		//gắn lên form
		f.add(okButton);
		f.add(btnkhac);
		//hiện form/frame
		f.show(); // hien cua số
	}
}
