package day3;

import javax.swing.JOptionPane;

public class WorldsNicestProgram {
	

	public static void main(String[] args) {	
		String name;
		name = JOptionPane.showInputDialog ("What is your name?");
		System.out.println(name + ", you look lovley today");
		JOptionPane.showMessageDialog(null, (name + ", you look lovley today"));
	}

	
	
}
