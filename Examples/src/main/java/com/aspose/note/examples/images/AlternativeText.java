
package com.aspose.note.examples.images;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

public class AlternativeText {

	public static void main(String[] args) throws IOException {

		// ExStart:ImageAlternativeText
		String dataDir = Utils.getSharedDataDir(AlternativeText.class) + "images/";

		Document document = new Document();

		Page page = new Page(document);

		Image image = new Image(document, dataDir + "image.jpg");

		image.setAlternativeTextTitle("ImageAlternativeText Title");
		
		image.setAlternativeTextDescription("ImageAlternativeText Description");

		page.appendChildLast(image);

		document.appendChildLast(page);

		document.save(dataDir + "AlternativeText_out.one");
		// ExEnd:ImageAlternativeText
	}
}
