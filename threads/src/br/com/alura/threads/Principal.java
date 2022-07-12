package br.com.alura.threads;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Isso é o incio de uma Thread");
		
		Thread.sleep(30000);
		
		System.out.println("A Thread acordou");
	}

}
