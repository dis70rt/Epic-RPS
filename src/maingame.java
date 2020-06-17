import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings({ "serial", "unused" })
public class maingame extends JFrame {

	private JPanel contentPane;
	static int value;
	static Object choice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maingame frame = new maingame();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public maingame() {
		setResizable(false);
		setTitle("The Epic Rock-Paper-Scissors v.0508");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Your Choice :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(35, 35, 222, 47);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rock", "Paper", "Scissors"}));
		comboBox.setBounds(267, 46, 159, 27);
		contentPane.add(comboBox);
		
		comboBox.setSelectedItem(null);
		Object comp = maingame.toGenerate(); 
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				int value1 = comboBox.getSelectedIndex();
				value = value1;
				String choice1 = (String) comboBox.getSelectedItem();
				choice = choice1;
				
				JLabel lblAlmightyChooses = new JLabel("Almighty Chooses :");
				lblAlmightyChooses.setForeground(Color.WHITE);
				lblAlmightyChooses.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
				lblAlmightyChooses.setBounds(35, 104, 222, 47);
				contentPane.add(lblAlmightyChooses);
				
				JLabel lblResult = new JLabel((String)comp);
				lblResult.setForeground(Color.WHITE);
				lblResult.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
				lblResult.setBounds(267, 104, 222, 47);
				contentPane.add(lblResult);
				
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.BLACK);
				panel.setBounds(10, 161, 557, 400);
				contentPane.add(panel);
				repaint();
				contentPane.repaint();
				
				if(value > 0 || value == 0) {
					panel.repaint();
					String result = (String) maingame.toDisplayResult(comp, choice);
					JLabel lblNewLabel_1 = new JLabel(result);
					lblNewLabel_1.setFont(new Font("Absolute", Font.PLAIN, 90));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setForeground(Color.RED);
					panel.add(lblNewLabel_1);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_1.show(true);
					panel.setVisible(true);
					lblNewLabel_1.repaint();
					contentPane.repaint();
					contentPane.invalidate();
					contentPane.validate();
					
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(437, 46, 85, 27);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				maingame obj = new maingame();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnPlayAgain.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPlayAgain.setBounds(99, 296, 159, 38);
		contentPane.add(btnPlayAgain);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
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
				
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_1.setBounds(313, 296, 159, 38);
		contentPane.add(button_1);
		
		
	}
	
	public static String toGenerate() {
		String x = null;
		Random generator = new Random();
		int y = generator.nextInt(2);
		
		switch (y) {
		case 0 : x = "Rock"; break;
		case 1 : x = "Paper"; break;
		case 2 : x = "Scissors"; break;
		}
		return x ;
	}
	
	public static Object toDisplayResult(Object comp2 , Object choice2) {
		String comp = (String) comp2;
		String c =  (String) choice2;
		String r = "" ;
			
		if(comp.equals(c))
			r = "Draw !!!";
		else if(comp.equals("Rock") && c.equals("Paper"))  
			r = "You Win !!!";
		else if(comp.equals("Rock") && (c.equals("Scissors")))
			r = "You Lose !!!";
		else if(comp.equals("Scissors") && c.equals("Paper"))
			r = "You Lose !!!";
		else if(comp.equals("Scissors") && c.equals("Rock"))
			r = "You Win !!!";
		else if(comp.equals("Paper") && c.equals("Scissors"))
			r = "You Win !!!";
		else if(comp.equals("Paper") && c.equals("Rock"))
			r = "You Lose !!!";
		return r;
		
	}
}
