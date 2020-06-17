import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Color;

@SuppressWarnings({ "serial", "unused" })
public class music extends JFrame {

	private JPanel contentPane;
	static music frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new music();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public  music() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		
		AudioInputStream AOT = AudioSystem.getAudioInputStream(new File("music/AOT.wav"));
		AudioInputStream DS = AudioSystem.getAudioInputStream(new File("music/DS.wav"));
		AudioInputStream EG = AudioSystem.getAudioInputStream(new File("music/EG.wav"));
		AudioInputStream A = AudioSystem.getAudioInputStream(new File("music/A.wav"));
		AudioInputStream BL = AudioSystem.getAudioInputStream(new File("music/BL.wav"));
		AudioInputStream C = AudioSystem.getAudioInputStream(new File("music/C.wav"));
		AudioInputStream OTR = AudioSystem.getAudioInputStream(new File("music/OTR.wav"));
		
		Clip clip = AudioSystem.getClip();
		clip.close();
		clip.stop();
		
		
		setTitle("The Epic Rock-Paper-Scissors v.0508");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose Your Music :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(10, 10, 416, 50);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Demon Slayer - Gurenge", "Attack On Titan", "Eminem - Godzilla ", "Africa", "PewDiePie - Bitch Lasanga", "PewDiePie - Congratulations", "Old Town Roads"}));
		comboBox.setBounds(52, 70, 330, 28);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value = comboBox.getSelectedIndex();
				if(value == 0) {
					try {
						clip.open(DS);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				if(value == 1) {
					try {
						clip.open(AOT);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				if(value == 2) {
					try {
						clip.open(EG);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				if(value == 3) {
					try {
						clip.open(A);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				if(value == 4) {
					try {
						clip.open(BL);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				if(value == 5) {
					try {
						clip.open(C);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				if(value == 6) {
					try {
						clip.open(OTR);
					} catch (LineUnavailableException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					clip.loop(Clip.LOOP_CONTINUOUSLY);
					
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(158, 159, 116, 21);
		contentPane.add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				clip.removeLineListener(null);
				clip.close();
				
			}
		});
		btnStop.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnStop.setBounds(158, 184, 116, 21);
		contentPane.add(btnStop);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rockpaperscissor obj = null;
				try {
					obj = new rockpaperscissor();
				} catch (LineUnavailableException | UnsupportedAudioFileException | IOException
						| InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				obj.setVisible(true);
				dispose();
				
				
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(158, 208, 116, 21);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Due To Lack Of Knowledge Of The Programmer");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(10, 96, 416, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblYouCantChange = new JLabel("You Can't Change The Music After Exiting This Window");
		lblYouCantChange.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouCantChange.setForeground(Color.RED);
		lblYouCantChange.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblYouCantChange.setBounds(10, 108, 416, 41);
		contentPane.add(lblYouCantChange);
		
		JLabel lblForChangingThe = new JLabel("For Changing The Music You Need To Re-Run The Application");
		lblForChangingThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblForChangingThe.setForeground(Color.RED);
		lblForChangingThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblForChangingThe.setBounds(0, 222, 436, 41);
		contentPane.add(lblForChangingThe);
		
		
	}
}
