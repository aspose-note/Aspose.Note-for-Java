package com.aspose.note.examples.license;

import com.aspose.note.Document;
import com.aspose.note.Metered;
import com.aspose.note.examples.Utils;
import com.aspose.note.examples.load.LoadPasswordProtectedOneNoteDoc;

import java.nio.file.Paths;

public class MeteredLicense {
        public static void main(String... args) throws Exception
        {
            // ExStart:UseMeteredLicense

            Metered metered = new Metered();
            metered.setMeteredKey("MyPublicKey", "MyPrivateKey");

            System.out.println(String.format("Credit before operation: %.02f", Metered.getConsumptionCredit()));
            System.out.println(String.format("Consumption quantity before operation: %.02f", Metered.getConsumptionQuantity()));

            String dataDir = Paths.get(Utils.getSharedDataDir(LoadPasswordProtectedOneNoteDoc.class), "load").toString();

            Document doc = new Document(Paths.get(dataDir,"Sample1.one").toString());
            doc.save(Paths.get(dataDir,"MeteredLicense.pdf").toString());

            System.out.println(String.format("Credit before operation: %.02f", Metered.getConsumptionCredit()));
            System.out.println(String.format("Consumption quantity before operation: %.02f", Metered.getConsumptionQuantity()));

            // ExEnd:UseMeteredLicense
        }
}
