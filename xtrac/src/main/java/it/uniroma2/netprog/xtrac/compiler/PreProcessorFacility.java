package it.uniroma2.netprog.xtrac.compiler;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

public class PreProcessorFacility {
    private static PreProcessorFacility ourInstance = new PreProcessorFacility();

    private Vector<Vector<String>> filesToSubstitute;

    public static PreProcessorFacility getInstance() {
        return ourInstance;
    }

    private PreProcessorFacility() {
        filesToSubstitute = new Vector<>();
    }

    public void add(Vector<String> files) {
        filesToSubstitute.add(files);
    }

    public void preProcessFile(String filename) throws IOException {
        try {
            Charset charset = StandardCharsets.UTF_8;
            Path originalFilePath = Paths.get(filename);
            String originalFile = new String(Files.readAllBytes(originalFilePath), charset);

            for(Vector<String> groupOfFileToSubstitute: filesToSubstitute) {
                String stringToSubstituteWith = new String();
                for(String file: groupOfFileToSubstitute) {
                    Path fileToInsertPath = Paths.get(file);
                    stringToSubstituteWith += new String(Files.readAllBytes(fileToInsertPath), charset);
                }
               originalFile = originalFile.replaceFirst("(import)([^;]*)(;)", stringToSubstituteWith);
            }

            Path newFilePath = Paths.get(filename+"i");
            Files.write(newFilePath, originalFile.getBytes(charset));
        } catch (IOException e) {
            throw new IOException("Unable to open source file");
        }
    }
}
