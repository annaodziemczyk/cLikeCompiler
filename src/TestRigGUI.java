

public class TestRigGUI {
	
	public static void main(String... args) throws Exception {
		
		String inputFile = "input.txt";
		if (args.length>0) {
			inputFile=args[0];
	    }
		org.antlr.v4.gui.TestRig.main(new String[]{"parser.Cmm", "program", "-gui", inputFile});
	}
	

}
