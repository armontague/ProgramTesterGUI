import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class SinglePanel extends JPanel {
    JTextArea outputArea;
    public SinglePanel(){
        
        super();
        setLayout(null);
        
        outputArea = new JTextArea();
        
        outputArea.setBounds(0, 0, 700, 700);
        outputArea.setText("THIS IS THE SINGLE PANEL\nconfigFileName: ./configSingle.txt\n"
                + "run #: 1 ; studentNumber: 0; Name: mudgettdr; Handle: 0000000\n"
                + "Output goes to: ./src/src-output/mudgettdr/output-mudgettdr.txt\n"
                + "source path: ./src/src-output\n"
                + "source absolute path: C:\\java\\src\\program-test-242-1\\.\\src\\src-output \n"
                + "Compiling: ArraySearcher.java\n"
                + "Compiling: Factorial.java\n"
                + "Compiling: TestProgram.java\n"
                + "Compiled Successfully\n"
                + "[java, Factorial, 5]\n"
                + "System.in inputs: [None]\n"
                + "java process arguments: [java, Factorial, 5]\n"
                + "[java, Factorial, 10]\n"
                + "System.in inputs: [None]\n"
                + "java process arguments: [java, Factorial, 10]\n"
                + "[java, ArraySearcher, 4, 4, 2, 3, 1, 5]\n"
                + "System.in inputs: [None]\n"
                + "java process arguments: [java, ArraySearcher, 4, 4, 2, 3, 1, 5]\n"
                + "[java, ArraySearcher, 3, 4, 2, 3, 4, 5]\n"
                + "System.in inputs: [None]\n"
                + "java process arguments: [java, ArraySearcher, 3, 4, 2, 3, 4, 5]\n"
                + "[java, TestProgram]\n"
                + "System.in inputs: [None]\n"
                + "java process arguments: [java, TestProgram]\n");
        
        add(outputArea);
        
    }
}
