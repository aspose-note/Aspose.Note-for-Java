package com.aspose.note.examples.images;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

public class AddHyperlinkToImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String dataDir = Utils.getSharedDataDir(AlternativeText.class) + "images/";
		//ExStart: AddHyperlinkToImage
		Document document = new Document();
		Page page = new Page(document);
		Image image = new Image(document, dataDir + "image1.jpg");
		image.setHyperlinkUrl( "http://www.aspose.com");
		page.appendChildLast(image);
		document.appendChildLast(page);
		document.save(dataDir + "HyperlinkToImage_out.one");
		//ExEnd: AddHyperlinkToImage
	}

}
