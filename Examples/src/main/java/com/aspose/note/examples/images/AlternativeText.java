
package com.aspose.note.examples.images;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

public class AlternativeText {

	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(AlternativeText.class) + "images/";

		Document document = new Document();

		Page page = new Page(document);

		Image image = new Image(document, dataDir + "image.jpg");

		image.setAlternativeText("ImageAlternativeText");

		page.appendChild(image);

		document.appendChild(page);

		document.save(dataDir + "AlternativeText_out.one");

	}
}
