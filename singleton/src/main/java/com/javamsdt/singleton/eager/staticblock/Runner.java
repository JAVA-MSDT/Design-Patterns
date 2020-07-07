package com.javamsdt.singleton.eager.staticblock;

public class Runner {

	public static void main(final String[] args) {
		PrinterStaticBlockSingleton staticBlock = PrinterStaticBlockSingleton.getInstance();
		staticBlock.print("PrinterStaticBlockSingleton");
	}

}
