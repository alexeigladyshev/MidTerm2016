package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		ConnectDB connectDB = new ConnectDB();

		List<String> listPattern = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
			listPattern = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:listPattern){
			System.out.println(st);
		}





	}

}