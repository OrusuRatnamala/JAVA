package com.infinite.Task1;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Pdfboxexample {

	public static void main(String[] args) {
		System.out.println("Enter the Text:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		char[] charArray = input.toCharArray();

		Arrays.sort(charArray);

		String sortedString = new String(charArray);
		System.out.println("Infinite Solutions");
		System.out.println("Original String: " + input);
		System.out.println("Sorted String: " + sortedString);

		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyy");
		String str = formatter.format(new Date());
		String fname = str + "_Current_infi.pdf";
		try {
			File file = new File("D:\\" + fname);
			PDDocument document = new PDDocument();// creating a Document
			PDPage page = new PDPage(PDRectangle.A4);// Creating a Blank page
			document.addPage(page);// adding page to Document
			PDPageContentStream contentStream = new PDPageContentStream(document, page);
			contentStream.beginText();
			contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 12);
			contentStream.newLineAtOffset(100, 700);
			contentStream.showText("Infinite solution    " + sortedString);

			contentStream.endText();

			// Close the content stream
			contentStream.close();
			System.out.println("Current date: " + str);

			// Save the PDF to a file

			document.save(new File("D:\\" + fname));

			// Close the PDF document
			document.close();

			System.out.println("PDF created successfully at D: drive with filename" + fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
