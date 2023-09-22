package com.infinite.java1;

import java.util.Arrays;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Alphabets {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String input = sc.next();

       
        char[] charArray = input.toCharArray();

        
        Arrays.sort(charArray);

       
        String sortedString = new String(charArray);

        
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
  try {
            PDDocument document = new PDDocument();
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType1Font.BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 700);
 contentStream.showText("Infinite solution" + sortedString);
            contentStream.endText();

            // Close the content stream
            contentStream.close();
Date date = new Date("long");
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
       String str = formatter.format(date);
      System.out.print("Current date: "+str);


            // Save the PDF to a file
            document.save(str+"Current_Infi.pdf");

            // Close the PDF document
            document.close();

            System.out.println("PDF created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
