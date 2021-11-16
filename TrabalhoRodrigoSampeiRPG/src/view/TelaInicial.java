package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;

import Classes.Inimigo;
import Classes.Main;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;


public class TelaInicial extends Inimigo{

	private JFrame frame;
	private JTextField NomeText;
	public static int test;
	public String recebenome;
	public boolean nomerepetido ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 9));
		frame.setBounds(100, 100, 584, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Label1 = new JLabel("RPG FIGHTERS");
		Label1.setFont(new Font("Arial Black", Font.BOLD, 57));
		
		
		// CLASSE LABELS
		
		
		JLabel label2 = new JLabel("Classe:");
		
		NomeText = new JTextField();
		NomeText.setColumns(10);
		
		JLabel label3 = new JLabel("Nome:");
		
		JLabel lblNewLabel = new JLabel("Apareceu um goblin selvagem voc\u00EA deseja derrotalo ?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		

		
		
		JList list = new JList();
		
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setModel(new AbstractListModel() {
			
			// ARRAY DE CLASSES
			
			String[] values = new String[] {"Guerreiro", "Arqueiro", "Mago"};
			
			
			
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		
		
		list.setToolTipText("AKI AO");
		
		
		
		
		JButton btnNewButton = new JButton("BATALHAR!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				
	     
		
				
				// CLASSE SELECIONA CLASSE
				
				Main pv = new Main();
				if(list.getSelectedValue() == "Guerreiro") {
					 test = 1;
					 recebenome = "Guerreiro";
				}
				
				if(list.getSelectedValue() == "Arqueiro") {
					test = 2;
					recebenome = "Arqueiro";
				}
				
				if(list.getSelectedValue() == "Mago") {
					test = 3;
					recebenome = "Mago";
				}
				
				// CLASSE SE NOME IGUAL FAZ PIADA
				
				if(nomerepetido = NomeText.getText().equals(recebenome)) {
					JOptionPane.showMessageDialog(null, "Não Teve Criatividade no nome >:) kk");
				}
				
				JOptionPane.showMessageDialog(null, "Nome:"+ NomeText.getText() + "\nclasse:" + list.getSelectedValuesList()+"\n"+pv.Luta());

				
				
			}
			
			
				
				
				
				
			
		});

		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(62)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(161))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label2)
								.addComponent(label3))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(list, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(NomeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(90)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(347))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(202)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(Label1)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(Label1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label3)
						.addComponent(NomeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(label2)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	
	
}
