import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Pergunta5 extends JFrame implements ActionListener{
	
	Font fonte = new Font("Arial",Font.BOLD,15);
	JButton[] escolhas = new JButton[4];
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagens/pergunta5.png"));
	JLabel label = new JLabel(imagem);
	JLabel texto = new JLabel();
	JLabel texto1 = new JLabel();
	
	
	public Pergunta5() {
		
		escolhas[0] = new JButton("A");
		escolhas[1] = new JButton("B");
		escolhas[2] = new JButton("C");
		escolhas[3] = new JButton("D");
		
		texto.setBounds(20,20,500,20);
		texto.setFont(fonte);
		texto.setText("5 - Qual estrutura de dados em que o primeiro elemento");
		add(texto);
		
		texto1.setBounds(20,45,500,20);
		texto1.setFont(fonte);
		texto1.setText("que entra é o primeiro que sai, ou seja, é FIFO(first-in, first-out)?");
		add(texto1);
		
		label.setBounds(100, 100, 480, 200);
		add(label);
		
		setLayout(null);

		for(int i=0;i<escolhas.length;i++) {
			escolhas[i].setFont(fonte);
		}
		
		escolhas[0].setBounds(40,330,300,100);
		escolhas[1].setBounds(350,330,300,100);
		escolhas[2].setBounds(40,440,300,100);
		escolhas[3].setBounds(350,440,300,100);
		
		setTitle("Pergunta 5");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void setAlternativas(String altA,String altB,String altC,String altD) {
		
		for(int i=0;i<escolhas.length;i++) {
			escolhas[i].addActionListener(this);
		}
		
		escolhas[0].setText(altA);
		escolhas[1].setText(altB);
		escolhas[2].setText(altC);
		escolhas[3].setText(altD);
		
		for(int i=0;i<escolhas.length;i++) {
			add(escolhas[i]);
		}
	}
	//B
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==escolhas[1]) {
			dispose();
			mensagem();
		}else {
			JOptionPane.showMessageDialog(null, "Infelizmente Você Errou!\nTente novamente.", "Quiz", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		
	}
	
	public void mensagem() {
		JOptionPane.showMessageDialog(null, "Parabéns! Você Acertou", "Quiz", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Parabéns! Você Ganhou o Quiz :)", "Quiz", JOptionPane.PLAIN_MESSAGE);
	}
	
}
