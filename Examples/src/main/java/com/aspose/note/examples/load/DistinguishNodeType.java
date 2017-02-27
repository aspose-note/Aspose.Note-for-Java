package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.NodeType;

public class DistinguishNodeType {
    public  static void main(String[] args)
    {
        // ExStart:DistinguishNodeType
        Document doc = new Document();

        // Returns NodeType.Document
        System.out.println(doc.getNodeType());
        // ExEnd:DistinguishNodeType
    }
}
