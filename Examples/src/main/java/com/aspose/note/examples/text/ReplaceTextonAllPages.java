package com.aspose.note.examples.text;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ReplaceTextonAllPages {
	public static void main(String... args) throws IOException {
		// ExStart:ReplaceTextOnAllPages
		String dataDir = Utils.getSharedDataDir(ReplaceTextonAllPages.class) + "text/";

		Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("2. Get organized", "New Text Here");

		// Load the document into Aspose.Note.
		LoadOptions options = new LoadOptions();
		Document oneFile = new Document(dataDir + "Sample1.one", options);

		// Get all RichText nodes
		List<RichText> textNodes = (List<RichText>) oneFile.getChildNodes(RichText.class);// <RichText.class>();

		// Traverse all nodes and compare text against the key text
		for (RichText richText : textNodes) {
			for (String key : replacements.keySet()) {
				if (richText != null && richText.getText().contains(key)) {
					// Replace text of a shape
					richText.setText(richText.getText().replace(key, replacements.get(key)));
				}
			}
		}

		// Save to any supported file format
		oneFile.save(dataDir + "ReplaceTextonAllPages_out.pdf", SaveFormat.Pdf);
		// ExEnd:ReplaceTextOnAllPages
	}
}
