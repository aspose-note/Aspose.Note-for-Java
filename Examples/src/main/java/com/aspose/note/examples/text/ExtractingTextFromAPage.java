package com.aspose.note.examples.text;

import com.aspose.note.Document;
import com.aspose.note.Node;
import com.aspose.note.NodeType;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

import java.util.List;
import java.util.stream.Collectors;

public class ExtractingTextFromAPage {
    public static void main(String[] args)
    {
        // ExStart:ExtractingTextFromAPage
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(ExtractingTextFromAPage.class) + "text\\";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Sample1.one");

        // Get list of page nodes
        List<Node> nodes = oneFile.getChildNodes(Node.class);

        if (nodes.size() > 0 && nodes.get(0).getNodeType() == NodeType.Page)
        {
            Page page = (Page)nodes.get(0);
            // Retrieve text
            List<RichText> textNodes = (List<RichText>) page.getChildNodes(RichText.class);
			StringBuilder text = new StringBuilder();
			for (RichText richText : textNodes) {
				text = text.append(richText.getText().toString());
			}
			
			// Print text on the output screen
            System.out.println(text);
        }
        // ExEnd:ExtractingTextFromAPage
    }
}
