package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.FileFormat;
import com.aspose.note.examples.Utils;

public class GetFileFormatInfo {
	public static void main(String... args) throws IOException {
		
		String dataDir = Utils.getSharedDataDir(GetFileFormatInfo.class) + "load/";
	
		Document document = new Document(dataDir + "Aspose.one");
		switch (document.getFileFormat())
		{
		    case FileFormat.OneNote2010:
		        // Process OneNote 2010
		        break;
		    case FileFormat.OneNoteOnline:
		        // Process OneNote Online
		        break;
		}
	}

}
