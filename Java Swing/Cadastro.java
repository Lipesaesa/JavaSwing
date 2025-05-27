import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Cadastro extends JFrame {

    private JPanel painelzao;

    public Cadastro() {
        super("Cadastro de Pessoa");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        painelzao = new JPanel();
        painelzao.setLayout(null);
        painelzao.setBackground(new Color(240, 240, 240));
        painelzao.setBounds(0, 0, 800, 450);
        add(painelzao);

        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(new Color(255, 153, 0));
        titulo.setBounds(250, 10, 300, 30);
        painelzao.add(titulo);

        JComboBox comboTipo = new JComboBox(new String[]{"Física", "Jurídica"});
        comboTipo.setBounds(90, 60, 100, 25);
        painelzao.add(new JLabel("Tipo")).setBounds(50, 60, 40, 25);
        painelzao.add(comboTipo);

        JTextField txtCpfCnpj = new JTextField();
        painelzao.add(new JLabel("CPF / CNPJ")).setBounds(200, 60, 80, 25);
        txtCpfCnpj.setBounds(280, 60, 150, 25);
        painelzao.add(txtCpfCnpj);

        JCheckBox chkFornecedor = new JCheckBox("Fornecedor");
        chkFornecedor.setBackground(new Color(240, 240, 240));
        chkFornecedor.setBounds(450, 60, 120, 25);
        painelzao.add(chkFornecedor);

        painelzao.add(new JLabel("Nome")).setBounds(50, 90, 50, 25);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(125, 90, 600, 25);
        painelzao.add(txtNome);

        painelzao.add(new JLabel("RG / Inscrição Estadual")).setBounds(50, 120, 150, 25);
        JTextField txtRg = new JTextField();
        txtRg.setBounds(200, 120, 150, 25);
        painelzao.add(txtRg);

        painelzao.add(new JLabel("Órgão Expedidor")).setBounds(370, 120, 120, 25);
        JTextField txtOrgao = new JTextField();
        txtOrgao.setBounds(490, 120, 180, 25);
        painelzao.add(txtOrgao);

        painelzao.add(new JLabel("Email")).setBounds(50, 150, 50, 25);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(90, 150, 200, 25);
        painelzao.add(txtEmail);

        painelzao.add(new JLabel("CEP")).setBounds(300, 150, 40, 25);
        JTextField txtCep = new JTextField();
        txtCep.setBounds(340, 150, 100, 25);
        painelzao.add(txtCep);

        painelzao.add(new JLabel("País")).setBounds(450, 150, 40, 25);
        JTextField txtPais = new JTextField("BRASIL");
        txtPais.setBounds(490, 150, 80, 25);
        painelzao.add(txtPais);

        painelzao.add(new JLabel("UF")).setBounds(580, 150, 30, 25);
        JComboBox comboUf = new JComboBox(new String[]{"SP", "RJ", "MG"});
        comboUf.setBounds(610, 150, 60, 25);
        painelzao.add(comboUf);

        painelzao.add(new JLabel("Município")).setBounds(680, 150, 70, 25);
        JTextField txtMunicipio = new JTextField();
        txtMunicipio.setBounds(750, 150, 100, 25);
        painelzao.add(txtMunicipio);

        painelzao.add(new JLabel("Logradouro")).setBounds(50, 180, 80, 25);
        JTextField txtLogradouro = new JTextField();
        txtLogradouro.setBounds(130, 180, 200, 25);
        painelzao.add(txtLogradouro);

        painelzao.add(new JLabel("Número")).setBounds(340, 180, 60, 25);
        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(400, 180, 50, 25);
        painelzao.add(txtNumero);

        painelzao.add(new JLabel("Complemento")).setBounds(460, 180, 100, 25);
        JTextField txtComp = new JTextField();
        txtComp.setBounds(560, 180, 200, 25);
        painelzao.add(txtComp);

        painelzao.add(new JLabel("Bairro")).setBounds(50, 210, 50, 25);
        JTextField txtBairro = new JTextField();
        txtBairro.setBounds(100, 210, 200, 25);
        painelzao.add(txtBairro);

        painelzao.add(new JLabel("Telefone")).setBounds(310, 210, 60, 25);
        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(370, 210, 150, 25);
        painelzao.add(txtTelefone);

        painelzao.add(new JLabel("Situação")).setBounds(540, 210, 60, 25);
        JRadioButton radioAtivo = new JRadioButton("Ativo");
        JRadioButton radioInativo = new JRadioButton("Inativo");
        radioAtivo.setBounds(600, 210, 60, 25);
        radioInativo.setBounds(660, 210, 80, 25);
        radioAtivo.setBackground(new Color(240, 240, 240));
        radioInativo.setBackground(new Color(240, 240, 240));
        painelzao.add(radioAtivo);
        painelzao.add(radioInativo);
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(radioAtivo);
        grupoRadio.add(radioInativo);


        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(230, 270, 100, 30);
        estilizaBotao(btnConfirmar);
        painelzao.add(btnConfirmar);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(340, 270, 100, 30);
        estilizaBotao(btnExcluir);
        painelzao.add(btnExcluir);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(450, 270, 100, 30);
        estilizaBotao(btnLimpar);
        painelzao.add(btnLimpar);

        ArrayList<JTextField> campos = new ArrayList<>();
        campos.add(txtNome); campos.add(txtCpfCnpj); campos.add(txtRg); campos.add(txtOrgao);
        campos.add(txtEmail); campos.add(txtCep); campos.add(txtPais); campos.add(txtMunicipio);
        campos.add(txtLogradouro); campos.add(txtNumero); campos.add(txtComp);
        campos.add(txtBairro); campos.add(txtTelefone);

        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String email = txtEmail.getText();
                String cpf = txtCpfCnpj.getText();
                JOptionPane.showMessageDialog(null,
                        "Dados confirmados:\nNome: " + nome + "\nEmail: " + email + "\nCPF/CNPJ: " + cpf);
            }
        });

        ActionListener limpar = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (JTextField c : campos) c.setText("");
                grupoRadio.clearSelection();
                comboTipo.setSelectedIndex(0);
                comboUf.setSelectedIndex(0);
                chkFornecedor.setSelected(false);
            }
        };

        btnExcluir.addActionListener(limpar);
        btnLimpar.addActionListener(limpar);

        setVisible(true);
    }

    private void estilizaBotao(JButton btn) {
        btn.setFocusPainted(false);
        btn.setBackground(new Color(224, 224, 224));
        btn.setFont(new Font("Arial", Font.BOLD, 12));
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public static void main(String[] args) {
        new Cadastro();
    }
}
