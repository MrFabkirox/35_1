import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Devoir1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test(timeout=1000)
	public void testSecondeValeurValeurs() {
		int [] t0 = {77, 89, 68, 0, 8, 29, 85, 73, 54, 63, 47, 26, 69, 74, 83, 45, 43, 5, 15,
				82, 1, 35, 38, 82, 35, 42, 60, 42, 47, 46};
		int [] t1 = {22, 15, 2, 17, 4, 7, 10, 14, 8, 10, 7, 6, 17, 11, 5, 13, 6, 15, 19, 9, 6,
				7, 16, 2, 13, 11, 8, 9, 7, 15};
		int [] t2 = {37, 9, 9, 36, 28, 44, 13, 19, 11, 9, 9, 7, 11, 14, 2, 25, 11, 28, 2, 13,
				19, 2, 31, 6, 38, 18, 37, 41, 10, 30};
		int [] t3 = {12, 59, 39, 14, 24, 51, 45, 32, 28, 11, 17, 57, 3, 1, 1, 43, 10, 51, 12,
				34, 32, 49, 18, 43, 39, 4, 40, 28, 62, 21};
		int [] t4 = {9,8};
		int [] t5 = {1, 2, 3, 9, 8, 9};
		int [] t6 = {15, 19, 1, 2, 3, 9, 8, 9, 8, 19, 19};
		int [] t7 = {19, 19, 8, 9, 8, 1, 19, 15};
		int [] t8 = {19, 19, 8, 9, 15, 8, 1, 20, 15};
		int [] t9 = {8,9};
		
		assertEquals(" de tout", 85, Devoir1.secondeValeur(t0));
		assertEquals(" de tout", 19, Devoir1.secondeValeur(t1));
		assertEquals(" de tout", 41, Devoir1.secondeValeur(t2));
		assertEquals(" de tout", 59, Devoir1.secondeValeur(t3));
		assertEquals(" de tout", 8, Devoir1.secondeValeur(t4));
		assertEquals(" de tout", 8, Devoir1.secondeValeur(t5));
		assertEquals(" de tout", 15, Devoir1.secondeValeur(t6));
		assertEquals(" de tout", 15, Devoir1.secondeValeur(t7));
		assertEquals(" de tout", 19, Devoir1.secondeValeur(t8));
		assertEquals(" de tout", 8, Devoir1.secondeValeur(t9));
		
	}
}
