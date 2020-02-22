package com.data.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpringUsingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Khaled");
		
		assertEquals(2, filteredTodos.size());
	}

}
