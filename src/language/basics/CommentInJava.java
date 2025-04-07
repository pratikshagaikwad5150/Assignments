package language.basics;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;

public class CommentInJava {

	public static void main(String[] args) {
		// this is print statement in java ,it will print and got to next line (single line comment)
		System.out.println("Hello world");
		
		/**Multiline comment **/
		/*this is also another print sttaement in java
		this will print all the conetent mentioned inside the()
		and it will;; stay on same line in console */
		System.out.println("Hello ");
	

		
		/**
	     *documentation comment `
	     * @author pratiksha 
	     * 
	     * @version 0.2
	     * @param exchange the exchange containing the request from the
	     *                 client and used to send the response
	     * @throws NullPointerException if exchange is {@code null}
	     * @throws IOException if an I/O error occurs
	     */

	}

}
