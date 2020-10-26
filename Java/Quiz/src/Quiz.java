
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Quiz extends JFrame implements ActionListener{
	
	Font fonte = new Font("Arial",Font.BOLD,50);
	
	JButton inicio = new JButton("Iniciar");
	JButton sair = new JButton("Sair");
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagens/quiz.png"));
	JLabel label = new JLabel(imagem);
	JLabel texto = new JLabel();
	
	public String nome; 
	
	public String getNome() {
		return nome;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inicio) {
			dispose();
			comeco();
			Pergunta1 pergunta1 = new Pergunta1();
			pergunta1.setAlternativas("Lista Ligada Simples","Lista Ligada Circular","<html>Lista Duplamente <br>Ligada Circular</html>"
					,"Lista Duplamente Ligada");
		}else {
			System.exit(0);
		}
	}
	
	public Quiz() {
		
		inicio.addActionListener(this);
		sair.addActionListener(this);
		
		texto.setBounds(190,20,300,100);
		texto.setFont(fonte);
		texto.setText("QUIZ AEDI");
		add(texto);
		
		label.setBounds(50, 100, 550, 350);
		add(label);
		
		setLayout(null);
		
		inicio.setBounds(200,470,100,50);
		add(inicio);
		sair.setBounds(350,470,100,50);
		add(sair);
		
		setTitle("Quiz");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		
	public void comeco() {
		JOptionPane.showMessageDialog(null, "Bem vindo ao Quiz de AEDI!", "Quiz", JOptionPane.PLAIN_MESSAGE);
		nome = JOptionPane.showInputDialog(null,"Qual o seu nome? ", "Quiz", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Bem vindo "+nome, "Quiz", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		new Quiz();
	}
}