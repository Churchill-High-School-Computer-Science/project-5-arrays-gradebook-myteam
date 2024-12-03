public class Gradebook {

    String[] labels = { "Last", "First", "Test1", "Test2", "Quiz1", "Quiz2", "Homework1", "Homework2", "Homework3",
            "Homework4", "Homework5", "Homework6", "Homework7", "Homework8", "Homework9", "Homework10" };

    String[][] book;

    public Gradebook(String[][] b) {
        if (b.length > 0 && b[0].length == 16) {
            book = b;
        }

        else {
            System.out.println("Gradebook is not the right size. Ensure that formatting is correct.");
            book = new String[1][16];
        }
    }

    public boolean changeGrade(String lastName, String assnName, int newGrade) {
        int row = -1;
        for (int i = 0; i < book.length; i++){
        if (book[i][0].equals(lastName)){
           row = i;
           
        }
        
    }
    int column = -1; 
      for (int x = 0; x < labels.length; x++){
        if (labels[x].equals(assnName)){
             column = x;
        }
      }
        if (row != -1 && column != -1){
            book[row][column] = Integer.toString(newGrade);
            return true;
        }
       
        // Your code here
        return false;
    }

    public double findAssignmentAverage(String assnName) {
       int row = -1;
       for (int i = 0; i < labels.length; i++){
        if (labels[i].equals(assnName)){
            row = i;
        }
       
    }
        double sum = 0;
        for (int x = 0; x < book.length; x++){
            sum += Integer.parseInt(book[x][row]);
            
            }
           return sum/book.length;
        
        
       
    }

    public double findStudentAverage(String lastName) {
        // Your code here
        return -1;
    }

    public void printStudentInfo(String lastName) {
        // Your code here
    }

}
