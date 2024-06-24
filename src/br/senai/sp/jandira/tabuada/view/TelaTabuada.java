package br.senai.sp.jandira.tabuada.view;

import br.senai.sp.jandira.tabuada.domain.CalculoTabuada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaTabuada {
    CalculoTabuada calculoTabuada = new CalculoTabuada();


    private CustomPanel painelTitulo = new CustomPanel("../images/painelTabuada.png");
    private JPanel painelBranco = new JPanel();
    private JLabel lblTitulo = new JLabel("T A B U A D A");

    private JPanel painelOpcoes = new JPanel();

    private JPanel painelDelimitacao1 = new JPanel();
    private JPanel painelDelimitacao2 = new JPanel();
    private JPanel painelDelimitacao3 = new JPanel();
    private JPanel painelDelimitacao4 = new JPanel();

    private JLabel lblMultiplicando = new JLabel("Multiplicando:");
    private JTextField txtMultiplicando = new JTextField();

    private JLabel lblMinMultiplicador = new JLabel("Mínimo multiplicador:");
    private JTextField txtMinMultiplicador = new JTextField();

    private JLabel lblMaxMultiplicador = new JLabel("Máximo multiplicador:");
    private JTextField txtMaxMultiplicador = new JTextField();

    private JTextArea txtAreaTabuada1 = new JTextArea();
    private JTextArea txtAreaTabuada2 = new JTextArea();
    private JTextArea txtAreaTabuada3 = new JTextArea();
    private JTextArea txtAreaTabuada4 = new JTextArea();
    private JTextArea txtAreaTabuada5 = new JTextArea();

    private JButton botaoCalc = new JButton("Calcular");
    private JButton botaoReset = new JButton("Resetar");

    private String imagePath = "../images/";
    private Icon iconBotaoCalc = new ImageIcon(getClass().getResource(imagePath + "calc2.png"));
    private Icon iconBotaoReset = new ImageIcon(getClass().getResource(imagePath + "restart24.png"));
    ImageIcon iconTela = new ImageIcon(getClass().getResource(imagePath + "iconApp.png"));

    public TelaTabuada() {
        criarTela();
    }

    public void criarTela() {
        JFrame tela = new JFrame();

        tela.setTitle("Calculadora Tabuada");
        tela.setSize(550, 640);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        painelTitulo.setBounds(0, 0, 534, 120);
        painelTitulo.setBackground(new Color(144, 238, 114));
        painelTitulo.setLayout(null);

        lblTitulo.setBounds(1, 0, 150, 50);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);

        painelBranco.setBounds(190, 30, 150, 50);
        painelBranco.setForeground(Color.WHITE);
        painelBranco.setLayout(null);
        painelBranco.add(lblTitulo);

        painelOpcoes.setBounds(0, 412, 534, 220);
        painelOpcoes.setBackground(new Color(144, 238, 114));
        painelOpcoes.setLayout(null);

        painelDelimitacao1.setBounds(0, 117, 534, 5);
        painelDelimitacao1.setBackground(Color.BLACK);
        painelDelimitacao1.setLayout(null);

        painelDelimitacao2.setBounds(0, 410, 534, 2);
        painelDelimitacao2.setBackground(Color.BLACK);
        painelDelimitacao2.setLayout(null);

        painelDelimitacao3.setBounds(0, 117, 3, 295);
        painelDelimitacao3.setBackground(Color.BLACK);
        painelDelimitacao3.setLayout(null);

        painelDelimitacao4.setBounds(531, 117, 5, 295);
        painelDelimitacao4.setBackground(Color.BLACK);
        painelDelimitacao4.setLayout(null);

        lblMultiplicando.setBounds(40, 440, 200, 30);
        txtMultiplicando.setBounds(165, 440, 100, 30);
        lblMultiplicando.setFont(new Font("Arial", Font.BOLD, 15));

        lblMinMultiplicador.setBounds(10, 490, 200, 30);
        txtMinMultiplicador.setBounds(165, 490, 100, 30);
        lblMinMultiplicador.setFont(new Font("Arial", Font.BOLD, 15));

        lblMaxMultiplicador.setBounds(10, 540, 200, 30);
        txtMaxMultiplicador.setBounds(165, 540, 100, 30);
        lblMaxMultiplicador.setFont(new Font("Arial", Font.BOLD, 15));

        txtAreaTabuada1.setBounds(3, 123, 106, 287);
        txtAreaTabuada1.setEditable(false);
        txtAreaTabuada1.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAreaTabuada1.setLineWrap(true);

        txtAreaTabuada2.setBounds(110, 123, 106, 287);
        txtAreaTabuada2.setEditable(false);
        txtAreaTabuada2.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAreaTabuada2.setLineWrap(true);

        txtAreaTabuada3.setBounds(217, 123, 106, 287);
        txtAreaTabuada3.setEditable(false);
        txtAreaTabuada3.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAreaTabuada3.setLineWrap(true);

        txtAreaTabuada4.setBounds(324, 123, 106, 287);
        txtAreaTabuada4.setEditable(false);
        txtAreaTabuada4.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAreaTabuada4.setLineWrap(true);

        txtAreaTabuada5.setBounds(431, 123, 100, 287);
        txtAreaTabuada5.setEditable(false);
        txtAreaTabuada5.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAreaTabuada5.setLineWrap(true);

        botaoCalc.setBounds(300, 465, 150, 30);
        botaoCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTabuada();
            }
        });
        botaoCalc.setIcon(iconBotaoCalc);

        botaoReset.setBounds(300, 515, 150, 30);
        botaoReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });
        botaoReset.setIcon(iconBotaoReset);

        tela.setIconImage(iconTela.getImage());
        tela.getContentPane().add(painelBranco);
        tela.getContentPane().add(painelTitulo);
        tela.getContentPane().add(painelDelimitacao1);
        tela.getContentPane().add(painelDelimitacao2);
        tela.getContentPane().add(painelDelimitacao3);
        tela.getContentPane().add(painelDelimitacao4);
        tela.getContentPane().add(lblMultiplicando);
        tela.getContentPane().add(txtMultiplicando);
        tela.getContentPane().add(lblMinMultiplicador);
        tela.getContentPane().add(txtMinMultiplicador);
        tela.getContentPane().add(lblMaxMultiplicador);
        tela.getContentPane().add(txtMaxMultiplicador);
        tela.getContentPane().add(botaoCalc);
        tela.getContentPane().add(botaoReset);
        tela.getContentPane().add(painelOpcoes);
        tela.getContentPane().add(txtAreaTabuada1);
        tela.getContentPane().add(txtAreaTabuada2);
        tela.getContentPane().add(txtAreaTabuada3);
        tela.getContentPane().add(txtAreaTabuada4);
        tela.getContentPane().add(txtAreaTabuada5);

        tela.setVisible(true);
    }

    private void limparTela() {
        txtMultiplicando.setText("");
        txtMaxMultiplicador.setText("");
        txtAreaTabuada1.setText("");
        txtAreaTabuada2.setText("");
        txtAreaTabuada3.setText("");
        txtAreaTabuada4.setText("");
        txtAreaTabuada5.setText("");
        txtMinMultiplicador.setText("");
        txtMultiplicando.requestFocus();
    }

    private void calcularTabuada() {
        try {
            int multiplicando = Integer.parseInt(txtMultiplicando.getText());
            int minMultiplicador = Integer.parseInt(txtMinMultiplicador.getText());
            int maxMultiplicador = Integer.parseInt(txtMaxMultiplicador.getText());
            int contador = 0;

            calculoTabuada.setMultiplicando(multiplicando);
            calculoTabuada.setMinimoMultiplicador(minMultiplicador);
            calculoTabuada.setMaximoMultiplicador(maxMultiplicador);

            List<String> linhasTabuada = calculoTabuada.calcularTabuada();
            txtAreaTabuada1.setText("");

            for (String linha : linhasTabuada) {
                if (contador < 20) {
                    txtAreaTabuada1.append(linha + "\n");
                    contador++;
                } else if (contador < 40) {
                    txtAreaTabuada2.append(linha + "\n");
                    contador++;
                } else if (contador < 60) {
                    txtAreaTabuada3.append(linha + "\n");
                    contador++;
                } else if (contador < 80) {
                    txtAreaTabuada4.append(linha + "\n");
                    contador++;
                } else if (contador < 100) {
                    txtAreaTabuada5.append(linha + "\n");
                    contador++;
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Insira um valor válido!",
                    "Erro de entrada",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}