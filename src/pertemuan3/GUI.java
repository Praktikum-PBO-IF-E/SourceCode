/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import pertemuan3.models.Orang;

/**
 *
 * @author Lab Informatika
 */
public class GUI extends JFrame implements ActionListener, ItemListener{
    JTextField fnama = new JTextField();
    JLabel lnama = new JLabel("Nama Lengkap : ");
    
    JLabel ljk = new JLabel("Jenis Kelamin : ");
    JRadioButton rbPria = new JRadioButton("Laki-Laki");
    JRadioButton rbWanita = new JRadioButton("Perempuan");
    
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = 
    {"Islam", "Kristen", "Katolik", "Hindu", "Budha", "Konghucu"};
    JComboBox cmAgama = new JComboBox(namaAgama);
    
    JLabel lhobi = new JLabel("Hobi");
    JCheckBox cbSepakBola = new JCheckBox("Sepak Bola");
    JCheckBox cbBasket = new JCheckBox("Basket");
    JCheckBox cbRenang = new JCheckBox("Renang");
    
    JButton btSave = new JButton("Save");
    
    public GUI(){
        setTitle("GUI");
        setDefaultCloseOperation(3);
        setSize(350,200);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljk);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmAgama);
        add(lhobi);
        add(cbSepakBola);
        add(cbBasket);
        add(cbRenang);
        add(btSave);
        
        //setBounds(x,y,o,p)
        //x sumbu x
        //y sumbu y
        //o nilai panjang
        //p nilai tinggi
        
        lnama.setBounds(10,10, 120, 20);
        fnama.setBounds(130,10, 150, 20);
        ljk.setBounds(10, 35, 120,20);
        rbPria.setBounds(130, 35, 100,20);
        rbWanita.setBounds(230, 35, 100,20);
        lagama.setBounds(10, 60, 150,20);
        cmAgama.setBounds(130, 60, 150,20);
        lhobi.setBounds(10, 85, 120,20);
        cbSepakBola.setBounds(130, 85, 70,20);
        cbBasket.setBounds(200, 85, 70,20);
        cbRenang.setBounds(270, 85, 70,20);
        btSave.setBounds(200,130,120,20);
        
//        setLayout(new FlowLayout(FlowLayout.TRAILING));
//        add(lnama);
//        add(btSave);
//        add(ljk);
//        add(cbSepakBola);
//        add(lhobi);
        
        setVisible(true);
        Orang orang = new Orang("Novia","Khonghucu","Perempuan","Renang");
        btSave.addActionListener(new WriterFile(orang));
        cmAgama.addActionListener(this);
        rbPria.addItemListener(this);
        rbWanita.addItemListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btSave){
            
        }
        
        if(e.getSource() == cmAgama){
            System.out.println("Agama : " + cmAgama.getSelectedItem());
        }
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == rbPria){
            if(e.getStateChange()==ItemEvent.SELECTED){
                System.out.println("Jenis Kelamin : " + rbPria.getText());
            }
        }
        if(e.getSource() == rbWanita){
            if(e.getStateChange()==ItemEvent.SELECTED){
                System.out.println("Jenis Kelamin : " + rbWanita.getText());
            }
        }
    }
    
}
