package tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;
import functions.ViewFiles;

public class MergeSortTest {

	private String[] unsorted, sorted;
	
	@Before
	public void setUp() throws Exception {
		unsorted = new String[] {"xyz", "uvw", "rst", "opq", "lmn", "ijk", "fgh", "def", "abc"};
		sorted = new String[] {"abc", "def", "fgh", "ijk", "lmn", "opq", "rst", "uvw", "xyz"};
	}

	@Test
	public void testMergeSort() {
		ViewFiles.mergeSort(unsorted, 0, unsorted. length-1);
		assertArrayEquals(sorted, unsorted);
	}

}
