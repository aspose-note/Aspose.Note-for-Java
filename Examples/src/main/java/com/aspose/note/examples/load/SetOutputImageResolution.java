package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class SetOutputImageResolution {
	public static void main(String... args) throws IOException {
		//ExStart: SetOutputImageResolution
		String dataDir = Utils.getSharedDataDir(SetOutputImageResolution.class) + "load/";

		Document doc = new Document(dataDir + "Sample1.one");

		ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.Jpeg);

		imageSaveOptions.setResolution(120);

		doc.save(dataDir + "SetOutputImageResolution_out.jpeg", imageSaveOptions);
		//ExEnd: SetOutputImageResolution
	}
}
