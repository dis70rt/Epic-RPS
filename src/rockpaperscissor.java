import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.net.*;
import javax.management.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JToggleButton;
import java.awt.SystemColor;


@SuppressWarnings({ "unused", "deprecation", "serial" })
public class rockpaperscissor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rockpaperscissor frame = new rockpaperscissor();
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
	 * @throws InterruptedException 
	 */
	public rockpaperscissor() throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
		
		AudioInputStream AOT = AudioSystem.getAudioInputStream(new File("music/AOT.wav"));
		AudioInputStream DS = AudioSystem.getAudioInputStream(new File("music/DS.wav"));
		AudioInputStream EG = AudioSystem.getAudioInputStream(new File("music/EG.wav"));
		
		Clip clip = AudioSystem.getClip();
		
		//Thread.sleep(10000);
		
		setResizable(false);
		setTitle("The Epic Rock-Paper-Scissors v.0508");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 545);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hi, I am Almighty...");
		lblNewLabel.setFont(new Font("Absolute", Font.PLAIN, 96));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 0, 852, 110);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thanks For Downloading :");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 107, 852, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The Epic Rock-Paper-Scissors v.0508");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Cheetah Kick - Personal Use", Font.PLAIN, 60));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(10, 157, 852, 62);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Play Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				maingame obj = new maingame();
				obj.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Absolute", Font.PLAIN, 50));
		btnNewButton.setBounds(310, 271, 277, 49);
		contentPane.add(btnNewButton);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				credit obj = new credit();
				obj.toBack();
				obj.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCredits.setFont(new Font("Absolute", Font.PLAIN, 50));
		btnCredits.setBounds(310, 330, 277, 49);
		contentPane.add(btnCredits);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnClose.setFont(new Font("Absolute", Font.PLAIN, 50));
		btnClose.setBounds(310, 446, 277, 49);
		contentPane.add(btnClose);
		
		JButton btnMusicSettings = new JButton("Music Settings");
		btnMusicSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				music obj = null;
				try {
					obj = new music();
				} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				obj.setVisible(true);
				setVisible(false);
				
			}
		});
		btnMusicSettings.setFont(new Font("Absolute", Font.PLAIN, 50));
		btnMusicSettings.setBounds(310, 389, 277, 49);
		contentPane.add(btnMusicSettings);
	}
}
