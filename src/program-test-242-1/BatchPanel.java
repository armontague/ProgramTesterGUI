import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.*;

public class BatchPanel extends JPanel {
	
    private JTextArea cmdOutputArea;
	private JTextPane studentOutputPane;
	private JLabel cmdOutputLbl, studentOutputLbl;
	private JScrollPane studentScrollPane, cmdScrollPane;
	private StyledDocument studentOutputDoc;
	private SimpleAttributeSet bold;
	
    public BatchPanel(){
        
        super();
        setLayout(null);
		
		Border border = BorderFactory.createLineBorder(Color.black);
		
        studentOutputPane = new JTextPane();
		studentOutputPane.setEditable(false);
		studentOutputPane.setBorder(border);
        studentOutputPane.setBounds(10, 55, 315, 595);
		studentScrollPane = new JScrollPane(studentOutputPane);
		studentScrollPane.setBounds(10, 55, 315, 595);
		
		studentOutputDoc = (StyledDocument) studentOutputPane.getDocument();
		bold = new SimpleAttributeSet();
		StyleConstants.setBold(bold, true);
		
		cmdOutputArea = new JTextArea();
		cmdOutputArea.setEditable(false);
		cmdOutputArea.setBorder(border);
        cmdOutputArea.setBounds(360, 55, 315, 595);
		
		studentOutputLbl = new JLabel("Student Output");
		studentOutputLbl.setBounds(120, 30, 150, 15);
		
		cmdOutputLbl = new JLabel("Command Line Output");
		cmdOutputLbl.setBounds(460, 30, 150, 15);
        
        add(studentScrollPane);
		add(cmdOutputArea);
		add(studentOutputLbl);
		add(cmdOutputLbl);
        
    }
	
	public void displayStudentOutputs(String batchDir, String[] batchStudents) throws BadLocationException {
		
		String studentDir = "";
		StringBuilder studentOutput = new StringBuilder();
		String line = null;
		for(int i = 0; i < batchStudents.length; i++) {
			studentOutputDoc.insertString(studentOutputDoc.getLength(),
											"\n" + batchStudents[i] + "\n", bold);
			studentDir = 
				batchDir + "\\" + batchStudents[i] + "\\output-" + batchStudents[i] + ".txt";
			try {
				FileReader fileReader = new FileReader(studentDir);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				while((line = bufferedReader.readLine()) != null) {
					studentOutput.append(line + "\n");
				}   
				bufferedReader.close();         
			}
			catch(FileNotFoundException ex) {
				ex.printStackTrace();              
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			studentDir = "";
			studentOutputDoc.insertString(studentOutputDoc.getLength(), 
										studentOutput.toString(), null);
			studentOutput = new StringBuilder();
		}
	}
}
