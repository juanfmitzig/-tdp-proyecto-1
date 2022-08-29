package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student Persona = new Student(126294, "Mitzig", "Juan Francisco", "juanmitzig14@gmail.com", "https://github.com/juanfmitzig", "/images/student_photo.png");
            	try {
            		SimplePresentationScreen sps = new SimplePresentationScreen(Persona);
            		sps.setVisible(true);
            	} catch(Exception e) {
            		e.printStackTrace();
            	}
            	
            }
        });
    }
}