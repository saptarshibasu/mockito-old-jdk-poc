package com.sapbasu.mockitopoc;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestClass {
  
  @Mock
  private Foo foo;
 
  @Test
  public void testMethod() {
	  foo.doSomething(new ArrayList(1));
  }
}
