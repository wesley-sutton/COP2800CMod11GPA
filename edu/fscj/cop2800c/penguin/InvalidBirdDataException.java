// InvalidBirdDataException.java
// Wesley Sutton
// 4/6/2016
// Throws InvalidBirdDataException if any numeric value is negative or if sex is null or empty.

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
   public InvalidBirdDataException(String message) {
      super(message);
   }
}