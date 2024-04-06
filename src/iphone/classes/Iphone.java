package iphone.classes;

import iphone.interfaces.Browser;
import iphone.interfaces.ReprodutorMusical;
import iphone.interfaces.Telefone;

public class Iphone implements Telefone, ReprodutorMusical, Browser {

	@Override
	public void call() {
		System.out.println("LIGANDO");
		
	}

	@Override
	public void reciveCall() {
		System.out.println("RECEBENDO LIGAÇÃO");
		
	}

	@Override
	public void VoiceMail() {
		System.out.println("ENVIANDO CORREIO DE VOZ");
		
	}

	@Override
	public void displayPage() {
		System.out.println("ABRINDO NOVA PAGINA");
		
	}

	@Override
	public void addTab() {
		System.out.println("ABRINDO NOVA ABA");
		
	}

	@Override
	public void UpdatePage() {
		System.out.println("ATUALIZANDO PAGINA");
		
	}

	@Override
	public void play() {
		System.out.println("PLAY");
		
	}

	@Override
	public void pause() {
		System.out.println("PAUSE");
		
	}

	@Override
	public void nextMusic() {
		System.out.println("PROXIMA MUSICA");
		
	}
	
}
