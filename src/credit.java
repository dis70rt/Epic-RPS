import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class credit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					credit frame = new credit();
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
	public credit() {
		setResizable(false);
		setBackground(Color.BLACK);
		setTitle("The Epic Rock-Paper-Scissors v.0508");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 547);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("This Game Is Developed And Programmed By");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 64, 852, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Saikat Das");
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(10, 113, 852, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Follow Me On Instagram : @saikat._");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(10, 184, 852, 51);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Please Inform Me About Any Bugs , Glitch Or Problems Thorugh My Instagram");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setBounds(10, 245, 852, 51);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Stay Tuned For Future Updates");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_4.setBounds(10, 306, 852, 85);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				rockpaperscissor obj = null;
				try {
					obj = new rockpaperscissor();
				} catch (LineUnavailableException | UnsupportedAudioFileException | IOException
						| InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				obj.toBack();
				obj.setVisible(true);
				setVisible(false);
				contentPane.disable();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(357, 425, 159, 38);
		contentPane.add(btnNewButton);
	}

}
