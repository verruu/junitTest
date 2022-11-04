package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

   @Test
   public void testIsNameIsNotNull() {
      Person john = new Person("John", 31);
      assertNotNull(john.getName());
   }

   @Test
   public void testIsAgeBelow0ThrowsException() {
      final Person john = null;
      new Person("John", 31);
      assertThrows(IllegalArgumentException.class, () -> john.setAge(-1));
   }
}