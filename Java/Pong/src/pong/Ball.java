package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import java.util.Scanner;

public class Ball {
	
	public double x,y;
	public int width,height;
	
	public double dx,dy;
	public double speed = 1.7;  //Velocidade da bola
	
	public static int contEnemy = 0, contPlayer = 0; //Pontuação
	
	Scanner sc = new Scanner(System.in);
	String end;
	
	//Construtor com os valores iniciais
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 4;
		this.height = 4;
		
		int angle = new Random().nextInt(120 - 45) + 45 + 1;
		dx = Math.cos(Math.toRadians(angle));
		dy = Math.sin(Math.toRadians(angle));
	}
	
	//Parte lógica da bola
	public void tick() {
		if(x+(dx*speed) + width >= Game.WIDTH) {
			dx*= -1;
		}else if(x+(dx*speed) < 0) {
			dx*= -1;
		}
		
		//Ponto do inimigo
		if(y >= Game.HEIGHT) {
			contEnemy++;
			System.out.println("\nPonto do inimigo\n");
			score();
			new Game();
			if(contEnemy >= 5) {
				System.out.println("Game Over!");
				System.out.println("\nAperte qualquer tecla para jogar novamente: ");
				end = sc.nextLine();
				clearScore();
			}
			
			return;

		//Ponto do jogador
		}else if(y < 0) {
			contPlayer++;
			System.out.println("\nPonto do Player\n");
			score();
			new Game();
			if(contPlayer >= 5) {
				System.out.println("Você Ganhou, Parabéns!");
				System.out.println("\nAperte qualquer tecla para jogar novamente: ");
				end = sc.nextLine();
				clearScore();
			}
			return;
		}
		
		Rectangle bounds = new Rectangle((int)(x+(dx*speed)),(int)(y+(dy*speed)),width,height);
		
		Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y,Game.player.width,Game.player.height);
		Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x,(int)Game.enemy.y,Game.enemy.width,Game.enemy.height);
		
		if(bounds.intersects(boundsPlayer)) {
			int angle = new Random().nextInt(120 - 45) + 45 + 1;
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if(dy > 0)
				dy*= -1;
		}else if(bounds.intersects(boundsEnemy)) {
			int angle = new Random().nextInt(120 - 45) + 45 + 1;
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if(dy < 0)
				dy*= -1;
		}
		
		x+=dx*speed;
		y+=dy*speed;
	}
	
	//Mostra a pontuação do jogo
	public void score() {
		System.out.println("Player: "+contPlayer);
		System.out.println("Enemy: "+contEnemy);
	}
	
	//Limpa a pontuação dos players
	public void clearScore() {
		contPlayer = 0;
		contEnemy = 0;
	}
	
	//Parte gráfica da bola
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect((int)x,(int)y,width,height);
	}
	
}
