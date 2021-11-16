package Classes;
import java.util.List;

import javax.swing.JOptionPane;

import view.TelaInicial;
public class Main extends TelaInicial {

	
	
	
	
public static void main(String[] args) {
	
}


@SuppressWarnings({ "static-access", "static-access", "static-access" })


//CLASSE SISTEMA DE LUTAS RANDOMIZA O DANO E AUMENTA A VIDA DEPENDENDO DA CLASSE
public String Luta() {
	TelaInicial tela = new TelaInicial();	
	int Classe;
	
	Jogador p1 = new Jogador();
	p1.vida = 10;
	p1.dano = 3;
	
	Inimigo p2 = new Inimigo();
	p2.vida = 10;
	p2.classemonstro = "Monstro";
	p2.dano = 2;
	
	int a1 = 4 , a2 = 2 ,a3 = 1;
	
	a1 += p1.vida;
	a2 += p1.vida;
	a3 += p1.vida;
	
	Classe = tela.test;
	
	
	
	
	while(p1.vida>0 || p2.vida>0) {
		
		
		
		
		
		
		
		// CLASSE GUERREIRO
		if(Classe == 1) {
			
			p1.dano = (int)(Math.random() * 7);
			p2.vida = p2.vida - p1.dano;
			
			int dano1 = (int)(Math.random() * 10);
			a1 = a1 - dano1;
			
		
			if(a1<=0) {
				
				return("Dano Causado:" +p1.dano+ "Vida Atual:"+ a1 +"\n Dano Recebido:"+ dano1 +" Vida do Inimigo:" + p2.vida +"\n Você Morreu");
			}

			if(p2.vida<=0) {
				return("Dano Causado:" +p1.dano+ "Vida Atual:"+ a1 +"\n Dano Recebido:"+ dano1 +" Vida do Inimigo:" + p2.vida + "\n Você Ganhou");
			}
		}
		// CLASSE ARQUEIRO
		if(Classe == 2) {
			
		p1.dano = (int)(Math.random() * 6);
		p2.vida = p2.vida - p1.vida;
		
		int dano1 = (int)(Math.random() * 10);
		a2 = a2 - dano1;
		
        if(a2<=0) {
			
			return("Dano Causado:" +p1.dano+ "Vida Atual:"+ a2 +"\n Dano Recebido:"+ dano1 +" Vida do Inimigo:" + p2.vida +"\n Você Morreu");
		}

		if(p2.vida<=0) {
			return("Dano Causado:" +p1.dano+ "Vida Atual:"+ a2 +"\n Dano Recebido:"+ dano1 +" Vida do Inimigo:" + p2.vida + "\n Você Ganhou");
		}
		
		}
		// CLASSE MAGO
		if(Classe == 3) {
			
			p1.dano = (int)(Math.random() * 10);
			p2.vida = p2.vida - p1.dano;
			
			int dano1 = (int)(Math.random() * 10);
			a3 = a3 - dano1;
			
	        if(a3<=0) {
				
				return("Dano Causado:" +p1.dano+ "Vida Atual:"+ a3 +"\n Dano Recebido:"+ dano1 +" Vida do Inimigo:" + p2.vida +"\n Você Morreu");
			}

			if(p2.vida<=0) {
				return("Dano Causado:" +p1.vida+ "Vida Atual:"+ a3 +"\n Dano Recebido:"+ dano1 +" Vida do Inimigo:" + p2.vida + "\n Você Ganhou");
			}
			}
		
        
         
		
		
		
		
	}
	
	return ("");
}


}



