package bingo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Bingo {

	public static void main(String[] args) {
		
		String[] bNum = new String[5];
		String[] iNum = new String[5];
		String[] nNum = new String[5];
		String[] gNum = new String[5];
		String[] oNum = new String[5];
		
		int posit = 285;
		String rpt, numChoice = null, rmvORadd = null;
		boolean agn = true;

		//create the JFrame (bingo card)
		JFrame bingoCard = new JFrame(); 
		//close the bingo card on exit
		bingoCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//adjust the height and width of the bingo card
		bingoCard.setSize(925, 1080);
		//center the bingo card on the screen
		bingoCard.setLocationRelativeTo(null);
		// disable the layout manager of the bingo card
		bingoCard.setLayout(null); 

		//create the labels for the B column
		JLabel labelTokenB0 = new JLabel();
		JLabel labelTokenB1 = new JLabel();
		JLabel labelTokenB2 = new JLabel();
		JLabel labelTokenB3 = new JLabel();
		JLabel labelTokenB4 = new JLabel();
	
		//create the labels for the I column
		JLabel labelTokenI0 = new JLabel();
		JLabel labelTokenI1 = new JLabel();
		JLabel labelTokenI2 = new JLabel();
		JLabel labelTokenI3 = new JLabel();
		JLabel labelTokenI4 = new JLabel();
		
		//create the labels for the N column
		JLabel labelTokenN0 = new JLabel();
		JLabel labelTokenN1 = new JLabel();
		JLabel labelTokenN2 = new JLabel();
		JLabel labelTokenN3 = new JLabel();
		JLabel labelTokenN4 = new JLabel();
		
		//create the labels for the G column
		JLabel labelTokenG0 = new JLabel();
		JLabel labelTokenG1 = new JLabel();
		JLabel labelTokenG2 = new JLabel();
		JLabel labelTokenG3 = new JLabel();
		JLabel labelTokenG4 = new JLabel();
	
		//create the labels for the O column
		JLabel labelTokenO0 = new JLabel();
		JLabel labelTokenO1 = new JLabel();
		JLabel labelTokenO2 = new JLabel();
		JLabel labelTokenO3 = new JLabel();
		JLabel labelTokenO4 = new JLabel();

		//set image for the label (LG)
		labelTokenB0.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenB1.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenB2.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenB3.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenB4.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenO0.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenO1.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenO2.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenO3.setIcon(new ImageIcon("./lightgraychipreal.png"));
		labelTokenO4.setIcon(new ImageIcon("./lightgraychipreal.png"));
		
		//set image for the label (P)
		labelTokenN0.setIcon(new ImageIcon("./pinkchipreal.png"));
		labelTokenN1.setIcon(new ImageIcon("./pinkchipreal.png"));
		labelTokenN2.setIcon(new ImageIcon("./pinkchipreal.png"));
		labelTokenN3.setIcon(new ImageIcon("./pinkchipreal.png"));
		labelTokenN4.setIcon(new ImageIcon("./pinkchipreal.png"));
	
		//set image for the label (DG)
		labelTokenI0.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenI1.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenI2.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenI3.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenI4.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenG0.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenG1.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenG2.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenG3.setIcon(new ImageIcon("./darkgraychipreal.png"));
		labelTokenG4.setIcon(new ImageIcon("./darkgraychipreal.png"));
	
		//set label position on bingo card (LG)
		labelTokenB0.setBounds((36), (243), labelTokenN0.getPreferredSize().width, labelTokenN0.getPreferredSize().height);
		labelTokenB1.setBounds((36), (398), labelTokenN1.getPreferredSize().width, labelTokenN1.getPreferredSize().height);
		labelTokenB2.setBounds((36), (553), labelTokenN2.getPreferredSize().width, labelTokenN2.getPreferredSize().height);
		labelTokenB3.setBounds((36), (708), labelTokenN3.getPreferredSize().width, labelTokenN3.getPreferredSize().height);
		labelTokenB4.setBounds((36), (863), labelTokenN4.getPreferredSize().width, labelTokenN4.getPreferredSize().height);
		labelTokenO0.setBounds((740), (243), labelTokenN0.getPreferredSize().width, labelTokenN0.getPreferredSize().height);
		labelTokenO1.setBounds((740), (398), labelTokenN1.getPreferredSize().width, labelTokenN1.getPreferredSize().height);
		labelTokenO2.setBounds((740), (553), labelTokenN2.getPreferredSize().width, labelTokenN2.getPreferredSize().height);
		labelTokenO3.setBounds((740), (708), labelTokenN3.getPreferredSize().width, labelTokenN3.getPreferredSize().height);
		labelTokenO4.setBounds((740), (863), labelTokenN4.getPreferredSize().width, labelTokenN4.getPreferredSize().height);
		
		//set label position on bingo card (P)
		labelTokenN0.setBounds((388), (243), labelTokenN0.getPreferredSize().width, labelTokenN0.getPreferredSize().height);
		labelTokenN1.setBounds((388), (398), labelTokenN1.getPreferredSize().width, labelTokenN1.getPreferredSize().height);
		labelTokenN2.setBounds((388), (553), labelTokenN2.getPreferredSize().width, labelTokenN2.getPreferredSize().height);
		labelTokenN3.setBounds((388), (708), labelTokenN3.getPreferredSize().width, labelTokenN3.getPreferredSize().height);
		labelTokenN4.setBounds((388), (863), labelTokenN4.getPreferredSize().width, labelTokenN4.getPreferredSize().height);
	
	//set label position on bingo card (DG)
		labelTokenI0.setBounds((213), (243), labelTokenN0.getPreferredSize().width, labelTokenN0.getPreferredSize().height);
		labelTokenI1.setBounds((213), (398), labelTokenN1.getPreferredSize().width, labelTokenN1.getPreferredSize().height);
		labelTokenI2.setBounds((213), (553), labelTokenN2.getPreferredSize().width, labelTokenN2.getPreferredSize().height);
		labelTokenI3.setBounds((213), (708), labelTokenN3.getPreferredSize().width, labelTokenN3.getPreferredSize().height);
		labelTokenI4.setBounds((213), (863), labelTokenN4.getPreferredSize().width, labelTokenN4.getPreferredSize().height);
		labelTokenG0.setBounds((564), (243), labelTokenN0.getPreferredSize().width, labelTokenN0.getPreferredSize().height);
		labelTokenG1.setBounds((564), (398), labelTokenN1.getPreferredSize().width, labelTokenN1.getPreferredSize().height);
		labelTokenG2.setBounds((564), (553), labelTokenN2.getPreferredSize().width, labelTokenN2.getPreferredSize().height);
		labelTokenG3.setBounds((564), (708), labelTokenN3.getPreferredSize().width, labelTokenN3.getPreferredSize().height);
		labelTokenG4.setBounds((564), (863), labelTokenN4.getPreferredSize().width, labelTokenN4.getPreferredSize().height);
		
		//create the JLabel (nintendo bingo card)
		JLabel nintendoBingo = new JLabel(); 
		//choose the image for the bingo card
		nintendoBingo.setIcon(new ImageIcon("./nintendoBingo.png"));
		//set the position of the bingo card on the JFrame
		nintendoBingo.setBounds((0), (0), nintendoBingo.getPreferredSize().width, nintendoBingo.getPreferredSize().height);
		
		//randomize all 5 numbers per column
		for (int i = 0; i < 5; i++) {
			//no repeats allowed (b)
			do { 
				
				//random numbers for B (1-15)
				rpt = Integer.toString((int) (Math.random() * 15 + 1));
			
			} while ((rpt.equals(bNum[0])) || (rpt.equals(bNum[1])) || (rpt.equals(bNum[2])) || (rpt.equals(bNum[3])));

			//set the random numbers (B)
			bNum[i] = rpt;

			//no repeats allowed (i)
			do { 

				//random numbers for I (16-30)
				rpt = Integer.toString((int) (Math.random() * 15 + 16));

			} while ((rpt.equals(iNum[0])) || (rpt.equals(iNum[1])) || (rpt.equals(iNum[2])) || (rpt.equals(iNum[3])));

			//set the random numbers (I)
			iNum[i] = rpt;

			//no repeats allowed (n)
			do { 

				//random numbers for N (31-45)
				rpt = Integer.toString((int) (Math.random() * 15 + 31));
			
			} while ((rpt.equals(nNum[0])) || (rpt.equals(nNum[1])) || (rpt.equals(nNum[2])) || (rpt.equals(nNum[3])));

			//set the random numbers (N)
			nNum[i] = rpt;

			//no repeats allowed (g)
			do { 

				//random numbers for G (46-60)
				rpt = Integer.toString((int) (Math.random() * 15 + 46));
			
			} while ((rpt.equals(gNum[0])) || (rpt.equals(gNum[1])) || (rpt.equals(gNum[2])) || (rpt.equals(gNum[3])));

			//set the random numbers (G)
			gNum[i] = rpt;

			//no repeats allowed (o)
			do { 

				//random numbers for I (61-75)
				rpt = Integer.toString((int) (Math.random() * 15 + 61));

			} while ((rpt.equals(oNum[0])) || (rpt.equals(oNum[1])) || (rpt.equals(oNum[2])) || (rpt.equals(oNum[3])));

			//set the random numbers (O)
			oNum[i] = rpt;
			
			//freeing the middle (free) space
			nNum[2] = null;
			
			//create label B
			JLabel labelB = new JLabel(); 
			//set text (B)
			labelB.setText(bNum[i]);
			//set the font size and type (B)
			labelB.setFont(new Font("Montserrat", Font.BOLD, 50));
			//set the font colour (B)
			labelB.setForeground(Color.LIGHT_GRAY);
			//set label position on bingo card (B)
			labelB.setBounds((83), (posit), labelB.getPreferredSize().width, labelB.getPreferredSize().height);

			//create label I
			JLabel labelI = new JLabel(); 
			//set text (I)
			labelI.setText(iNum[i]);
			//set the font size and type (I)
			labelI.setFont(new Font("Oswald", Font.BOLD, 50));
			//set the font colour (I)
			labelI.setForeground(Color.GRAY);
			//set label position on bingo card (I)
			labelI.setBounds((259), (posit), labelI.getPreferredSize().width, labelI.getPreferredSize().height);

			//create label N
			JLabel labelN = new JLabel();
			//set text (N)
			labelN.setText(nNum[i]);
			//set the font size and type (N)
			labelN.setFont(new Font("Nunito", Font.BOLD, 50));
			//set the font colour (N)
			labelN.setForeground(Color.PINK);
			//set label position on bingo card (N)
			labelN.setBounds((435), (posit), labelN.getPreferredSize().width, labelN.getPreferredSize().height);

			//create label G
			JLabel labelG = new JLabel();
			//set text (G)
			labelG.setText(gNum[i]);
			//set the font size and type (G)
			labelG.setFont(new Font("Open Sans", Font.BOLD, 50));
			//set the font colour (G)
			labelG.setForeground(Color.GRAY);
			//set label position on bingo card (G)
			labelG.setBounds((611), (posit), labelG.getPreferredSize().width, labelG.getPreferredSize().height);

			//create label O
			JLabel labelO = new JLabel();
			//set text (O)
			labelO.setText(oNum[i]);
			//set the font size and type (O)
			labelO.setFont(new Font("Open Sans", Font.BOLD, 50));
			//set the font colour (O)
			labelO.setForeground(Color.LIGHT_GRAY);
			//set label position on bingo card (O)
			labelO.setBounds((787), (posit), labelO.getPreferredSize().width, labelO.getPreferredSize().height);
			
			//add all the numbers on to the bingo card
			bingoCard.add(labelB);
			bingoCard.add(labelI);
			bingoCard.add(labelN);
			bingoCard.add(labelG);
			bingoCard.add(labelO);
			
			//move the positions of each numbers downwards
			posit = posit + 155;
		}	
	    //add the token on the free space
		bingoCard.add(labelTokenN2);
		
		//add the bingo card image to the JFrame
		bingoCard.add(nintendoBingo);

		// set visibility for the bingo card JFrame
		bingoCard.setVisible(true); 
		
		do {
			//called
			rmvORadd = JOptionPane.showInputDialog(null, "Would you like to remove or add a token.\nType '1' for remove and '2' for add");
			
			//add
			if (rmvORadd.equals("2")) {
				numChoice = JOptionPane.showInputDialog(null, "Type the NUMBER that was called (NO LETTERS)");
			
				if (numChoice.equals(bNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenB0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenB1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenB2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenB3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenB4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenI0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenI1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenI2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenI3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenI4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenN0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenN1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenN3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenN4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenG0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenG1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenG2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenG3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenG4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenO0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenO1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenO2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenO3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.add(labelTokenO4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "That number is not available");
				}
			}
			//remove
			if (rmvORadd.equals("1")) {
				numChoice = JOptionPane.showInputDialog(null, "Type the NUMBER of the token that you wish to remove (NO LETTERS)");
			
				if (numChoice.equals(bNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenB0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenB1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenB2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenB3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(bNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenB4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenI0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenI1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenI2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenI3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(iNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenI4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenN0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenN1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenN3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(nNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenN4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenG0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenG1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenG2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenG3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(gNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenG4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[0])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenO0);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[1])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenO1);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[2])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenO2);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[3])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenO3);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else if (numChoice.equals(oNum[4])) {
					bingoCard.setVisible(false);
					bingoCard.remove(labelTokenO4);
					bingoCard.add(nintendoBingo); 
					bingoCard.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "That token number is not available");
				}
			}
		} while (agn);
	}
}	