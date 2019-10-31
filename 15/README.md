# FACADE 模式和 MEDIATOR 模式

- 如果策略设计范围广泛并且可见，那么可以使用 FACADE 模式从上面施加该策略。另一方面，如果策略隐蔽并且有针对性，那么 MEDIATOR 模式是更好的选择点。
- Facades 通常是约定的关注点。每个人都同意去使用该 facade 而不是隐藏于其下的对象。另一方面，Mediator 则对用户是隐藏的，它的策略是既成事实的而不是一向约定事务。

- MEDIATOR 模式
```java
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
```