package Main;

import java.util.ArrayList;
import Books.*;
import Client.*;


public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		Client client = new Client();

		book.start();
		client.start();
		
	}

}
