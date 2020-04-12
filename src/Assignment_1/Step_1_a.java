package Assignment_1;

public class Step_1_a {

	public static void main(String[] args) {
		// read the query from the user into queryString variable

		// call the parseQuery method and pass the queryString variable as a parameter

	}

	/*
	 * we are creating multiple methods, each of them are responsible for extracting
	 * a specific part of the query. However, the problem statement requires us to
	 * print all elements of the parsed queries. Hence, to reduce the complexity, we
	 * are using the parseQuery() method. From inside this method, we are calling
	 * all the methods together, so that we can call this method only from main()
	 * method to print the entire output in console
	 */
	public void parseQuery(String queryString) {
		// call the methods
		getSplitStrings(queryString);
		getFile(queryString);
		getBaseQuery(queryString);
		getConditionsPartQuery(queryString);
		getConditions(queryString);
		getLogicalOperators(queryString);
		getFields(queryString);
		getOrderByFields(queryString);
		getGroupByFields(queryString);
		getAggregateFunctions(queryString);
	}

	public String[] getSplitStrings(String queryString) {

		return null;
	}

	public String getFile(String queryString) {

		return null;
	}

	public String getBaseQuery(String queryString) {

		return null;

	}

	public String getConditionsPartQuery(String queryString) {

		return null;

	}

	public String[] getConditions(String queryString) {

		return null;
	}

	public String[] getLogicalOperators(String queryString) {

		return null;

	}

	public String[] getFields(String queryString) {

		return null;

	}

	public String[] getOrderByFields(String queryString) {

		return null;
	}
	
	public String[] getGroupByFields(String queryString) {

		return null;
	}

	public String[] getAggregateFunctions(String queryString) {

		return null;
	}

}