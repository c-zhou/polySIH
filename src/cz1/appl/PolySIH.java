package cz1.appl;

import org.apache.log4j.Logger;

import cz1.tools.Phaser;

public class PolySIH {
	
	protected final static Logger myLogger = 
			Logger.getLogger(PolySIH.class);
	
	public static void main(String[] args) {
	
		if(args.length<1) {
			printUsage();
			throw new RuntimeException("Undefined tool!!!");
		}
		String[] args2 = new String[args.length-1];
		System.arraycopy(args, 1, args2, 0, args2.length);
		switch(args[0].toLowerCase()) {
		case "phaser":
			Phaser phaser = new Phaser();
			phaser.setParameters(args2);
			phaser.run();
			break;
		default:
			printUsage();
			throw new RuntimeException("Undefined tool!!!");
		}
	}
	
	private static void printUsage() {
		// TODO Auto-generated method stub
		myLogger.info(
				"\n\nUsage is as follows:\n"
						+ " phaser             Run PolySIH for single individual haplotype phasing.\n\n");
	}
}
