package MEDIATOR;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class QuickEntryMediator {
    private JTextField textField;
    private JList jList;

    public QuickEntryMediator(JTextField t, JList l) {
        textField = t;
        jList = l;

        textField.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        textFiledChanged();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        textFiledChanged();
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        textFiledChanged();
                    }
                }
        );
    }

    private void textFiledChanged() {
        String prefix = textField.getText();

        if (prefix.length() == 0) {
            jList.clearSelection();
            return;
        }

        ListModel m = jList.getModel();
        boolean found = false;
        for (int i = 0; !found && i < m.getSize(); i++) {
            Object o = m.getElementAt(i);
            String s = o.toString();
            if (s.startsWith(prefix)) {
                jList.setSelectedValue(o, true);
                found = true;
            }
        }

        if (!found) {
            jList.clearSelection();
        }
    }

    public static void main(String[] args) {
        JTextField t = new JTextField();
        JList l = new JList();
        QuickEntryMediator qem = new QuickEntryMediator(t, l);
    }
}
