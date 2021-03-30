package LexicographicSorter.ui.components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Simple class to show a JOptionPane pop-up message.
 *
 * @author James
 * @version 1.0.0
 */
public class MsgBox extends JFrame {
    private static final long serialVersionUID = 757367656749612524L;
    public static final int ERROR_MESSAGE = 0;
    public static final int INFO_MESSAGE = 1;
    public static final int WARN_MESSAGE = 2;
    public static final int PLAIN_MESSAGE = 3;
    public static final int YES_NO = 4;
    public static final int YES_NO_CANCEL = 5;

    public enum MsgBoxType {
	ERROR_MESSAGE,
	INFO_MESSAGE,
	WARN_MESSAGE,
	PLAIN_MESSAGE,
	YES_NO,
	YES_NO_CANCEL
    }

    public enum ResponseType {
	CONFIRM,
	CANCEL,
	NO
    }

    /**
    * Default constructor.
    */
    public MsgBox() {

    }

    /**
    * Display an on-screen error message.
    *
    * @param msg	Error message.
    * @param title	Message box title.
    * @param type	Message box type.
    * @return		User's response.
    */
    public ResponseType showMsg(String msg, String title, int type) {
	switch(type) {
	case ERROR_MESSAGE:
	    JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
	    return ResponseType.CONFIRM;
	case INFO_MESSAGE:
	    JOptionPane.showMessageDialog(this, msg, title, JOptionPane.INFORMATION_MESSAGE);
	    return ResponseType.CONFIRM;
	case WARN_MESSAGE:
	    JOptionPane.showMessageDialog(this, msg, title, JOptionPane.WARNING_MESSAGE);
	    return ResponseType.CONFIRM;
	case PLAIN_MESSAGE:
	    JOptionPane.showMessageDialog(this, msg, title, JOptionPane.PLAIN_MESSAGE);
	    return ResponseType.CONFIRM;
	case YES_NO:
	    return interpretResponse(JOptionPane.showConfirmDialog(this,  msg, title, JOptionPane.YES_NO_OPTION));
	case YES_NO_CANCEL:
	    return interpretResponse(JOptionPane.showConfirmDialog(this,  msg, title, JOptionPane.YES_NO_CANCEL_OPTION));
	default:
	    JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
	    return ResponseType.CONFIRM;
	}
    }

    private ResponseType interpretResponse(int responseId) {
	switch(responseId) {
	case JOptionPane.OK_OPTION:	    // YES uses the same value.
	    return ResponseType.CONFIRM;
	case JOptionPane.CANCEL_OPTION:
	    return ResponseType.CANCEL;
	case JOptionPane.NO_OPTION:
	    return ResponseType.NO;
	default:
	    return ResponseType.CONFIRM;
	}
    }
}
