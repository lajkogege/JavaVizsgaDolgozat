package org.szamalk.nezett;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GuiForm {
    private JPanel pnlMain;
    private JComboBox cmbTartalom;
    private JButton btnUjFelvitel;
    private JList listaMasolt;
    private JButton btnMasolas;
    private JCheckBox chcAtmozgat;
    private JFrame frame;

    public static void main(String[] args) {
        new GuiForm();
    }

    public GuiForm(){
        ini();

        btnMasolas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cmbTartalom.getSelectedIndex()>0){
                    String elem=(String) cmbTartalom.getSelectedItem();
                    listaMasolt.getModel();
                    DefaultListModel<String>dModelLista=(new DefaultListModel<String>listaMasolt().getModell());
                    dModelLista.addElement(elem);
                }

            }
        });


        btnUjFelvitel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tartalom= "Ismeretlen: Nike / márvány -2. sz.";
                cmbTartalom.addItem(tartalom);
            }
        });

        betolt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jChooser= new JFileChooser(new File(System.getProperty("user.dir")));
                if(jChooser.showOpenDialog(null)==  JFileChooser.APPROVE_OPTION) {
                    File fajl= jChooser.getSelectedFile();

                try(ObjectInputStream be = new ObjectInputStream(new FileInputStream(fajl)){

                }

                }
            }


        chcAtmozgat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chcAtmozgat.isSelected()){

            }
        });
    }


    private void ini() {

        frame = new JFrame("festények és szobrok");
        frame.setContentPane(pnlMain);
        frame.setSize(520,240);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        DefaultListModel<String> modelLista = new DefaultListModel<>();
        listaMasolt.setModel(modelLista);

        JMenuItem beolvas = new JMenuItem("Betöltés");
        JMenuItem kilepes = new JMenuItem("Kilépés");
        JMenu mnu = new JMenu("Program");
        mnu.add(beolvas);
        mnu.add(new JSeparator());
        mnu.add(kilepes);
        JMenuBar bar=new JMenuBar();
        bar.add(mnu);
        frame.setJMenuBar(bar);

        frame.setVisible(true);


    }



    }
}
