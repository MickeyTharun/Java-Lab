package firstproject;

import java.util.ArrayList;
import java.util.Random;

public class hangman2{

	// Java Keywords
	public static final String[] WORDS = {
			"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
      "CASE", "CATCH", "CHAR", "CLASS", "CONST",
			"CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE", 
      "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
			"FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", 
      "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG",
			"NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE", 
      "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC",
			"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
      "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE",
			"TRY", "VOID", "VOLATILE", "WHILE"
	};
	
	public static final Random RANDOM = new Random();
	// Max errors before user lose
	public static final int MAX_ERRORS = 8;
	// Word to find
	private String wordToFind;
	// Word found stored in a char array to show progression of user
	private char[] wordFound;
	private int nbErrors;
	// letters already entered by user
	private ArrayList<String> letters = new ArrayList<>();
  
  // ...
  
  }