package sc.ndt.commons.ui.console;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleFactoryFAST implements IConsoleFactory {

	public static String CONSOLE_FAST_NAME = "FAST";
	
	private static MessageConsole 	console;
	private ConsolePlugin 			plugin;
	private IConsoleManager			cManager;		
	private MessageConsoleStream 	out;
	
	@Override
	public void openConsole() {
		
		console = getConsole();
				
	}

	public IConsoleManager getConsoleManager() {
		if(cManager == null)
			cManager = plugin.getConsoleManager();
		return cManager;
	}
	
	public MessageConsole getConsole() {
		
		// existing
		if(console == null) {
			plugin = ConsolePlugin.getDefault();
			IConsole[] existing = getConsoleManager().getConsoles();
			
			for (int i = 0; i < existing.length; i++)
				if (CONSOLE_FAST_NAME.equals(existing[i].getName()))
					console = (MessageConsole) existing[i];
			
		}
		
		// new
		if(console == null) {
			console = new MessageConsole("FAST", null);
			getConsoleManager().addConsoles(new IConsole[] { console });
		}
		
		return console;
	}
	
	
	public MessageConsoleStream getOutStream() {
		
		if (out == null)
			getConsole().newMessageStream();
		return out;
		
	}
	
}
