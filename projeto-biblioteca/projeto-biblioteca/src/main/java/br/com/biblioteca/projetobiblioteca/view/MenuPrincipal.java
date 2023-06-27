package br.com.biblioteca.projetobiblioteca.view;

import br.com.biblioteca.projetobiblioteca.view.controles.SettinsController;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        
        setSize(1210, 780);
        setResizable(false);
        setTitle("Menu da Aplicação");
        setLocationRelativeTo(null);
                
        //controle de configurações
        SettinsController settinsController = new SettinsController(this);
        
        this.repaint();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelDevolucaoRenovacao = new javax.swing.JPanel();
        lblDevRenov = new javax.swing.JLabel();
        panelRetiradaLivro = new javax.swing.JPanel();
        lblRetiradaLivro = new javax.swing.JLabel();
        panelCadastroLivro = new javax.swing.JPanel();
        lblCadastroLivro = new javax.swing.JLabel();
        panelRelatorioLivros = new javax.swing.JPanel();
        lblRelatorioLivro = new javax.swing.JLabel();
        panelRelatorioLeitor = new javax.swing.JPanel();
        lblRelatorioLeitor = new javax.swing.JLabel();
        panelSobre = new javax.swing.JPanel();
        lblSobre = new javax.swing.JLabel();
        panelCadastroLeitor = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        panelConfiguracoes = new javax.swing.JPanel();
        lblConfiguracoes = new javax.swing.JLabel();
        panelSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 45, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDevolucaoRenovacao.setBackground(new java.awt.Color(18, 45, 61));

        lblDevRenov.setBackground(new java.awt.Color(18, 45, 61));
        lblDevRenov.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDevRenov.setForeground(new java.awt.Color(255, 255, 255));
        lblDevRenov.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDevRenov.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_devolucao.png")); // NOI18N
        lblDevRenov.setText("  Devolução/Renovação");

        javax.swing.GroupLayout panelDevolucaoRenovacaoLayout = new javax.swing.GroupLayout(panelDevolucaoRenovacao);
        panelDevolucaoRenovacao.setLayout(panelDevolucaoRenovacaoLayout);
        panelDevolucaoRenovacaoLayout.setHorizontalGroup(
            panelDevolucaoRenovacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDevolucaoRenovacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDevRenov, javax.swing.GroupLayout.PREFERRED_SIZE, 188, Short.MAX_VALUE))
        );
        panelDevolucaoRenovacaoLayout.setVerticalGroup(
            panelDevolucaoRenovacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDevRenov, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelDevolucaoRenovacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 35));

        panelRetiradaLivro.setBackground(new java.awt.Color(18, 45, 61));

        lblRetiradaLivro.setBackground(new java.awt.Color(18, 45, 61));
        lblRetiradaLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRetiradaLivro.setForeground(new java.awt.Color(255, 255, 255));
        lblRetiradaLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRetiradaLivro.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_retirada_livro.png")); // NOI18N
        lblRetiradaLivro.setText("   Retirada de Livro");

        javax.swing.GroupLayout panelRetiradaLivroLayout = new javax.swing.GroupLayout(panelRetiradaLivro);
        panelRetiradaLivro.setLayout(panelRetiradaLivroLayout);
        panelRetiradaLivroLayout.setHorizontalGroup(
            panelRetiradaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRetiradaLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRetiradaLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelRetiradaLivroLayout.setVerticalGroup(
            panelRetiradaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRetiradaLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelRetiradaLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 35));

        panelCadastroLivro.setBackground(new java.awt.Color(18, 45, 61));

        lblCadastroLivro.setBackground(new java.awt.Color(18, 45, 61));
        lblCadastroLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCadastroLivro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCadastroLivro.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_add_livro.png")); // NOI18N
        lblCadastroLivro.setText("  Cadastro de Livro");

        javax.swing.GroupLayout panelCadastroLivroLayout = new javax.swing.GroupLayout(panelCadastroLivro);
        panelCadastroLivro.setLayout(panelCadastroLivroLayout);
        panelCadastroLivroLayout.setHorizontalGroup(
            panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelCadastroLivroLayout.setVerticalGroup(
            panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelCadastroLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 35));

        panelRelatorioLivros.setBackground(new java.awt.Color(18, 45, 61));

        lblRelatorioLivro.setBackground(new java.awt.Color(18, 45, 61));
        lblRelatorioLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRelatorioLivro.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorioLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRelatorioLivro.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_pesquisar_livro.png")); // NOI18N
        lblRelatorioLivro.setText("  Relatório de Livros");

        javax.swing.GroupLayout panelRelatorioLivrosLayout = new javax.swing.GroupLayout(panelRelatorioLivros);
        panelRelatorioLivros.setLayout(panelRelatorioLivrosLayout);
        panelRelatorioLivrosLayout.setHorizontalGroup(
            panelRelatorioLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRelatorioLivrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelRelatorioLivrosLayout.setVerticalGroup(
            panelRelatorioLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRelatorioLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelRelatorioLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 35));

        panelRelatorioLeitor.setBackground(new java.awt.Color(18, 45, 61));

        lblRelatorioLeitor.setBackground(new java.awt.Color(18, 45, 61));
        lblRelatorioLeitor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRelatorioLeitor.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorioLeitor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRelatorioLeitor.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_pesquisar_leitor.png")); // NOI18N
        lblRelatorioLeitor.setText("  Relatório Leitores");

        javax.swing.GroupLayout panelRelatorioLeitorLayout = new javax.swing.GroupLayout(panelRelatorioLeitor);
        panelRelatorioLeitor.setLayout(panelRelatorioLeitorLayout);
        panelRelatorioLeitorLayout.setHorizontalGroup(
            panelRelatorioLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRelatorioLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelRelatorioLeitorLayout.setVerticalGroup(
            panelRelatorioLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRelatorioLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelRelatorioLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 35));

        panelSobre.setBackground(new java.awt.Color(18, 45, 61));

        lblSobre.setBackground(new java.awt.Color(18, 45, 61));
        lblSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSobre.setForeground(new java.awt.Color(255, 255, 255));
        lblSobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSobre.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_sobre.png")); // NOI18N
        lblSobre.setText("  Sobre a aplicação");

        javax.swing.GroupLayout panelSobreLayout = new javax.swing.GroupLayout(panelSobre);
        panelSobre.setLayout(panelSobreLayout);
        panelSobreLayout.setHorizontalGroup(
            panelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSobre, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelSobreLayout.setVerticalGroup(
            panelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSobre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 35));

        panelCadastroLeitor.setBackground(new java.awt.Color(18, 45, 61));

        lblCadastro.setBackground(new java.awt.Color(18, 45, 61));
        lblCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCadastro.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_add_leitor.png")); // NOI18N
        lblCadastro.setText("  Cadastro de Leitor");

        javax.swing.GroupLayout panelCadastroLeitorLayout = new javax.swing.GroupLayout(panelCadastroLeitor);
        panelCadastroLeitor.setLayout(panelCadastroLeitorLayout);
        panelCadastroLeitorLayout.setHorizontalGroup(
            panelCadastroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelCadastroLeitorLayout.setVerticalGroup(
            panelCadastroLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelCadastroLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 35));

        panelConfiguracoes.setBackground(new java.awt.Color(18, 45, 61));

        lblConfiguracoes.setBackground(new java.awt.Color(18, 45, 61));
        lblConfiguracoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfiguracoes.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConfiguracoes.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_configuracoes.png")); // NOI18N
        lblConfiguracoes.setText("  Configurações");

        javax.swing.GroupLayout panelConfiguracoesLayout = new javax.swing.GroupLayout(panelConfiguracoes);
        panelConfiguracoes.setLayout(panelConfiguracoesLayout);
        panelConfiguracoesLayout.setHorizontalGroup(
            panelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelConfiguracoesLayout.setVerticalGroup(
            panelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 35));

        panelSair.setBackground(new java.awt.Color(18, 45, 61));

        lblSair.setBackground(new java.awt.Color(18, 45, 61));
        lblSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSair.setIcon(new javax.swing.ImageIcon("D:\\Repositorio_projetos\\biblioteca\\projeto-biblioteca\\projeto-biblioteca\\projeto-biblioteca\\src\\main\\java\\br\\com\\biblioteca\\projetobiblioteca\\imagens\\icone_sair_aplicacao.png")); // NOI18N
        lblSair.setText("  Sair");

        javax.swing.GroupLayout panelSairLayout = new javax.swing.GroupLayout(panelSair);
        panelSair.setLayout(panelSairLayout);
        panelSairLayout.setHorizontalGroup(
            panelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        panelSairLayout.setVerticalGroup(
            panelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(panelSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 200, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 560));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel3.setBackground(new java.awt.Color(18, 45, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(18, 45, 61));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA BIBLIOTECA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        jPanel6.setBackground(new java.awt.Color(156, 183, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Informações do Livro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel2.setText("Nome do Livro:");

        txtNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLivroActionPerformed(evt);
            }
        });

        jLabel3.setText("Editora: ");

        jLabel4.setText("Autor(a): ");

        jLabel5.setText("Ano de lançamento: ");

        jLabel6.setText("Gênero:  ");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...." }));

        jLabel7.setText("Quantidade de Páginas: ");

        jLabel8.setText("ISBN: ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtEditora))
                .addGap(69, 69, 69)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 930, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Localização", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Corredor: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Pratilheira:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Informações específicas: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 930, 180));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Limpar Campos");
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 160, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Salvar ");
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 160, 30));

        jTabbedPane1.addTab("Registro de Livros", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Devolução/Renovação", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cadastro de Leitores", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Relatório de Livros", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Relatório de Leitor", jPanel10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sobre", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configurações", jPanel12);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Retirada de Livros", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JLabel lblCadastro;
    public javax.swing.JLabel lblCadastroLivro;
    public javax.swing.JLabel lblConfiguracoes;
    public javax.swing.JLabel lblDevRenov;
    public javax.swing.JLabel lblRelatorioLeitor;
    public javax.swing.JLabel lblRelatorioLivro;
    public javax.swing.JLabel lblRetiradaLivro;
    public javax.swing.JLabel lblSair;
    public javax.swing.JLabel lblSobre;
    public javax.swing.JPanel panelCadastroLeitor;
    public javax.swing.JPanel panelCadastroLivro;
    public javax.swing.JPanel panelConfiguracoes;
    public javax.swing.JPanel panelDevolucaoRenovacao;
    public javax.swing.JPanel panelRelatorioLeitor;
    public javax.swing.JPanel panelRelatorioLivros;
    public javax.swing.JPanel panelRetiradaLivro;
    public javax.swing.JPanel panelSair;
    public javax.swing.JPanel panelSobre;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtNomeLivro;
    private javax.swing.JTextField txtPaginas;
    // End of variables declaration//GEN-END:variables
}
