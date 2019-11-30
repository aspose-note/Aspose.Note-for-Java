package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Notebook;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

public class ReadRichText {
	public static void main(String... args) throws IOException {
		// ExStart:ReadRichText
		String dataDir = Utils.getSharedDataDir(LoadingNotebook.class) + "Notebook/";
		Notebook rootNotebook = new Notebook(dataDir + "test.onetoc2");

		List<RichText> allRichTextNodes = rootNotebook.getChildNodes(RichText.class);
		for (RichText richTextNode : allRichTextNodes) {
			System.out.println(richTextNode.getText());
		}
		// ExEnd:ReadRichText
	}

}