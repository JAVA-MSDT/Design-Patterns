package com.javamsdt.singleton.enumsingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Runner {

	public static void main(final String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		PrinterEnymSingleton enymSingleton = PrinterEnymSingleton.INSTANCE;
		enymSingleton.print("PrinterEnymSingleton");

		// ============== Write To File ( Serialize ) ============== //
		PrinterEnymSingleton enumSingletonSerilazier = PrinterEnymSingleton.INSTANCE;
		ObjectOutput output = new ObjectOutputStream(new FileOutputStream("files/serilaize.ser"));
		output.writeObject(enumSingletonSerilazier);
		output.close();

		// ============== Read From File ( DeSerialize ) ============== //
		ObjectInput input = new ObjectInputStream(new FileInputStream("files/serilaize.ser"));
		PrinterEnymSingleton enumSingletonSerilazier2 = (PrinterEnymSingleton) input.readObject();
		input.close();

		System.out.println("enumSingletonSerilazier HashCode: " + enumSingletonSerilazier.hashCode());
		System.out.println("enumSingletonSerilazier HashCode: " + enumSingletonSerilazier2.hashCode());
	}

}
