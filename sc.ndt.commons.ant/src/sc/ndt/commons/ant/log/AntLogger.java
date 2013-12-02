package sc.ndt.commons.ant.log;

import java.io.IOException;
import java.io.PrintStream;

import org.apache.tools.ant.DefaultLogger;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

public class AntLogger extends DefaultLogger {

	private IOConsole console = new IOConsole("Ant", null);
	private IOConsoleOutputStream outputStream = console.newOutputStream();

	public AntLogger() {
		ConsolePlugin.getDefault().getConsoleManager()
				.addConsoles(new IConsole[] { console });
	}

	@Override
	protected void printMessage(String message, PrintStream stream, int priority) {
		super.printMessage(message, stream, priority);
		try {
			outputStream.write(message + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}