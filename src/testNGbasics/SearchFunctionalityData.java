package testNGbasics;

import org.testng.annotations.DataProvider;

public class SearchFunctionalityData {

	@DataProvider
	public String[] negativeSearchData() {
		String[] data = {	"*^(*^*(^*@^*@(*89898342230957329523890",
							"*^(*^*(^*@^*@(*89898342230957329523891"};
		return data;
	}
}
