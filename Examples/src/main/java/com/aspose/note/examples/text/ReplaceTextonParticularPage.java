package com.aspose.note.examples.text;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ReplaceTextonParticularPage {

	public static void main(String... args) throws IOException {
		// ExStart:ReplaceTextOnParticularPage
		String dataDir = Utils.getSharedDataDir(ReplaceTextonParticularPage.class) + "text/";

		Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("2. Get organized", "New Text Here");

		// Load the document into Aspose.Note.
		Document oneFile = new Document(dataDir + "Sample1.one", new LoadOptions());

		List<Page> pageNodes = (List<Page>) oneFile.getChildNodes(Page.class);

		// Get all RichText nodes
		List<RichText> textNodes = (List<RichText>) pageNodes.get(0).getChildNodes(RichText.class);

		for (RichText richText : textNodes) {
			for (String key : replacements.keySet()) {
				// Replace text of a shape
				richText.replace(key, replacements.get(key));
			}
		}

		// Save to any supported file format
		oneFile.save(dataDir + "ReplaceTextonParticularPage_out.pdf", SaveFormat.Pdf);
		// ExEnd:ReplaceTextOnParticularPage
	}

}
