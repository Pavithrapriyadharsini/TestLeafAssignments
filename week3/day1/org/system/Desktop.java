package org.system;

public class Desktop extends Computer{

	void desktopSize() {
		
		System.out.println("Desktop size");
		
	}
	
	public static void main(String[] args) {
		
		Desktop desktop=new Desktop();
		desktop.computerModel();
		desktop.desktopSize();

	}

}
