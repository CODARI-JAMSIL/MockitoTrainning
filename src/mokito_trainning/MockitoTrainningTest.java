package mokito_trainning;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class MockitoTrainningTest {

	@Test
	public void mockito_List_테스트() {
		List mockedList= mock(List.class);
		
		mockedList.add("first");
		mockedList.clear();
		
		verify(mockedList).add("first");
		verify(mockedList).clear();
	}
	
	@Test
	public void mockito_LinkedList_테스트() {
		LinkedList mockedList= mock(LinkedList.class);
		
		when(mockedList.get(0)).thenReturn("first");
		
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(999));
	}
}
