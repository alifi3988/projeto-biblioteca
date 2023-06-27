/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.projetobiblioteca.view.controles;

import br.com.biblioteca.projetobiblioteca.view.MenuPrincipal;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author alifi
 */
public class SettinsController implements MouseListener{
    
    
    private final MenuPrincipal menu;

    public SettinsController(MenuPrincipal menu) {
        this.menu = menu;
        this.menu.lblSair.addMouseListener(this);
        this.menu.lblRetiradaLivro.addMouseListener(this);
        this.menu.lblCadastroLivro.addMouseListener(this);
        this.menu.lblDevRenov.addMouseListener(this);
        this.menu.lblCadastro.addMouseListener(this);
        this.menu.lblRelatorioLivro.addMouseListener(this);
        this.menu.lblRelatorioLeitor.addMouseListener(this);
        this.menu.lblSobre.addMouseListener(this);
        this.menu.lblConfiguracoes.addMouseListener(this); 
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if(e.getSource() == menu.lblSair){
            menu.panelSair.setBackground(new Color(29,120,174));
            menu.lblSair.setForeground(new Color(18,45,61));
        }      
        else if(e.getSource() == menu.lblRetiradaLivro){
            menu.panelRetiradaLivro.setBackground(new Color(29,120,174));
            menu.lblRetiradaLivro.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblCadastroLivro){
            menu.panelCadastroLivro.setBackground(new Color(29,120,174));
            menu.lblCadastroLivro.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblDevRenov){
            menu.panelDevolucaoRenovacao.setBackground(new Color(29,120,174));
            menu.lblDevRenov.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblCadastro){
            menu.panelCadastroLeitor.setBackground(new Color(29,120,174));
            menu.lblCadastro.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblRelatorioLivro){
            menu.panelRelatorioLivros.setBackground(new Color(29,120,174));
            menu.lblRelatorioLivro.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblRelatorioLeitor){
            menu.panelRelatorioLeitor.setBackground(new Color(29,120,174));
            menu.lblRelatorioLeitor.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblSobre){
            menu.panelSobre.setBackground(new Color(29,120,174));
            menu.lblSobre.setForeground(new Color(18,45,61));
        }else if(e.getSource() == menu.lblConfiguracoes){
            menu.panelConfiguracoes.setBackground(new Color(29,120,174));
            menu.lblConfiguracoes.setForeground(new Color(18,45,61));
        }
    }
    
    

    @Override
    public void mouseExited(MouseEvent e) {
        
        if(e.getSource() == menu.lblSair){
            menu.panelSair.setBackground(new Color(18,45,61));
            menu.lblSair.setForeground(new Color(255,255,255));
        }      
        else if(e.getSource() == menu.lblRetiradaLivro){
            menu.panelRetiradaLivro.setBackground(new Color(18,45,61));
            menu.lblRetiradaLivro.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblCadastroLivro){
            menu.panelCadastroLivro.setBackground(new Color(18,45,61));
            menu.lblCadastroLivro.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblDevRenov){
            menu.panelDevolucaoRenovacao.setBackground(new Color(18,45,61));
            menu.lblDevRenov.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblCadastro){
            menu.panelCadastroLeitor.setBackground(new Color(18,45,61));
            menu.lblCadastro.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblRelatorioLivro){
            menu.panelRelatorioLivros.setBackground(new Color(18,45,61));
            menu.lblRelatorioLivro.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblRelatorioLeitor){
            menu.panelRelatorioLeitor.setBackground(new Color(18,45,61));
            menu.lblRelatorioLeitor.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblSobre){
            menu.panelSobre.setBackground(new Color(18,45,61));
            menu.lblSobre.setForeground(new Color(255,255,255));
        }else if(e.getSource() == menu.lblConfiguracoes){
            menu.panelConfiguracoes.setBackground(new Color(18,45,61));
            menu.lblConfiguracoes.setForeground(new Color(255,255,255));
        }
    }   
}
