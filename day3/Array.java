//Understanding an exam question
//Suppose we have a 1-D array of Strings such that:
//•	Each string records individual scores for different quizzes for one student.
//•	Each string has the form “d1;d2;d3;..;dn;” where d1 to dn are all double values and they are separated using the character ‘;’. Note that there is one ‘;’ after the last double value.
//•	Each string contains the same number of double values.
//Write the method convert that takes a 1-D array of such Strings and an integer n as inputs, where n means the number of double values in each String in the array and returns a 2-D array containing double values. In the two 2-D array, each row records scores of one student and each column contains scores of one exam for all students.

import java.util.*;
public class Array{
  public static double[][] convert(String[] exams, int n){
    double [][] returnValue = new double [exams.length][n]; // create double array
    for (int i = 0; i < exams.length; i++){
      String exam = exams[i];
      int index = exam.indexOf(";");  // indexOf() finds the index of a specific character/substring in a string
      int j = 0; //column
      while (index != -1){ //while index does exist
        double score = Double.parseDouble(exam.substring(0, index)); //converts string to double; substring method returns a portion of a string
        returnValue[i][j] = score; //adds new double into the 2d array
        j++;
        exam = exam.substring(index + 1); //iterates through the index of ;
        index = exam.indexOf(";"); //reassigns index
      }
    }
    return returnValue;
  }

  public static void main(String[] args){
    String [] quiz = {"1;2;3;4;", "5;6;7;8;", "9;10;11;12;"};
    System.out.println(Arrays.deepToString(convert(quiz,4)));
  }
}
