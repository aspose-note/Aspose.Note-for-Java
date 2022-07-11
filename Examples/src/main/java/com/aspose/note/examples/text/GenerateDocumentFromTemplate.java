package com.aspose.note.examples.text;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class GenerateDocumentFromTemplate {
    public static void main(String... args) throws IOException {
        // ExStart:GenerateDocumentFromTemplate
        String dataDir = Paths.get(Utils.getSharedDataDir(GenerateDocumentFromTemplate.class), "text").toString();


        HashMap<String, String> D = new HashMap<>();
        D.put("Company", "Atlas Shrugged Ltd");
        D.put("CandidateName", "John Galt");
        D.put("JobTitle", "Chief Entrepreneur Officer");
        D.put("Department", "Sales");
        D.put("Salary", "123456 USD");
        D.put("Vacation", "30");
        D.put("StartDate", "29 Feb 2024");
        D.put("YourName", "Ayn Rand");

        // Load the template document into Aspose.Note.
        Document d = new Document(Paths.get(dataDir, "JobOffer.one").toString());

        // Let's replace all template words
        for (RichText e : d.getChildNodes(RichText.class)) {
            for (Map.Entry<String, String> replace : D.entrySet()) {
                e.replace(String.format("${%s}", replace.getKey()), replace.getValue());
            }
        }

        d.save(Paths.get(dataDir, "JobOffer_out.one").toString());

        // ExEnd:GenerateDocumentFromTemplate
        System.out.println("\nThe document is generated successfully.");
    }
}
