package Enums;

public enum Language {

	c, java, cplus;

	Language() {

		System.out.println("this is constructor calling");
	}

	public static void main(String[] args) {
		Language language = Language.c;
		Language language1 = Language.java;
		Language language2 = Language.cplus;

		System.out.println(language + " " + language1 + " " + language2);
	}

}
