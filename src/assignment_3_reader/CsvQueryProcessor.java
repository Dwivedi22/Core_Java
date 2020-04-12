package assignment_3_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import assignment_3_query.DataTypeDefinitions;
import assignment_3_query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {

	// parameterized constructor to initialize filename
	public CsvQueryProcessor(String fileName) throws FileNotFoundException {

	}

	/*
	 * implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 * Note: Return type of the method will be Header
	 */
	@Override
	public Header getHeader() throws IOException {

		// read the first line

		// populate the header object with the String array containing the header names
		return null;
	}

	/**
	 * getDataRow() method will be used in the upcoming assignments
	 */
	@Override
	public void getDataRow() {

	}

	/*
	 * implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. If a
	 * specific field value can be converted to Integer, the data type of that field
	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
	 * then the data type of that field will contain "java.lang.Double", otherwise,
	 * the field is to be treated as String. 
	 * Note: Return Type of the method will be DataTypeDefinitions
	 */
	@Override
	public DataTypeDefinitions getColumnType() throws IOException {

		return null;
	}
}
