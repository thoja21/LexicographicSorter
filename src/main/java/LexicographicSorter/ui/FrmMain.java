package LexicographicSorter.ui;

import LexicographicSorter.Sorter;
import LexicographicSorter.ui.components.MsgBox;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;

/**
 * @version 1.0.1
 * @author James
 */
public class FrmMain extends javax.swing.JFrame implements ClipboardOwner {

    public FrmMain() {
        // Try to set UI theme to system theme. Don't do anything
        // and use horrid Java version if this fails.
        try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e1) {
	    e1.printStackTrace();
        } catch (InstantiationException e1) {
	    e1.printStackTrace();
        } catch (IllegalAccessException e1) {
	    e1.printStackTrace();
        } catch (UnsupportedLookAndFeelException e1) {
	    e1.printStackTrace();
        }
        
        initComponents();
	
	// Make panel appear more or less centre of screen (must be done after pack()).
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	int screenXMid = dim.width/2;
	int screenYMid = dim.height/2;
	int appXMid = getWidth()/2;
	int appYMid = getHeight()/2;
	setLocation(screenXMid - appXMid, screenYMid - appYMid);
	setMinimumSize(new Dimension(355, 385));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSourceToOrderLbl = new javax.swing.JLabel();
        lblResultLbl = new javax.swing.JLabel();
        spResult = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btnGo = new javax.swing.JButton();
        spSource = new javax.swing.JScrollPane();
        txtSource = new javax.swing.JTextArea();
        btnCopyToClipboard = new javax.swing.JButton();
        lnkVersionLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lexicographic Sorter");
        setResizable(false);

        lblSourceToOrderLbl.setText("Source to order:");

        lblResultLbl.setText("Result:");

        txtResult.setEditable(false);
        txtResult.setColumns(20);
        txtResult.setRows(5);
        spResult.setViewportView(txtResult);

        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        txtSource.setColumns(20);
        txtSource.setRows(5);
        spSource.setViewportView(txtSource);

        btnCopyToClipboard.setText("Copy to clipboard");
        btnCopyToClipboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyToClipboardActionPerformed(evt);
            }
        });

        lnkVersionLbl.setForeground(new java.awt.Color(51, 0, 255));
        lnkVersionLbl.setText("v1.0.1");
        lnkVersionLbl.setToolTipText("https://github.com/thoja21/LexicographicSorter/releases");
        lnkVersionLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lnkVersionLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lnkVersionLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spResult, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(spSource)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSourceToOrderLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lnkVersionLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCopyToClipboard)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSourceToOrderLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spSource, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultLbl)
                    .addComponent(btnGo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spResult, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnkVersionLbl)
                    .addComponent(btnCopyToClipboard))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        MsgBox msgbox = new MsgBox();
	String source = txtSource.getText().trim();
	if(source.length() == 0) {
	    msgbox.showMsg("You must enter something to sort.", "Error", MsgBox.ERROR_MESSAGE);
	    txtSource.requestFocus();
            return;
        }

	try {
	    processSort();
	} catch (BadLocationException ex) {
	    Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
	    msgbox.showMsg("An unexpected error occurred whilst sorting!", "Error", MsgBox.ERROR_MESSAGE);
	    msgbox.showMsg(ex.getLocalizedMessage(), "Error", MsgBox.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnCopyToClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyToClipboardActionPerformed
        StringSelection stringSelection = new StringSelection(txtResult.getText());
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard.setContents(stringSelection, this);
    }//GEN-LAST:event_btnCopyToClipboardActionPerformed

    private void lnkVersionLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnkVersionLblMouseClicked
        // Open web browser to this application's GitHub releases page
        // (if the host OS supports this).
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URL("https://github.com/thoja21/LexicographicSorter/releases").toURI());
            } catch (IOException | URISyntaxException e) {
                // Just spit out the stack trace and carry on.
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lnkVersionLblMouseClicked

    private void processSort() throws BadLocationException {
	List<String> lines = new ArrayList<>();
	for(int i = 0; i < txtSource.getLineCount(); i ++){
	    int start = txtSource.getLineStartOffset(i);
	    int end = txtSource.getLineEndOffset(i);
	    lines.add(txtSource.getText(start, end - start));
	}

	String[] result = Sorter.sort(lines.toArray(new String[0]));
	StringBuilder sortedText = new StringBuilder();
	
	for(String line : result) {
	    sortedText.append(line);
	}
	
	txtResult.setText(sortedText.toString());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopyToClipboard;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel lblResultLbl;
    private javax.swing.JLabel lblSourceToOrderLbl;
    private javax.swing.JLabel lnkVersionLbl;
    private javax.swing.JScrollPane spResult;
    private javax.swing.JScrollPane spSource;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextArea txtSource;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
	// Do nothing.
    }
}
