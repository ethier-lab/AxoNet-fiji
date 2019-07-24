package gt.ethier.axonet;

import java.io.File;
import java.io.IOException;
import net.imagej.ImageJ;
import org.apache.log4j.BasicConfigurator;
import org.scijava.widget.FileWidget;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

import ij.IJ;

/**
 * test AxoNet command.
 *
 * @author Matthew Ritch
 */
public final class Main {

	public static void main(final String[] args) throws IOException {
		BasicConfigurator.configure();
		// Launch ImageJ.
		final ImageJ ij = new ImageJ();
		ij.launch();
		// Load an image.
		final File file = ij.ui().chooseFile(null, FileWidget.OPEN_STYLE);
		if (file == null) return;
		final Object data = ij.io().open(file.getAbsolutePath());
		ij.ui().show(data);
		Context.class.getName();
		// Run the command.
				ij.command().run(AxoNet.class, true);
		//ij.quit(); //TODO somehow...
	}
}

