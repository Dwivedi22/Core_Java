package assignment_step_4_reader;

import java.io.IOException;

import assignment_step_4_query.DataTypeDefinitions;
import assignment_step_4_query.Header;

public abstract class QueryProcessingEngine {

	public abstract Header getHeader() throws IOException;
	
	public abstract void getDataRow();
	
	public abstract DataTypeDefinitions getColumnType() throws IOException;
	
	
}
