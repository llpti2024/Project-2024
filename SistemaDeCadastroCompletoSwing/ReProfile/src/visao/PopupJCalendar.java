package visao;

import com.toedter.calendar.JCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class PopupJCalendar extends JInternalFrame {

    private JCalendar calendar; // Componente JCalendar
    private JButton btnOk;
    private ActionListener onDateSelected; // Listener para enviar a data de volta

    public PopupJCalendar(ActionListener onDateSelected) {
        this.onDateSelected = onDateSelected;
        initComponents();
    }

    private void initComponents() {
        setTitle("Selecionar Data");
        setClosable(true);
        setSize(400, 300);
        setLayout(null);

        calendar = new JCalendar();
        calendar.setBounds(20, 20, 350, 200);
        add(calendar);

        btnOk = new JButton("OK");
        btnOk.setBounds(150, 230, 80, 30);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date selectedDate = calendar.getDate(); // Obtém a data selecionada
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String formattedDate = dateFormat.format(selectedDate);

                // Dispara o evento para enviar a data
                if (onDateSelected != null) {
                    onDateSelected.actionPerformed(new ActionEvent(formattedDate, ActionEvent.ACTION_PERFORMED, null));
                }

                dispose(); // Fecha o popup
            }
        });
        add(btnOk);
    }
}