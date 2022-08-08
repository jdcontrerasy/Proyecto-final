package co.edu.udistrital.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class BotonesInicio extends JPanel{
	private JButton btniniciar;
	private JButton btncomojugar;
	
	public BotonesInicio (){
		
		setLayout(new GridLayout(2,1));
		
		btniniciar = new JButton();
		btniniciar.setText("Jugar");
		btniniciar.setActionCommand("JUGAR");
		
		btncomojugar = new JButton();
		btncomojugar.setText("Como Jugar");
		btncomojugar.setActionCommand("INSTRUCCIONES");
		
		add(btniniciar);
		add(btncomojugar);
	}

	public JButton getBtniniciar() {
		return btniniciar;
	}

	public void setBtniniciar(JButton btniniciar) {
		this.btniniciar = btniniciar;
	}

	public JButton getBtncomojugar() {
		return btncomojugar;
	}

	public void setBtncomojugar(JButton btncomojugar) {
		this.btncomojugar = btncomojugar;
	}
	
	
}
