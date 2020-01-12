package edu.syifaamruloh.latihanmvc.controller;


import edu.syifaamruloh.latihanmvc.model.PelangganModel;
import edu.syifaamruloh.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deek
 * Nama : Muhamad Syifa Amruloh
 * NIM  : 10118910
 * Kelas: IF11K
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelepon().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")) {
            
        }else
        {
           model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelepon().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Nama masih Kosong");
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Email masih Kosong");
        }else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"No Telp masih Kosong");
        }else{
            model.simpanForm();
        }
    }
}
