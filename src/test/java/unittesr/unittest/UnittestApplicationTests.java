package unittesr.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnittestApplicationTests {
	Multiply mul=new Multiply();

	@Test
	void Test1() {
		int result = mul.MultiplyNum(10);
		int expect=100;
		assertEquals(expect,result);

	}
	@Test
	void Test2() {
		int result = mul.MultiplyNum(5);
		int expect=25;
		assertEquals(expect,result);

	}
	@Test
	void Test3() {
		int result = mul.MultiplyNum(11);
		int expect=121;
		assertEquals(expect,result);

	}
	@Test
	void Test4() {
		int result = mul.MultiplyNum(7);
		int expect=49;
		assertEquals(expect,result);

	}

}
