package com.aspose.note.examples.text;

import com.aspose.note.*;
import java.io.IOException;
import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;

import java.util.*;

public class ReplaceTextonAllPages {
	public static void main(String... args) throws IOException {

		// ExStart:ReplaceTextonAllPages

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ReplaceTextonAllPages.class, inputFile);

		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(ReplaceTextonAllPages.class, outputFile);

		Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("2. Get organized", "New Text Here");

		// Load the document into Aspose.Note.
		LoadOptions options = new LoadOptions();
		Document oneFile = new Document(inputPath.toString(), options);

		// Get all RichText nodes
		List<RichText> textNodes = (List<RichText>) oneFile.getChildNodes(RichText.class);// <RichText.class>();

		// Traverse all nodes and compare text agains the key text
		for (RichText richText : textNodes) {
			for (String key : replacements.keySet()) {
				if (richText != null && richText.getText().contains(key)) {
					// Replace text of a shape
					richText.setText(richText.getText().replace(key, replacements.get(key)));
				}
			}
		}

		// Save to any supported file format
		oneFile.save(outputPath.toString(), SaveFormat.Pdf);

		// ExEnd:ReplaceTextonAllPages

	}
}
