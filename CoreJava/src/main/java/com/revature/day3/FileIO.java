package com.revature.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("could not find the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"))) {
			bw.write("hello\n");
			bw.write("world");
			bw.flush();
		} catch (IOException e) {
			System.out.println("failed to write to file");
		}
	}
}
