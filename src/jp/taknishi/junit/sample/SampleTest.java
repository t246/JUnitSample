package jp.taknishi.junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void testNum() {
//		Sample sample = new Sample();
	      assertEquals(9, Sample.num());
	}
}
