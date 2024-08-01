public class EscapeSequencesSample {
	public static void main(String[] args) {
		System.out.println("This is a new line.\n");
		System.out.println("Bonjour\tworld!\n");
		System.out.println("Mademoiselle said, \"Bonjour\"\n");
		System.out.println("Monsieur said, \'I\'m happy.\'\n"); 
        // Note: Use escape sequence for single quote
		System.out.println("This is a backslash: \\ \n");
		System.out.println("Bonjour\bWorld\n"); 
        // Note: Backspace has no effect in many environments.
		System.out.println("Carriage return:\rOverwritten text\n");
		System.out.println("Form feed:\fBonjour\fMademoiselle\n");
	}
}

/*
    OUTPUT
    This is a new line.

    Bonjour world!

    Mademoiselle said, "Bonjour"

    Monsieur said, 'I'm happy.'

    This is a backslash: \ 

    BonjouWorld

    Overwritten text

    Form feed:
    Bonjour
    Mademoiselle
 
 */