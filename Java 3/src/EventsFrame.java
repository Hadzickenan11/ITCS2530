 import java.awt.Color;
 import java.awt.BorderLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import java.awt.event.MouseListener;
 import java.awt.event.MouseEvent;
 import java.awt.event.MouseMotionListener;
 import java.awt.event.KeyListener;
 import java.awt.event.KeyEvent;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JScrollPane;
 import javax.swing.JTextArea;
 import javax.swing.JComboBox;
 import javax.swing.JRadioButton;
 import javax.swing.JList;
 import javax.swing.JButton;
 import javax.swing.event.ListSelectionListener;
 import javax.swing.event.ListSelectionEvent;

 public class EventsFrame extends JFrame implements ActionListener,
 ItemListener, MouseListener, MouseMotionListener,
 KeyListener, ListSelectionListener
 {
 private JPanel panel1;
 private JScrollPane scrollPane;
 private JTextArea outputJTextArea;
 private JComboBox comboBox;
 private JRadioButton radioButton;
 private JList list;
 private JButton clearJButton;


 private String names[] = {
 "Anteater", "Caterpillar", "Centipede", "Fire Fly" };

 public EventsFrame()
 {
 super( "Events" );


 outputJTextArea = new JTextArea( 10, 30 );
 outputJTextArea.setLineWrap( true );
 outputJTextArea.setEditable( false );
 outputJTextArea.setBackground( Color.WHITE );
 outputJTextArea.setForeground( Color.BLACK );

 comboBox = new JComboBox( names );

 radioButton = new JRadioButton( "Select Me", false );

 list = new JList( names );
 list.addListSelectionListener( this );


 clearJButton = new JButton( "Clear" );
 clearJButton.addActionListener(

 ); 

 panel1 = new JPanel();
 panel1.add( comboBox );
 panel1.add( radioButton );
 panel1.add( list );
 panel1.add( clearJButton );


 setLayout( new BorderLayout() );
 add( scrollPane, BorderLayout.CENTER );
 add( panel1, BorderLayout.SOUTH );
 }
 public void display( String eventName, Object event )
 {
 outputJTextArea.append( String.format( "%s occurred\n%S\n\n",
 eventName, event.toString() ) );
 } 
 }