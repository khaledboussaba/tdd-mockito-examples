package com.data.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;

public class TodoBusinessImplMockitoTest {

	@Test
	public void testRetrieveTodosRelatedToSpringUsingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Lean Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Khaled")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Khaled");
		
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpringUsingAMockWithEmptyList() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("Khaled")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Khaled");
		
		assertEquals(0, filteredTodos.size());
	}

}
