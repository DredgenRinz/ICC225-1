/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlToDocx;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.*;

/**
 *
 * @author Okumura
 */
public class Main {
    public static void main (String [] args) throws IOException, ZipException{
        XSLTTransformatorImpl.transform("student.xml", "document.xml", "student2docx.xsl");
        XSLTTransformatorImpl.transform("Original.xml", "excel-ml student.xml", "student2xlsx.xsl");
     
        File doc = new File("Document.docx");
        File zip = new File("Temp.docx.zip");
        File zip2 = new File("Template.docx.zip");
        copyFile(zip2,zip);
        addZip("Temp.docx.zip","document.xml");
        copyFile(zip,doc);
        zip.delete();
        
        
        
    }
    
    
    
private static void copyFile(File source, File dest) throws IOException {
    FileChannel sourceChannel = null;
    FileChannel destChannel = null;
    try {
        sourceChannel = new FileInputStream(source).getChannel();
        destChannel = new FileOutputStream(dest).getChannel();
        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
       }finally{
           sourceChannel.close();
           destChannel.close();
   }
} 

public static void rename(int op){
    File oldfile =new File("Table.docx");
    File newfile =new File("Table.docx.zip");
    switch(op){
        case 1:
            if(oldfile.renameTo(newfile)){
                System.out.println("File renamed");
            }else{
                System.out.println("Sorry! the file can't be renamed");
            }
            break;
        
        case 2:
            if(newfile.renameTo(oldfile)){
                System.out.println("File renamed");
            }else{
                System.out.println("Sorry! the file can't be renamed");
            }
    }  
}

public static void addZip(String zip, String file) throws IOException, ZipException, NullPointerException{
    ZipFile zipFile = new ZipFile(zip);
    ArrayList filesToAdd = new ArrayList();
    filesToAdd.add(new File(file));
    ZipParameters parameters = new ZipParameters();
    parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
    parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
// Sets the folder in the zip file to which these new files will be added.
// In this example, test2 is the folder to which these files will be added.
// Another example: if files were to be added to a directory test2/test3, then
// below statement should be parameters.setRootFolderInZip("test2/test3/");
    parameters.setRootFolderInZip("word/");
    zipFile.addFiles(filesToAdd, parameters);
}

    
}
