package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Image;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField TFLu;
	private JTextField TFApellido;
	private JTextField TFNombre;
	private JTextField TFMail;
	private JTextField TFUrl;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 265));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 201);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		
		JLabel JLlu = new JLabel("LU");
		JLlu.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLlu.setBounds(10, 14, 40, 19);
		tabInformation.add(JLlu);
		
		JLabel JLapellido = new JLabel("Apellido");
		JLapellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLapellido.setBounds(10, 45, 49, 14);
		tabInformation.add(JLapellido);
		
		JLabel JLnombre = new JLabel("Nombre");
		JLnombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLnombre.setBounds(10, 75, 49, 14);
		tabInformation.add(JLnombre);
		
		JLabel JLmail = new JLabel("E-mail");
		JLmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLmail.setBounds(10, 105, 46, 14);
		tabInformation.add(JLmail);
		
		JLabel JLurl = new JLabel("Github URL");
		JLurl.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLurl.setBounds(10, 134, 69, 14);
		tabInformation.add(JLurl);
		
		TFLu = new JTextField();
		TFLu.setEditable(false);
		TFLu.setBounds(102, 13, 297, 20);
		tabInformation.add(TFLu);
		TFLu.setColumns(10);
		TFLu.setText(""+studentData.getId());
		
		TFApellido = new JTextField();
		TFApellido.setEditable(false);
		TFApellido.setBounds(102, 43, 297, 20);
		tabInformation.add(TFApellido);
		TFApellido.setColumns(10);
		TFApellido.setText(studentData.getLastName());
		
		TFNombre = new JTextField();
		TFNombre.setEditable(false);
		TFNombre.setBounds(102, 73, 297, 20);
		tabInformation.add(TFNombre);
		TFNombre.setColumns(10);
		TFNombre.setText(studentData.getFirstName());
		
		TFMail = new JTextField();
		TFMail.setEditable(false);
		TFMail.setBounds(102, 103, 297, 20);
		tabInformation.add(TFMail);
		TFMail.setColumns(10);
		TFMail.setText(studentData.getMail());
		
		TFUrl = new JTextField();
		TFUrl.setEditable(false);
		TFUrl.setBounds(102, 132, 297, 20);
		tabInformation.add(TFUrl);
		TFUrl.setColumns(10);
		TFUrl.setText(studentData.getGithubURL());
		
		contentPane.add(tabbedPane);
		LocalTime horaactual = LocalTime.now();
		LocalDate fechaactual = LocalDate.now();
		JLabel textoventana = new JLabel("Esta ventana fue generada el "+ fechaactual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" a las "+ horaactual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		textoventana.setBounds(5, 207, 430, 14);
		contentPane.add(textoventana);
		
		
		JLabel JLfoto = new JLabel("");
		JLfoto.setBounds(445, 28, 154, 178);
		ImageIcon MiFoto = new ImageIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())).getImage().getScaledInstance(140, 178, Image.SCALE_DEFAULT));
		JLfoto.setIcon(MiFoto);
		contentPane.add(JLfoto);
		
	}
}
