package com.data.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void letsMockListSizeMethod_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void letsMockListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("In a moment ...");
		assertEquals("In a moment ...", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void letsMockListGetMethod_AnyInt() {
		List listMock = mock(List.class);
		// argument matchers
		when(listMock.get(anyInt())).thenReturn("In a moment ...");
		assertEquals("In a moment ...", listMock.get(0));
		assertEquals("In a moment ...", listMock.get(1));
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockListGetMethod_throwAnException() {
		List listMock = mock(List.class);
		// argument matchers
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(0);
	}

}
