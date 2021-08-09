import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	JComboBox comboBox = new JComboBox();
	JButton add, exibir, voltar;
	JLabel  label2, label3, label4, label5, label6, label7, label8, label9;
	JTextField codigo, nome, autor, genero, numFaixas, editora, volume, ano;
	private JPanel panel;

	
	public static void main(String[] args) {
		
					TelaCadastro frame = new TelaCadastro();
				
	}

	
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(160, 450);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Livro", "DVD"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 34));
		comboBox.addItemListener(new ItemListener() {
			
			
			public void itemStateChanged(ItemEvent e) {
				 {
		                if(e.getStateChange()== 1 ) {
		                	label7.setVisible(false);
		                	editora.setVisible(false);
		                	label8.setVisible(false);
		                	volume.setVisible(false);
		                	label9.setVisible(false);
		                	ano.setVisible(false);
		                	
		    				numFaixas.setVisible(true);
		    				genero.setVisible(true);
		    				label5.setVisible(true);
		    				label6.setVisible(true);
		    				 
		                } 
		                    
		            }
				
			}
		});
			
			
		

				
							
				label2 = new JLabel("Código");
				label3 = new JLabel("Nome");
				label4 = new JLabel("Autor");
				label5 = new JLabel("Gênero");
				label6 = new JLabel("Nº Faixas");
				label7 = new JLabel("editora");
				label8 = new JLabel("volume");
				label9 = new JLabel("ano");
				codigo = new JTextField(12);
				nome = new JTextField(12);
				autor = new JTextField(12);
				genero = new JTextField(12);
				numFaixas = new JTextField(12);
				editora = new JTextField(12);
				volume = new JTextField(12);
				ano = new JTextField(12);
				
				add = new JButton("Add");
				exibir = new JButton("Exibir");
				voltar =  new JButton("Voltar");
				voltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
						new TelaInicial().setVisible(true);
					}
				});
				
				add(label2);
				add(codigo);
				add(label3);
				add(nome);
				add(label4);
				add(autor);
				add(label5);
				add(genero);
				add(label6);
				add(numFaixas);
				add(label7);
				add(editora);
				add(label8);
				add(volume);
				add(label9);
				add(ano);
				add(exibir);
				add(add);
				add(voltar);
				
				numFaixas.setVisible(false);
				genero.setVisible(false);
				label5.setVisible(false);
				label6.setVisible(false);
				
				
											
				setVisible(true);
/*
				
				livro.addItemListener(this);
				dvd.addItemListener(this);
				
				cadastrar.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						
						try{
						if (tipoCatalogo == 1){
							String c = codigo.getText()+"\n";
							String n = nome.getText()+"\n" ;
							String a = autor.getText()+"\n"; 
							String ed = editora.getText()+"\n";
							String v = volume.getText() +"\n";
							String an = ano.getText()+"\n";
						
						arrayLivro.add(new Livro(c, n, a, ed, v, an));
										
						} else if (tipoCatalogo == 2){
							String c = codigo.getText()+"\n";
							String n = nome.getText()+"\n" ;
							String a = autor.getText()+"\n"; 
							String g = genero.getText()+"\n";
							String nf = numFaixas.getText() +"\n";
							
						
						
							arrayDVD.add(new DVD(c, n, a, g, nf));
						} 
						
					} catch (Exception erro){
						System.out.println(erro.getMessage());
					}
					}
					
				});
				recuperar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						CatalogoCadastrado c = new CatalogoCadastrado();
						c.setVisible(true);
						c.run();
					}

				});
				
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
			}


			@Override
			public void itemStateChanged(ItemEvent e) {
				if (livro.isSelected()){
					tipoCatalogo = 1;
					
					editora.setVisible(true);
					ano.setVisible(true);
					volume.setVisible(true);
					label7.setVisible(true);
					label8.setVisible(true);
					label9.setVisible(true);
					
					numFaixas.setVisible(false);
					genero.setVisible(false);
					label5.setVisible(false);
					label6.setVisible(false);
					
				} else if(dvd.isSelected()){
					tipoCatalogo = 2;
					
					numFaixas.setVisible(true);
					genero.setVisible(true);
					label5.setVisible(true);
					label6.setVisible(true);
					
					editora.setVisible(false);
					ano.setVisible(false);
					volume.setVisible(false);
					label7.setVisible(false);
					label8.setVisible(false);
					label9.setVisible(false);

				}

			}
*/
		}
	}

